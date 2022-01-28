import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Armut kaç kilo? : ");
        double armutKg= input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elmaKg= input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domatesKg= input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muzKg= input.nextDouble();

        System.out.print("patlıcan kaç kilo? : ");
        double patlicanKg= input.nextDouble();

        double toplam = ((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg));
        System.out.print(toplam);



    }
}
