package mapInterface;

import java.time.LocalDate;
import java.util.*;

class Policy
{
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Double.compare(premiumAmount, policy.premiumAmount) == 0 && Objects.equals(policyNumber, policy.policyNumber) && Objects.equals(policyholderName, policy.policyholderName) && Objects.equals(expiryDate, policy.expiryDate) && Objects.equals(coverageType, policy.coverageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber, policyholderName, expiryDate, coverageType, premiumAmount);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

class PolicyManager
{
    Map<String,Policy> hashMapPolicies=new HashMap<>();
    Map<String,Policy> linkedHashMapPolicies=new LinkedHashMap<>();
    Map<LocalDate,Policy> treeMapPolicies=new TreeMap<>();

    public void addPolicy(Policy policy){
        hashMapPolicies.put(policy.policyNumber,policy);
        linkedHashMapPolicies.put(policy.policyNumber,policy);
        treeMapPolicies.put(policy.expiryDate,policy);
    }

    public void getPolicyByNUmber(String policyNumber)
    {
        System.out.println(hashMapPolicies.get(policyNumber));
    }

    public void getPoliciesByExpiringSoon()
    {
        LocalDate today = LocalDate.now();
        LocalDate thresholdDate = today.plusDays(30);
        ArrayList<String> expiringSoonPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, Policy> entry : treeMapPolicies.entrySet())
        {
            if (entry.getKey().isBefore(thresholdDate)) {
                expiringSoonPolicies.add(String.valueOf(entry.getValue()));
            }
        }
        System.out.println("Policies Expiring Soon: " + expiringSoonPolicies);
        System.out.println();
    }

    public void getPoliciesByPolicyHolder(String policyholderName)
    {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : linkedHashMapPolicies.values())
        {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        System.out.println(policies);
    }

    public void removeExpiredPolicies()
    {
        LocalDate today = LocalDate.now();
        List<LocalDate> expiredKeys = new ArrayList<>(treeMapPolicies.keySet());
        for (LocalDate key : expiredKeys) {
            treeMapPolicies.remove(key);
        }
        hashMapPolicies.values().removeIf(policy -> policy.expiryDate.isBefore(today));
        linkedHashMapPolicies.values().removeIf(policy -> policy.expiryDate.isBefore(today));
    }

    public void comparePerformance()
    {
        int range=10000;
        double startTime=0,endTime=0;
        startTime=System.nanoTime();
        for(int i=0;i<range;i++){
            hashMapPolicies.get("hash map test");
        }
        endTime=System.nanoTime();
        System.out.println("Hash map retrieval time : "+(endTime-startTime)/range+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<range;i++){
            linkedHashMapPolicies.get("linked ahsh map test");
        }
        endTime=System.nanoTime();
        System.out.println("linkedhashmap retrival time : "+(endTime-startTime)/range+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<range;i++){
            treeMapPolicies.get("treemap test");
        }
        endTime=System.nanoTime();
        System.out.println("Treemap retrival time : "+(endTime-startTime)/range+" ns");
    }
}

public class PolicyMain
{
    public static void main(String[] args)
    {
        PolicyManager policyManager=new PolicyManager();
        Policy p1=new Policy("1","Deepika",LocalDate.of(2020,01,20),"House",500000);
        Policy p2=new Policy("2","Usha",LocalDate.of(2024,3,25),"Scooty",20000);
        Policy p3=new Policy("3","lakshmi",LocalDate.of(2022,7,22),"Auto",300000);
        Policy p4=new Policy("4","Nisha",LocalDate.of(2021,8,28),"Bus",40000);
        policyManager.addPolicy(p4);
        policyManager.addPolicy(p3);
        policyManager.addPolicy(p2);
        policyManager.addPolicy(p1);

        System.out.println("Getting policy by number");
        policyManager.getPolicyByNUmber("2");
        System.out.println("getting policies byholder name");
        policyManager.getPoliciesByPolicyHolder("Nisha");
        System.out.println("getting policies expiring soon");
        policyManager.getPoliciesByExpiringSoon();
        System.out.println("removed expiring policies");
        policyManager.removeExpiredPolicies();
        System.out.println("comparing performance");
        policyManager.comparePerformance();
    }
}