/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima em um arquivo TXT a tabuada do número.

    Obs.: Grave o arquivo na área de trabalho.
 */

package com.mycompany.atividade_8_valentin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ATIVIDADE_8_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite algum numero para fazer a tabuada dele: ");
        num = ler.nextInt();
        
        FileWriter arquivo = new FileWriter("C:\\Users\\v.gomes\\Desktop\\tabuada.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        for(int c = 1; c < 10; c++){
            gravar.println(num + " * " + c + " = " + (num*c));            
        }
        
        arquivo.close();
    }
}
