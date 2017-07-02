package aula13;

import java.util.Scanner;

/**
 * Created by Israel Sales on 18/06/2017.
 */
public class Questao_4 {
    //Faça um programa que peça dois números e imprima a soma.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.print("Digite nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.print("Digite nota 3: ");
        int nota3 = scanner.nextInt();
        System.out.print("Digite nota 4: ");
        int nota4 = scanner.nextInt();
        System.out.println("Media da nota é:  "+(nota1+nota2+nota3+nota4)/4);
    }
}
