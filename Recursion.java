public class Recursion {
    public static int sum(int n, int a, int d) {
        if (n == 1) {
            return a;
        } else {
            return d + sum(n - 1, a, d);
        }
    }

    public static void main(String[] args) {
        int num = sum(3, 2, 6);
        System.out.print(num);
    }
}