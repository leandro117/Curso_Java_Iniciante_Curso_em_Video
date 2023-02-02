/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author leandro
 */
public class Contagem {
    public static String contador(int i, int f) {
     String s = "";   
     for (int c = i; c <= f; c++) {
      s = s + c + " ";
     }
     return s;
    }
    
}
