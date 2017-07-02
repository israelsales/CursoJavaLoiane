package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Israel Sales on 02/07/2017.
 */
public class Questão_6 {
    //Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        int raio = scanner.nextInt();
        double areaCirculo = (raio*Math.PI);
        //Objeto especializado em formatar decimal
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("A área do círculo é: " +decimalFormat.format(areaCirculo));
    }
}
