/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.Vetor;

/**
 *
 *  
 */
public class Aula06 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3"); 
        
        System.out.println(vetor.busca("elemento 1"));
        System.out.println(vetor.busca("elemento 4"));
        
    }
    
}
