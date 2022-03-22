package Aula01;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        double vetor[] = new double[5];
        int menu = 0;

        Scanner tc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("DIGITE O VALOR: ");
            vetor[i]=tc.nextDouble();

        }
        System.out.println("Digite a opção desejada :");
        menu = tc.nextInt();
        switch (menu){
            case 1:{
                //ordem normal
                for(int i=0;i<5;i++){
                    System.out.println("POSIÇÃO "+vetor[i]);
                }
                break;
            }
            case 2:{
                //ordem inversa
                for(int i=4;i>0;i--){
                    System.out.println("POSIÇÃO "+vetor[i]);
                }
                break;
            }
            default:{
                // sair do programa
                System.out.println("FIM DE PROGRAMA");
                break;
            }
        }

    }
}
