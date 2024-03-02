import java.util.Scanner;
public class JPA102 {
    public static void main(String[] args) {
        System.out.print("Please input: ");
        Scanner scn = new Scanner(System.in);
        double kg=scn.nextDouble();
        System.out.printf("%.6f kg = %.6f pounds\n",kg,kg*2.20462);
    }    
}
