package com.mycompany.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.println("Por favor, insira seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Insira seu número: ");
        numero = scanner.nextInt();
        System.out.println("Insira sua agência: ");
        agencia = scanner.next();
        System.out.println("Insira o saldo desejado: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + 
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                ", conta " + numero + 
                " e seu saldo " + saldo + " já está disponível para saque");
    }
}
