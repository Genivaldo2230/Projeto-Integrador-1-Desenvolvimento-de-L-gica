/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.sp.projpi1b.aulasprojpi1b.JogoRpgTextualFelip.pi_projeto_integrador_grupo_1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author gusta
 */
public class ALGORITMO_2_Aula_6 {

    /**
     * @param args the command line arguments
     */
    //FunÃ§Ã£o para retornar Arquivo encontrado
    public static FileReader Aux(String NomeArquivo) throws Exception {
        FileReader arquivo = new FileReader(NomeArquivo + ".txt");
        return arquivo;
    }

    //Buffer tem como funÃ§Ã£o ler todas as linhas que a classe FileReader trouxe(arquivo completo)
    public static BufferedReader leia(FileReader Arquivo) {
        BufferedReader buffer = new BufferedReader(Arquivo);
        return buffer;
    }

    /*Nesta funÃ§Ã£o recebemos os arquivos lidos por parametro, sendo assim tambÃ©m informamos a quantidade de linha e colunas
    para criaÃ§Ã£o da matriz, desta forma usamos um while que irÃ¡ continuar a ler linhas que contiverem no arquivo enviado,
    separamos os valores por splipt contendo um array, usamos o array para popular a linha da matriz(array) porque uma matriz Ã© formada de diversos arrays por linha*/
    public static double[][] Popular_Matrix(BufferedReader Arquivo, int linhas, int colunas) throws Exception {
        double[][] Matrix = new double[linhas][colunas];
        String line = " ";

        int count2 = 0;
        while ((line = Arquivo.readLine()) != null) {
            String[] auxilio = line.split(" ");
            for (int i = 0; i < auxilio.length; i++) {
                Matrix[count2][i] = Float.parseFloat(auxilio[i]);
            }
            count2++;

        }
        return Matrix;
    }

    /*Nesta funÃ§Ã£o retornarmos a soma por linha dos valores para assim temos os elementos para comparaÃ§Ã£o absoluta*/
    public static double[] RetornarLinha(double[][] matrix) {
        double[] Vet = new double[matrix.length];

        double aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux = aux + matrix[i][j];
            }
            Vet[i] = aux;
            aux = 0;
        }

        return Vet;

    }
    public static double[] RetornarLinha2(double[][] matrix) {
        double[] Vet = new double[matrix.length];
        double aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux = aux + matrix[i][j];
            }
            Vet[i] = aux;
            aux = 0;
        }

        return Vet;

    }
    

    /*Nesta funÃ§Ã£o retornarmos a soma por coluna dos valores para assim temos os elementos para comparaÃ§Ã£o absoluta*/
    public static double[] RetornarColuna1(double[][] matrix) {
        double[] Vet = new double[matrix.length];

        double aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux = aux + matrix[j][i];
            }
            Vet[i] = aux;
            aux = 0;
        }

        return Vet;

    }

    /*Nesta funÃ§Ã£o retornarmos a soma por coluna novamento por termos tido um erro com a matriz dois, sendo assim temos os valores para assim comparaÃ§Ã£o absoluta*/
    public static double[] RetornarColuna(double[][] matrix) {
        double[] Vet = new double[matrix[0].length];

        double aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux = aux + matrix[i][j];
            }
            Vet[i] = aux;
            aux = 0;
        }

        return Vet;

    }

    public static double[] RetornarColuna2(double[][] matrix) {
        double[] Vet = new double[10];

        double aux = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < matrix.length; j++) {
                aux = aux + matrix[j][i];
            }
            Vet[i] = aux;
            aux = 0;
        }        return Vet;

    }

    /*Nesta funÃ§Ã£o comparamos os vetores obtidos de coluna e linha, para desta forma validarmos as posiÃ§Ãµese e valores,
    fazendo a soma dos valores que estÃ£o a esquerda e direita do numero a ser comparado no for(i),
    e apÃ³s obtermos os valores a esquerda e direita fazemos sua diferenÃ§a absoluta, para comparaÃ§Ã£o com a prÃ³xima difenÃ§a absoluta,
    o menor valor irÃ¡ prevalecer sendo assim quase indice de i serÃ¡ a posiÃ§Ã£o para achar a gravidade.    
     */
    public static int[] ComparaVetores(double[] vet, double[] vet2) {

        double A = 0;
        double B = 0;

        double DIF_ABS = 0;

        int ILINHA = 0;
        int ICOLUNA = 0;

        int Count = 1;
        if (Count == 1) {

            for (int i = 1; i < (vet.length - 1); i++) {
                for (int j = 0; j < vet.length; j++) {
                    if (i > j) {
                        A = vet[j] + A;
                    }
                    if (i < j) {
                        B = vet[j] + B;
                    }
                }
                double AUX = Math.abs(A - B);
                if (i == 1) {
                    DIF_ABS = AUX;
                    ILINHA = i;
                }
                if (DIF_ABS < AUX) {
                    ILINHA = i;
                    DIF_ABS = AUX;
                }
                A = 0;
                B = 0;
            }
            Count++;
        }

        if (Count == 2) {
            for (int i = 1; i < (vet.length - 1); i++) {
                for (int j = 0; j < vet2.length; j++) {
                    if (i > j) {
                        A = vet[j] + A;
                    }
                    if (i < j) {
                        B = vet[j] + B;
                    }
                }
                double AUX = Math.abs(A - B);
                if (i == 1) {
                    DIF_ABS = AUX;
                    ICOLUNA = i;
                }
                if (DIF_ABS < AUX) {
                    ICOLUNA = i;
                    DIF_ABS = AUX;
                }
                A = 0;
                B = 0;
            }
        }

        int[] vetfinal = new int[]{ILINHA, ICOLUNA};

        return vetfinal;
    }
    
     public static int[] ComparaVetores2(double[] vet, double[] vet2) {

        double A = 0;
        double B = 0;

        double DIF_ABS = 0;

        int ILINHA = 0;
        int ICOLUNA = 0;

        int Count = 1;
        if (Count == 1) {

            for (int i = 1; i < (vet.length -1); i++) {
                for (int j = 0; j < vet.length; j++) {
                    if (i > j) {
                        A = vet[j] + A;
                    }
                    if (i < j) {
                        B = vet[j] + B;
                    }
                }
                double AUX = Math.abs(A - B);
                if (i == 1) {
                    DIF_ABS = AUX;
                    ILINHA = i;
                }
                if (DIF_ABS > AUX) {
                    ILINHA = i;
                    DIF_ABS = AUX;
                }
                A = 0;
                B = 0;
            }
            Count++;
        }

        if (Count == 2) {
            for (int i = 1; i < (vet2.length - 1); i++) {
                for (int j = 0; j < vet2.length; j++) {
                    if (i > j) {
                        A = vet2[j] + A;
                    }
                    if (i < j) {
                        B = vet2[j] + B;
                    }
                }
                double AUX = Math.abs(A - B);
                if (i == 1) {
                    DIF_ABS = AUX;
                    ICOLUNA = i;
                }
                if (DIF_ABS > AUX) {
                    ICOLUNA = i;
                    DIF_ABS = AUX;
                }
                A = 0;
                B = 0;
            }
        }

        int[] vetfinal = new int[]{ILINHA, ICOLUNA};

        return vetfinal;
    }

    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        FileReader Arquivo_1 = Aux("ArquivoLogica");
        FileReader Arquivo_2 = Aux("ArquivoLogico2");

        BufferedReader Buffer_1 = leia(Arquivo_1);
        BufferedReader Buffer_2 = leia(Arquivo_2);

        double[][] matrix = Popular_Matrix(Buffer_1, 5, 5);
        double[][] matrix2 = Popular_Matrix(Buffer_2, 5, 10);

        System.out.println("******Matriz 1 ******");

        double[] vet = RetornarLinha(matrix);
        double[] vet1 = RetornarColuna1(matrix);

        int[] gravidade = ComparaVetores(vet1, vet);

        int linha_gravidade1 = gravidade[0];
        int coluna_gravidade1 = gravidade[1];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet1 " + vet[i]);
        }

        System.out.println("PosiÃ§Ã£o de linha: " + linha_gravidade1 + " posiÃ§Ã£o de coluna: " + coluna_gravidade1);

        System.out.println("*******Matriz 2 *********");

        vet = RetornarLinha2(matrix2);
        vet1 = RetornarColuna2(matrix2);

        gravidade = ComparaVetores2(vet1, vet);
        int linha_gravidade = gravidade[0];
        int coluna_gravidade = gravidade[1];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet  " + vet[i]);
        }
        System.out.println("PosiÃ§Ã£o de linha: " + coluna_gravidade + " posiÃ§Ã£o de coluna: " + linha_gravidade);

    }

}
