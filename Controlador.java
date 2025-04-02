import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    Modelo m;
    Calculadora c;

    public Controlador(Modelo m, Calculadora c) {
        this.m = m;
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==c.getBtn1()){
            int n=Integer.parseInt(c.getTxt1().getText());
            int n2=Integer.parseInt(c.getTxt2().getText());

            int res=m.suma(n,n2);
            c.getTxt3().setText(String.valueOf(res));
        }else if(e.getSource()==c.getBtn2()){
            int n=Integer.parseInt(c.getTxt1().getText());
            int n2=Integer.parseInt(c.getTxt2().getText());

            int res=m.resta(n,n2);
            c.getTxt3().setText(String.valueOf(res));
        }else if(e.getSource()==c.getBtn3()){
            int n=Integer.parseInt(c.getTxt1().getText());
            int n2=Integer.parseInt(c.getTxt2().getText());

            int res=m.multiplicacion(n,n2);
            c.getTxt3().setText(String.valueOf(res));
        }else{
            int n=Integer.parseInt(c.getTxt1().getText());
            int n2=Integer.parseInt(c.getTxt2().getText());

            double res=m.division(n,n2);
            c.getTxt3().setText(String.valueOf(res));
        }
    }
}
