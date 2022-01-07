/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //fluxo de entrada de dados a partir do teclado através da classe scanner e importar clicando em Scanner e alt+enter

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next(); //lendo a variável nome através do fluxo scan e o método next atribiuiu uma string
            if (nome.equals("0")) break; //se a variável nome for igual à string "0" o programa irá parar

            System.out.println("Idade: ");
            idade = scan.nextInt(); //lendo a variável idade através do scan e atribuindo com o método next int o inteiro
        }

        System.out.println("Programa encerrado..."); //quando encerrou o laço de repetição com o break, o programa encerrou e printa a mensagem
    }
}