public class Main {
    public static void main(String[] args) {
        String str = "I study Basic Java!";
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.charAt(18));
        System.out.println(str.contains("Java"));

        System.out.println(str.replace("a" , "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.print(str.substring(0,14));
        System.out.print(str.substring(18));

    }
}