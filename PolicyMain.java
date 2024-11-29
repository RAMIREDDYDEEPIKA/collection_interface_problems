package setInterfaceOperations;

import java.time.LocalDate;

public class PolicyMain
{
    public static void main(String[] args)
    {
        PolicyManager details = new PolicyManager();
        details.addPolicy(new Policy("1", "Deepika", LocalDate.now().plusDays(10), "Health", 1000));
        details.addPolicy(new Policy("2","lakshmi",LocalDate.now().plusDays(20),"Auto",4000));
        details.addPolicy(new Policy("3","Usha",LocalDate.now().plusDays(20),"Home",9000));
        details.addPolicy(new Policy("3","Usha",LocalDate.now().plusDays(20),"Home",9000));

        System.out.println("All unique policies");
        details.getAllUniquePolicies();

        details.getPoliciesExpiringSoon();

        System.out.println("By coverage type");
        details.getPoliciesByCoverage("Home");

        System.out.println("Finding duplicate policies : ");
        details.findDuplicatePolicies();

        System.out.println("By compare policies");
        details.comparePolicies(3);
    }
}