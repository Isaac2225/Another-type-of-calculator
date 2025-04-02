import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Calculadora c=new Calculadora();
                Modelo m=new Modelo();
                Controlador cc=new Controlador(m, c);
                c.setVisible(true);
            }
        });
    }
}
