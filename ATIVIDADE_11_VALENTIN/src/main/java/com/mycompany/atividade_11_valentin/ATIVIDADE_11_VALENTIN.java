/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11_valentin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_11_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        int qtdCliente;
        int acao = 0;
        int comedia = 0;
        int drama = 0;
        int ficcao = 0;
        
        System.out.print("Digite quantos clientes irao participar: ");
        qtdCliente = ler.nextInt();
        
        String generoFilme[] = new String[qtdCliente];
        
        FileWriter arquivo = new FileWriter("C:\\Users\\v.gomes\\Desktop\\Cinema.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        System.out.println("GENERO DE FILMES");
        System.out.println("---------------------------");
        System.out.println("- ACAO");
        System.out.println("- COMEDIA");
        System.out.println("- DRAMA");
        System.out.println("- FICCAO");
        System.out.println("---------------------------");
        
        for(int c = 0; c < qtdCliente; c++){
            System.out.print("Digite o genero de filme: ");
            generoFilme[c] = ler.next();
        }
        
        for(int c = 0; c < qtdCliente; c++){
            if(generoFilme[c].equals("acao")){
                acao ++;
            }
            else if(generoFilme[c].equals("comedia")){
                comedia ++;
            }
            else if(generoFilme[c].equals("drama")){
                drama ++;
            }
            else if(generoFilme[c].equals("ficcao")){
                ficcao ++;
            }
        }
        
            JOptionPane.showMessageDialog(null, acao + " escolheram acao " );
            JOptionPane.showMessageDialog(null, comedia + " escolheram comedia " );
            JOptionPane.showMessageDialog(null, drama + " escolheram drama " );
            JOptionPane.showMessageDialog(null, ficcao + " escolheram ficcao " );
            
            gravar.println(acao + " escolheram acao " );
            gravar.println(comedia + " escolheram comedia " );
            gravar.println(drama + " escolheram drama " );
            gravar.println(ficcao + " escolheram ficcao " );
            
            
        arquivo.close();
    }
}
