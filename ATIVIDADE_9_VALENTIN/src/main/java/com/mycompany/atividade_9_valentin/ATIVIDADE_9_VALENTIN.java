/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_9_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_9_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double ganhaHora;
        int trabHora;
        double salarioB;
        double ir;
        double inss;
        double sind;
        double salarioL;
        
        System.out.print("Digite quanto recebe por hora: ");
        ganhaHora = ler.nextDouble();
        System.out.print("Digite quantas horas trabalha por mes: ");
        trabHora = ler.nextInt(); 
        
        salarioB = ganhaHora * trabHora;
        
        ir = salarioB * 0.11;
        inss = salarioB * 0.08;
        sind = salarioB * 0.05;
        salarioL = salarioB - ir - inss - sind;
        
        System.out.println("+ Salario Bruto: R$ " + salarioB);
        System.out.println("- Imposto de Renda: R$ " + ir);
        System.out.println("- INSS: R$ " + inss);
        System.out.println("- Sindicato: R$ " + sind);
        System.out.println("= Salario Liquido: R$ " + salarioL);
        
    }
}
