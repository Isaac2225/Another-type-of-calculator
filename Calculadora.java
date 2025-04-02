import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculadora extends JFrame {
    Modelo m=new Modelo();
    Controlador c=new Controlador(m, this);

    private Border border;
    private JPanel p, p2, p3, p4, p5, p6, p7;
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
    private JButton btn1, btn2, btn3, btn4;
    private JTextField txt1, txt2, txt3;
    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 350);
        setResizable(false);
        setLayout(null);

        border = BorderFactory.createLineBorder(Color.BLACK);

        p=new JPanel();
        p.setLayout(null);
        p.setBounds(0, 0, 450, 350);

        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(17, 20, 200, 120);
        p2.setBorder(border);

        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(17, 170, 200, 50);
        p3.setBorder(border);

        p4=new JPanel();
        p4.setLayout(null);
        p4.setBounds(17, 240, 200, 50);
        p4.setBorder(border);

        p5=new JPanel();
        p5.setLayout(null);
        p5.setBounds(20, 9, 100, 20);

        p6=new JPanel();
        p6.setLayout(null);
        p6.setBounds(20, 160, 80, 20);

        p7=new JPanel();
        p7.setLayout(null);
        p7.setBounds(20, 230, 60, 20);


        lbl1=new JLabel("Ingreso de datos");
        lbl1.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl1.setBounds(5, 0, 100, 20);

        lbl2=new JLabel("Operaciones");
        lbl2.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl2.setBounds(5, 0, 100, 20);

        lbl3=new JLabel("Resultado");
        lbl3.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl3.setBounds(5, 0, 80, 20);

        lbl4=new JLabel("Dato1");
        lbl4.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl4.setBounds(25, 15, 80, 20);

        lbl5=new JLabel("Dato2");
        lbl5.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl5.setBounds(25, 60, 80, 20);

        txt1=new JTextField();
        txt1.setBounds(70, 15, 100, 20);

        txt2=new JTextField();
        txt2.setBounds(70, 60, 100, 20);

        txt3=new JTextField();
        txt3.setBounds(50, 15, 100, 20);

        btn1=new JButton("+");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 7));
        btn1.setBounds(5, 10, 40, 35);
        btn1.addActionListener(c);

        btn2=new JButton("-");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 7));
        btn2.setBounds(50, 10, 40, 35);
        btn2.addActionListener(c);

        btn3=new JButton("x");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 7));
        btn3.setBounds(110, 10, 40, 35);
        btn3.addActionListener(c);

        btn4=new JButton("/");
        btn4.setFont(new Font("Tahoma", Font.BOLD, 7));
        btn4.setBounds(155, 10, 40, 35);
        btn4.addActionListener(c);

        p5.add(lbl1);
        p6.add(lbl2);
        p7.add(lbl3);
        p2.add(lbl4);
        p2.add(lbl5);
        p2.add(txt1);
        p2.add(txt2);
        p4.add(txt3);
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        p3.add(btn4);
        p.add(p7);
        p.add(p6);
        p.add(p5);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        add(p);
    }

    public Modelo getM() {
        return m;
    }

    public Controlador getC() {
        return c;
    }

    public Border getBorder() {
        return border;
    }

    public JPanel getP() {
        return p;
    }

    public JPanel getP2() {
        return p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public JPanel getP4() {
        return p4;
    }

    public JPanel getP5() {
        return p5;
    }

    public JPanel getP6() {
        return p6;
    }

    public JPanel getP7() {
        return p7;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public JLabel getLbl5() {
        return lbl5;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JTextField getTxt1() {
        return txt1;
    }

    public JTextField getTxt2() {
        return txt2;
    }

    public JTextField getTxt3() {
        return txt3;
    }
}
