package com.company;

import java.util.Scanner;

public class ExercTemperatura {

    public static void main(String[] args) {
        double temperaturas[] = new double[7];
        double total = 0;
        int cont=0;

        Scanner tc = new Scanner(System.in);

        for(int i=0; i<7; i++) {
            System.out.println("Digite o valor da primeira temperatura: ");
            temperaturas[i] = tc.nextDouble();
            total = temperaturas[i] + total;
            // ou total += temperaturas[i];
        }

        double media = total/7;

        for(int i=0; i<7;i++){
            if(temperaturas[i]>media){
                cont++;
            }
        }
        System.out.println("AS TEMPERATURAS ACIMA DA MEDIA FORAM: "+cont);
    }
}
