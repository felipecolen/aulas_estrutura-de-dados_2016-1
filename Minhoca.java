package minhoca;

import java.util.Scanner;

//class Main {
public class Minhoca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        String linha = entrada.nextLine();
        String[] vetor_linha = linha.split(" ");
        
        int maior_valor = -1;
        int linhas, colunas, soma;
        
        linhas = Integer.parseInt(vetor_linha[0]);
        colunas = Integer.parseInt(vetor_linha[1]);
        
        int[][] matriz = new int[linhas][colunas];
        
        for (int l = 0; l < linhas; l++) {
            String conteudo_linha = entrada.nextLine();
            String[] vetor_conteudo_linha = conteudo_linha.split(" ");
            soma = 0;
            for (int c = 0; c < vetor_conteudo_linha.length; c++) {
                matriz[l][c] = Integer.parseInt(vetor_conteudo_linha[c]);
                soma += matriz[l][c];
            }
            
            if (soma > maior_valor) {
                maior_valor = soma;
            }
        }

        for (int i = 0; i < colunas; i++) {
            soma = 0;
            for (int j = 0; j < linhas; j++) {
                soma += matriz[j][i];
            }
            if (soma > maior_valor) {
                maior_valor = soma;
            }
        }

        System.out.println(maior_valor);   
    }
}