/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);//instanciar a classe scanner
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        
        
        int candidato = 0;
        while (candidato >= 0) {
            candidato = entrada.lerNumeroInteiro("digite um número inteiro");
            processamento.somarVotos(candidato);
        }
        
        int cont1 = processamento.getCont1();
        int cont2 = processamento.getCont2();
        int cont3 = processamento.getCont3();

        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("candidato 1", cont1);
        saida.imprimirNumeroInteiro("candidato 2", cont2);
        saida.imprimirNumeroInteiro("candidato 3", cont3);

    }

}
