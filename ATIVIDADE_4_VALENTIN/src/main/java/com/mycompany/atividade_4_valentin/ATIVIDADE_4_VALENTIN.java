/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

     */

package com.mycompany.atividade_4_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_4_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int suc;
        int ant;
        
        System.out.print("Digite um numero para saber o sucessor e antecessor: ");
        int num = ler.nextInt();      
        
        suc = num + 1;
        
        ant = num - 1;
        
        System.out.println("O antecessor e " + ant + " e o sucessor e " + suc);
        
    }
}
