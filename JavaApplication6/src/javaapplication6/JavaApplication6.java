/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author luisf
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nombre
     String mes
     
     nombre = JOptionPane.showInputDialog("ingrese el nombre del cliente");
     int cedula = Integer.parseInt(JoptionPane.showInputDialog("ingrese la cedula");
     int codigodefactura = integer .parsenInt(JOptionPane.showInputDialog("ingrese el codigo de la factura"));
     mes = JOptionPane.showInputDialog("ingrese el mes");
     int FECHADELAFACTURA = integerparsenInt(JOptionPane.showInputDialog("ingrese la fecha de la factura"));
     int cantidad = Integer.ParsenInt(JOptionPane.showInputDialog("ingrese la cantidad de facturas"));
     int estadodelafactura = integer.ParsenInt(JOptionPane.showInputDialog("ingrese el estado de la factura"));
     int montodelafactura = integerParsenInt(JOptionaPane.showInputDialog("ingrese le monto de la factura"));
     
     if (montodelafactura > 0){
         double interes = montodelafactura * 0.15 ;
         montodelafactura = (int) (montodelafactura + interes);
         montodelafactura = montodelafactura/4;
         
         JOption.showMessageDialog(null, montodelafactura);
         Joption.showMessageDialog(null, montodelafactura);
    }
    
}
