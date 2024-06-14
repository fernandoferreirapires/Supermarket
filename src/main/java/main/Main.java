package main;

import implemetantion.Supermarket;
import implemetantion.SupermarketArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private final static int SIZE = 3;
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;

        do{
            System.out.println("\nLista de Compras ");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermarket.addElemento(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item que deseja remover: ");
                    int i = scanner.nextInt();
                    supermarket.removeElemento(i);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, escolha novamento.");
            }
        } while(opcao!=4);
        scanner.close();
    }
}