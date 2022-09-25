package com.company;
import javax.swing.*;
import java.awt.event.*;

public class swing extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    public swing(){}
    public swing(String s) { super(s); }
    private void SetComponents() {
        l1= new JLabel("                     CALCULATOR");
        l1.setBounds(50,50,250,20);
        add(l1);

        l2= new JLabel("First number");
        l2.setBounds(50,80,100,20);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(50,110,100,20);
        add(t1);

        l3= new JLabel("Second number");
        l3.setBounds(160,80,100,20);
        add(l3);
        t2 = new JTextField();
        t2.setBounds(160,110,100,20);
        add(t2);

        b1 = new JButton("ADD");
        b1.setBounds(50,150,100,20);
        add(b1);
        b1.addActionListener(buttonListener);
        l4 = new JLabel();
        l4.setBounds(50,220,200,20);
        add(l4);

        b2 = new JButton("SUB");
        b2.setBounds(160,150,100,20);
        add(b2);
        b2.addActionListener(buttonListener);
        l5 = new JLabel();
        l5.setBounds(160,220,100,20);
        add(l5);
        setLayout(null);

        b3 = new JButton("MUL");
        b3.setBounds(50,180,100,20);
        add(b3);
        b3.addActionListener(buttonListener);
        l6 = new JLabel();
        l6.setBounds(50,250,100,20);
        add(l6);

        b4 = new JButton("DIV");
        b4.setBounds(160,180,100,20);
        add(b4);
        b4.addActionListener(buttonListener);
        l7 = new JLabel();
        l7.setBounds(160,250,100,20);
        add(l7);
    }
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                Object o = e1.getSource();
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int sub = a-b;
                    int sum = a+b;
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
