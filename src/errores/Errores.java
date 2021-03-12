
package errores;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Errores {
    private double valorReal;
    private double valorAproximado;

    public Errores(double valorReal, double valorAproximado ) {
        this.valorReal = valorReal;
        this.valorAproximado = valorAproximado ;
    }
    
    public double errorAbsoluto(){
        
        return Math.abs(valorReal-valorAproximado);
    }
    public double errorRelativo(){
        
        return Math.abs(errorAbsoluto()/valorReal);
    }
    public double errorRelativoPorcentual(){
        
        return errorRelativo()*100;
    }
  
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double x, xap;
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Real"));
        JOptionPane.showMessageDialog(null, x);
        xap = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Aproximado"));
        JOptionPane.showMessageDialog(null, xap);
        
        Errores e = new Errores (x,xap);
        
        JOptionPane.showMessageDialog(null, "Error Ansoluto:    "+e.errorAbsoluto()+"\n"
                        + "Error Relativo:    "+e.errorRelativo()+"\n"
                        + "Error Relativo (%):    "+e.errorRelativoPorcentual());
    }
    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorAbsoluto() {
        return valorAproximado;
    }

    public void setValorAbsoluto(double valorAbsoluto) {
        this.valorAproximado = valorAbsoluto;
    }
    
    
}

