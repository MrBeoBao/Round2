package doan_sanh;

import javax.swing.*;
import java.awt.event.*;

public class Cau1_Fibo extends JFrame implements ActionListener {
    JTextField txtN;
    JLabel kq;

    public Cau1_Fibo() {
        setTitle("Câu 1 - Fibonacci");
        setSize(300, 200);
        setLayout(null);

        add(new JLabel("Nhập n:")).setBounds(20, 20, 80, 25);
        txtN = new JTextField();
        txtN.setBounds(100, 20, 100, 25);
        add(txtN);

        JButton btn = new JButton("In");
        btn.setBounds(80, 60, 100, 30);
        btn.addActionListener(this);
        add(btn);

        kq = new JLabel("");
        kq.setBounds(20, 100, 250, 25);
        add(kq);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(txtN.getText());

        if (n < 0) {
            kq.setText("Nhập sai");
            return;
        }

        String s = "";
        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            s += a + " ";
            int temp = a + b;
            a = b;
            b = temp;
        }

        kq.setText(s);
    }

    public static void main(String[] args) {
        new Cau1_Fibo();
    }
}