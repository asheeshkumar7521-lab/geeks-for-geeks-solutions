import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }

        System.out.print(greatest);
    }
}