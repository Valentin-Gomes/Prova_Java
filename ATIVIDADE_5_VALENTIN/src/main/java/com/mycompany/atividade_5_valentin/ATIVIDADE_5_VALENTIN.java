/*
 * Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser 
apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada
a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
 */

package com.mycompany.atividade_5_valentin;

import java.util.Scanner;


public class ATIVIDADE_5_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int codigo;
        boolean verificaCodigo = false;
        int senha;
         boolean verificaSenha = false;
        
        do{
        System.out.print("Digite seu codigo de identificacao: ");
        codigo = ler.nextInt();
        
        if(codigo == 1234 ){
            verificaCodigo = true;
        }
        else{
            System.out.println("Codigo invalido, tente novamente");
        }
            } while (verificaCodigo == false);
        
        do{
        System.out.print("Digite sua senha: ");
        senha = ler.nextInt();
        
        if(senha == 9999 ){
            verificaSenha = true;
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Senha invalida, tente novamente");
        }
            } while (verificaSenha == false);
        
    }     
}
