/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author leandro
 */
public class Fatorial {
    public static String fatorial(int a){
    int f = 1;
    String s = "";
    for (int i = a; i > 0; i-= 1) {
     f = f * i;
     if (i != 1) {
     s += i + " x ";
     } else {
      s += i ;
     }
    }
    return s + " = " + f;
   }
}
