/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package médiadevaloresswing;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class MédiaDeValoresSwing {

    private static int n;
    private static int totalValores;
    private static int totalPares;
    private static int totalÍmpares;
    private static int acimaDe100;
    private static int mediaDosValores;
    private static int soma;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor <br>"
                    + "(0 Interrompe)</html>", "Boas Vindas", JOptionPane.WARNING_MESSAGE));
            soma += n;
            if (n != 0) {
            totalValores += 1;
            if (n > 100){
             acimaDe100 += 1; 
            }
            if (n % 2 == 0) {
             totalPares += 1; 
            } else {
             totalÍmpares += 1;
            }
           }
        } while(n !=0);
        mediaDosValores = soma / totalValores;
        JOptionPane.showMessageDialog(null, 
                "<html><strong>Resultado:<br>" + 
                "--------------------<br>" +
                "Total de Valores: " + totalValores + "<br>" +
                "Total de Pares: " + totalPares + "<br>" +
                "Total de Ímpares: " + totalÍmpares + "<br>" +
                "Acima de 100: " + acimaDe100 + "<br>" +
                "Média dos Valores: " + mediaDosValores + "<br>" +
                "</strong></html>", 
                "Resultado Final", 
                JOptionPane.WARNING_MESSAGE);
    }
    
}
