/*
 * Construa um algoritmo para ler um número N informado pelo usuário, ao final deverá ser calculado a média, soma e a quantidade dos valores digitados.
 */

package com.mycompany.atividade_6_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_6_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        int qtdNum = 0;
        int soma = 0;
        double media = 0;
        boolean finaliza = false;
        
        do{
        System.out.print("Digite algum numuero(Digite 0 para sair): ");
        num = ler.nextInt();
        
        if(num != 0){
        qtdNum ++;
        soma = soma + num;
        }
        else {
            finaliza = true;
        }
        } while (finaliza == false);
        
        media = soma/qtdNum;
        
        System.out.print("Media foi de: " + media);
        System.out.print(" | Soma foi de: " + soma);
        System.out.print(" | Quantidade foi de: " + qtdNum);
        
    }
}
