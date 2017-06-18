/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;
import java.util.Scanner;
/**
 *
 * @author Bruno Brandão Acunha
 */
public class Exercicio_2 {

 	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Arrays arrays = new Arrays(); 
 
     System.out.println("Digite a quantidade de numeros que você deseja somar:");
     int qtd = sc.nextInt();
     arrays.setQuantidade(qtd);
 
     for (int i = 0; i < qtd; i++) {
        System.out.println("Digite o numero:");
        int valor = sc.nextInt();
        arrays.setValorEPosicao(i, valor);
     }
 
     int soma = arrays.somaInt();
     System.out.println("O total da soma dos numeros é: " + soma);
     }	
 }