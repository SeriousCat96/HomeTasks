package home1;

public class Main {
    public static void main(String[] args) {
        printSequence(8);
        printRecursive(8);
        System.out.println(reverseStr("Hello, world!"));
    }

    public static void printSequence(int n)
    {
        for (int i = 0; i <= n; i++)
            System.out.print((int)Math.pow(2, n - i) + " ");

        System.out.println();
    }

    public static void printRecursive(int n)
    {
        if (n == 0) {
            System.out.println(1);
        }
        else {
            System.out.print((int)Math.pow(2, n) + " ");
            printRecursive(n - 1);
        }
    }

    public static String reverseStr(String str)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
            sb.append(str.charAt(str.length() - i - 1));

        return sb.toString();
    }
}
