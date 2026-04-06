public class HelloSubstring {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = "";
            for (String name : args) {
                greeting += name + ", ";
            }
            greeting = greeting.substring(0, greeting.length() - 2);
            System.out.println("Hello, " + greeting + "!");
        }
    }
}