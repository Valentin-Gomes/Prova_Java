/*
 * Faça um programa de controle de máquina de café, levando em consideração:

A máquina irá fazer repetidamente a leitura das seguintes opções: 1 - café expresso; 2 - café capuccino; 3 - leite com café; 4 - totalizar vendas;

• As opções de 1 a 3 realizam pedidos de café, que recebem respectivamente R$ 0,75, R$ 1,00 e R$ 1,25 em moeda;

• A opção 4 realiza a totalização dos cafés vendidos, finalizando a venda até o momento, imprimindo um relatório com as seguintes informações:

• quantidade e valor de café expresso vendido;

• quantidade e valor de café capuccino vendido;

• quantidade e valor de leite com café vendido;

• quantidade e valor de todos cafés vendidos;

 */

package com.mycompany.atividade_3_valentin;

import java.util.Scanner;


public class ATIVIDADE_3_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int escolha = 0;
        int qtdCafeE = 0;
        double valorCafeE = 0;
        int qtdCafeC = 0;
        double valorCafeC = 0;
        int qtdCafeL = 0;
        double valorCafeL = 0;
        double valorTotal = 0;
        boolean finaliza = false;
        
        System.out.println("MAQUINA DE CAFE");
        System.out.println("---------------------------");
        System.out.println("1 - CAFE EXPRESSO: R$ 0,75");
        System.out.println("2 - CAFE CAPUCCINO: R$ 1,00");
        System.out.println("3 - CAFE COM LEITE: R$ 1,25");
        System.out.println("4 - FINALIZAR");
        System.out.println("---------------------------");
        
        do{
            System.out.print("Digite qual cafe deseja: ");
            escolha = ler.nextInt();
            
            if(escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4){
    
                switch (escolha){
                    case 1:
                        System.out.println("Cafe Expresso");
                        qtdCafeE ++;
                        valorCafeE = valorCafeE + 0.75;
                        break;               
                    case 2:
                        System.out.println("Cafe Capuccino");
                        qtdCafeC ++;
                        valorCafeC = valorCafeC + 1;
                        break;
                    case 3:
                        System.out.println("Cafe com Leite");
                        qtdCafeL ++;
                        valorCafeL = valorCafeL + 1.25;
                        break;
                }                                              

                if(escolha == 4 ){
                    finaliza = true;
                }
            }
            else{
                System.out.println("Digite uma opcao valida!");
            }
        }while(finaliza == false);
        
        valorTotal = valorCafeE + valorCafeC + valorCafeL;
        
        System.out.println("Total de Cafe Expresso Vendido: " + qtdCafeE + " valor: R$ " + valorCafeE);
        System.out.println("Total de Cafe Capuccino Vendido: " + qtdCafeC + " valor: R$ " + valorCafeC);
        System.out.println("Total de Cafe com Leite Vendido: " + qtdCafeL + " valor: R$ " + valorCafeL);
        System.out.println(" valor total: R$ " + valorTotal);
    }
}
