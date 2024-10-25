/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 */

package com.mycompany.atividade_2_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_2_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int anos;
        int meses;
        int dias;
        int somaDias = 0;
        
        System.out.println("Digite quantos anos, meses e dias tem: ");
        System.out.print("Digite quantos anos: ");
        anos = ler.nextInt();
        System.out.print("Digite os meses: ");
        meses = ler.nextInt();
        System.out.print("Digite os dias: ");
        dias = ler.nextInt();
        
        somaDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("Sua idade em dias é de: " + somaDias + " dias.");
    }
}
