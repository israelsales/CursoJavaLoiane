import java.util.Scanner;

/**
 * Created by Israel Sales on 01/07/2017.
 */
public class Questao_5 {
    //Faça um programa que converta metros para centimetros.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");

        int metros = scanner.nextInt();

        int centimetros = metros*100;

        System.out.println(metros+" metro(s) =  "+centimetros+" centimetros.");



    }
}
