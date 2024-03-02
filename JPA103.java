import java.util.Scanner;
public class JPA103 {
    public static void main(String[] args) {
        System.out.print("Please input: ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.printf("Average: %.2f", ((double)(a+b+c)/3.0));
    }    
}
