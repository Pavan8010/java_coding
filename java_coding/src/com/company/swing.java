package com.company;
import javax.swing.*;
import java.awt.event.*;

public class swing extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
//    public swing(){}
    public swing(String s) { super(s); }
    private void SetComponents() {
        l1= new JLabel("                     CALCULATOR");
        l2= new JLabel("First number");
        l3= new JLabel("Second number");
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("DIV");

        l1.setBounds(50,20,250,20);
        l2.setBounds(50,80,100,20);
        t1.setBounds(50,110,100,20);
        l3.setBounds(160,80,100,20);
        t2.setBounds(160,110,100,20);
        b1.setBounds(50,150,100,20);
        l4.setBounds(50,220,200,20);
        b2.setBounds(160,150,100,20);
        l5.setBounds(160,220,100,20);
        b3.setBounds(50,180,100,20);
        l6.setBounds(50,250,100,20);
        b4.setBounds(160,180,100,20);
        l7.setBounds(160,250,100,20);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
        add(b2);
        add(l5);
        add(b3);
        add(l6);
        add(b4);
        add(l7);

        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        b4.addActionListener(al);
        setLayout(null);

    }
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object o = e.getSource();
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int sum = a+b;
                    int sub = a-b;
                    int mul = a*b;
                    int div = a/b;
                    if(o == b1 ){
                    l4.setText("Addition: " + sum);
                    }else if(o == b2){
                    l5.setText("Substraction: " + sub);
                    }else if (o == b3){
                    l6.setText("Multipliction:" +mul);
                    }
                    else if(o == b4){
                     l7.setText("Divison: " + div);
                    }
                }
        };
    public static void main(String[] args) {
        swing jf = new swing("PAVAN");
        jf.SetComponents();
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


}
