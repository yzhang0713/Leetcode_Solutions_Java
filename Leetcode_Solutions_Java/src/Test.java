public class Test {

    private int count;

    public static int gcd(int a, int b) {
//        if (a < b) {
//            return gcd_recursion(b, a);
//        }
//        return gcd_recursion(a, b);

        return (a < b) ? gcd_recursion(b, a) : gcd_recursion(a, b);
    }

    private static int gcd_recursion(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return gcd_recursion(b, a%b);
    }
}