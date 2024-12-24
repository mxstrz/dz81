import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UI extends JFrame{

    public UI(){

        setSize(400,600);
        setLayout(null);

        JLabel label= new JLabel("Calculator for bezdar");
        label.setBounds(0, 0 , 399 ,20 );
        add(label);
        label.setBackground(Color.gray);
        label.setForeground(Color.red);

        JTextField textField = new JTextField();
        textField.setBounds(0, 40, 350, 150);
        textField.setFont(new Font("Arial", Font.BOLD, 36));
        add(textField);

        JPanel panel = new JPanel();
        panel.setBounds(0, 200, 400, 300);
        panel.setBackground(Color.red);
        add(panel);
        panel.setLayout(new GridLayout(5,4 ));



       //Function

        setLayout(null);
        JButton button12= new JButton("0");
        button12.setBounds(100,500 , 100 ,50 );
        button12.setBackground(Color.gray);
        button12.setForeground(Color.CYAN);
        panel.add(button12);
            textField.setText(textField.getText()+ "7" );

        setLayout(null);
        JButton button3= new JButton("1");
        button3.setBounds(0, 450 , 100 ,50 );
        button3.setBackground(Color.gray);
        button3.setForeground(Color.CYAN);
        panel.add(button3);


        setLayout(null);
        JButton button4= new JButton("2");
        button4.setBounds(100, 450 , 100 ,50 );
        button4.setBackground(Color.gray);
        button4.setForeground(Color.CYAN);
        panel.add(button4);

        setLayout(null);
        JButton button5= new JButton("3");
        button5.setBounds(200, 450 , 100 ,50 );
        button5.setBackground(Color.gray);
        button5.setForeground(Color.CYAN);
        panel.add(button5);

        setLayout(null);
        JButton button6= new JButton("4");
        button6.setBounds(0,400 , 100 ,50 );
        button6.setBackground(Color.gray);
        button6.setForeground(Color.CYAN);
        panel.add(button6);

        setLayout(null);
        JButton button7= new JButton("5");
        button7.setBounds(100,400 , 100 ,50 );
        button7.setBackground(Color.gray);
        button7.setForeground(Color.CYAN);
        panel.add(button7);

        setLayout(null);
        JButton button8= new JButton("6");
        button8.setBounds(200,400 , 100 ,50 );
        panel.add(button8);
        button8.setBackground(Color.gray);
        button8.setForeground(Color.CYAN);

        setLayout(null);
        JButton button9= new JButton("7");
        button9.setBounds(0,350 , 100 ,50 );
        panel.add(button9);
        button9.setBackground(Color.gray);
        button9.setForeground(Color.CYAN);

        setLayout(null);
        JButton button10= new JButton("8");
        button10.setBounds(100,350 , 100 ,50 );
        panel.add(button10);
        button10.setBackground(Color.gray);
        button10.setForeground(Color.CYAN);

        setLayout(null);
        JButton button11= new JButton("9");
        button11.setBounds(200,350 , 100 ,50 );
        panel.add(button11);
        button11.setBackground(Color.gray);
        button11.setForeground(Color.CYAN);

        setLayout(null);
        JButton button13= new JButton("=");
        button13.setBounds(300,350 , 100 ,220 );
        panel.add(button13);
        button13.setBackground(Color.RED);
        button13.setForeground(Color.CYAN);

        setLayout(null);
        JButton button14= new JButton("*");
        button14.setBounds(0,300 , 100 ,50 );
        panel.add(button14);
        button14.setBackground(Color.BLUE);
        button14.setForeground(Color.CYAN);

        setLayout(null);
        JButton button15= new JButton(":");
        button15.setBounds(100,300 , 100 ,50 );
        panel.add(button15);
        button15.setBackground(Color.BLUE);
        button15.setForeground(Color.CYAN);

        setLayout(null);
        JButton button16= new JButton("-");
        button16.setBounds(200,300 , 100 ,50 );
        panel.add(button16);
        button16.setBackground(Color.BLUE);
        button16.setForeground(Color.CYAN);

        setLayout(null);
        JButton button17= new JButton("+");
        button17.setBounds(300,300 , 100 ,50 );
        panel.add(button17);
        button17.setBackground(Color.BLUE);
        button17.setForeground(Color.CYAN);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }





}