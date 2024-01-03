public class Wilder {
    private String firstname;
    private boolean aware;

    // Constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // Getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // Method to describe the Wilder
    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
    }
}