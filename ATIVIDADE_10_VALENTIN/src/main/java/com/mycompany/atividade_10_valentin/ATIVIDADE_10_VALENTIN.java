/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_10_valentin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_10_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        int qtdProduto;
        
        System.out.print("Digite quantos produtos quer cadastrar: ");
        qtdProduto = ler.nextInt();
        
        String nome[] = new String[qtdProduto];
        double preco[] = new double[qtdProduto];
        
        FileWriter arquivo = new FileWriter("C:\\Users\\v.gomes\\Desktop\\Produtos.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        
        for(int c = 0; c < qtdProduto; c++){
            System.out.print("Digite o nome do produto: ");
            nome[c] = ler.next();
            gravar.print("Nome do produto: " + nome[c] + " ");
            System.out.print("Digite o preco do produto: R$ ");
            preco[c] = ler.nextDouble();
            gravar.println("Preco do produto: R$ " + preco[c]);
        }
        
        for(int c = 0; c < qtdProduto; c++){
            JOptionPane.showMessageDialog(null, "Nome do produto: " + nome[c]);
            JOptionPane.showMessageDialog(null, "Preco do produto: R$ " + preco[c]);
        }
        
        arquivo.close();
    }
}
