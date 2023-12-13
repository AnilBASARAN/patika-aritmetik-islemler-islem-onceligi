import java.util.Scanner;
public class Aritmetik {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısı için bir değer giriniz :");
        a = input.nextDouble();
        System.out.println("b sayısı için bir değer giriniz :");
        b = input.nextDouble();
        System.out.println("c sayısı için bir değer giriniz :");
        c = input.nextDouble();
        System.out.println("a+b*c-b işleminin sonucu : " + (a+b*c-b) );
    }
}
