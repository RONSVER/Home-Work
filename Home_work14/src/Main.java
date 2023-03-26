public class Main {
    public static void main(String[] args) {
        String s = concat("a", "f", "r", "-");
        System.out.println(s);
    }

    private static String concat(String s1, String s2, String s3, String delimiter) {
        return s1 + delimiter + s2 + delimiter + s3;
    }
}