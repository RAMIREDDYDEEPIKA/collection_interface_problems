package setInterfaceOperations;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager
{
    Set<Policy> hashsetPolicy=new HashSet<>();
    Set<Policy> linkedhashsetPolicy=new LinkedHashSet<>();
    Set<Policy> treesetPolicy=new TreeSet<>();

    public void addPolicy(Policy policy)
    {
        hashsetPolicy.add(policy);
        linkedhashsetPolicy.add(policy);
        treesetPolicy.add(policy);
    }

    public void getAllUniquePolicies()
    {
        for(Policy policy:linkedhashsetPolicy){
            System.out.println(policy);
        }
    }

    public void getPoliciesExpiringSoon()
    {
        LocalDate now = LocalDate.now();
        System.out.println("Policies Expiring Soon:");
        for (Policy policy : treesetPolicy) {
            if (policy.getExpiryDate().isBefore(now.plusDays(30))) {
                System.out.println(policy);
            }
        }
    }

    public void getPoliciesByCoverage(String coverageType)
    {
        for (Policy policy : hashsetPolicy) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies()
    {
        Set<String> seenPolicyNumbers = new HashSet<>();
        for (Policy policy : hashsetPolicy)
        {
            if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
                System.out.println(policy);
            }
        }
    }

    public void comparePolicies(int n){
        long startTime=0,endTime=0;

        startTime=System.nanoTime();
        for(int i=0;i<n;i++){
            addPolicy(new Policy("H" + i, "Policyholder " + i, LocalDate.now().plusDays(i), "Health", 100 + i));
        }
        endTime=System.nanoTime();
        System.out.println("Hash set testing "+(endTime-startTime)+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<n;i++){
            addPolicy(new Policy("L" + i, "Policyholder " + i, LocalDate.now().plusDays(i), "Health", 100 + i));
        }
        endTime=System.nanoTime();
        System.out.println("linked hash set "+(endTime-startTime)+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<n;i++){
            addPolicy(new Policy("T" + i, "Policyholder " + i, LocalDate.now().plusDays(i), "Health", 100 + i));
        }
        endTime=System.nanoTime();
        System.out.println("tree set "+(endTime-startTime)+ " ns");
    }
}