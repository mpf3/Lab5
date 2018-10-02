/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**Account types.*/
    public enum BankAccountType {
        /**checking.*/
        CHECKINGS,
        /**savings.*/
        SAVINGS,
        /**student.*/
        STUDENT,
        /**workplace.*/
        WORKPLACE
    }

    /**account number.*/
    private int accountNumber;
    /**account type.*/
    private BankAccountType accountType;
    /**account balance.*/
    private double accountBalance;
    /**owner's name.*/
    private String ownerName;
    /**interest rate. Not implemented*/
    private double interestRate;
    /**total interest earned. Not implemented*/
    private double interestEarned;

    /**Creates bank account.
     * @param name Owner's name
     * @param accountCategory category of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        Bank.addAccount();
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**Gets account number.
     * @return account number*/
    public int getAccountNumber() {
        return accountNumber;
    }

    /**Gets account type.
     * @return account type*/
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**Gets account balance.
     * @return account balance*/
    public double getAccountBalance() {
        return accountBalance;
    }

    /**Sets account balance.
     * @param bal = new balance*/
    public void setAccountBalance(final double bal) {
        accountBalance = bal;
    }

    /**Gets owner name.
     * @return owner name*/
    public String getOwnerName() {
        return ownerName;
    }

    /**Sets owner name.
     * @param name new owner name*/
    public void setOwnerName(final String name) {
        ownerName = name;
    }

    /**Gets interest rate.
     * @return interest rate*/
    public double getInterestRate() {
        return interestRate;
    }

    /**Gets interest earned.
     * @return interest earned*/
    public double getInterestEarned() {
        return interestEarned;
    }
}
