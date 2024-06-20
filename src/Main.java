import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma,"Suma de enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta,"Resta de enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion,"Multiplicacion de enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division,"division enteros",JOptionPane.PLAIN_MESSAGE);
    }
}