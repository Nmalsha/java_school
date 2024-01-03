public class Classroom {
    public static void main(String[] args) {
        // Create instances of Wilder
        Wilder wilder1 = new Wilder("Jean-Claude", true);
        Wilder wilder2 = new Wilder("Henri", false);

        // Display information using whoAmI method
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
