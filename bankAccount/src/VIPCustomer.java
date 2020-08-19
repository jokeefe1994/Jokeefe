public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default name", 50000, "Default@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
