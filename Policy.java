package setInterfaceOperations;

import java.time.LocalDate;

public class Policy implements Comparable<Policy>
{
    private String policyNumber;
    String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    long premiumAmount;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, long premiumAmount)
    {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other ) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString()
    {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}