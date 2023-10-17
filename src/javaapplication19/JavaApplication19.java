package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        double totE, votoB, votoN, votoV;

        Scanner ler = new Scanner(System.in);

        System.out.println("Total de eleitores: ");
        totE = ler.nextDouble();
        System.out.println("Total de brancos: ");
        votoB = ler.nextDouble();
        System.out.println("Total de nulos: ");
        votoN = ler.nextDouble();
        System.out.println("Total de válidos: ");
        votoV = ler.nextDouble();

        votoB = votoB / totE * 100.0;
        votoN = votoN / totE * 100.0;
        votoV = votoV / totE * 100.0;

        System.out.println("Percentual votos brancos " + votoB + "%");
        System.out.println("Percentual votos nulos " + votoN + "%");
         System.out.println("Percentual votos validoa "+ votoV + "%");
    }

}
