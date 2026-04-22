package doan_sanh;

import javax.swing.*;
import java.awt.event.*;

public class Cau2_DaoSo extends JFrame implements ActionListener {
    JTextField txt;
    JLabel kq;

    public Cau2_DaoSo() {
        setTitle("Câu 2");
        setSize(300, 200);
        setLayout(null);

        txt = new JTextField();
        txt.setBounds(100, 20, 100, 25);
        add(txt);

        JButton btn = new JButton("Đảo");
        btn.setBounds(80, 60, 100, 30);
        btn.addActionListener(this);
        add(btn);

        kq = new JLabel("");
        kq.setBounds(20, 100, 250, 25);
        add(kq);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(txt.getText());
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        kq.setText("Số đảo: " + rev);
    }

    public static void main(String[] args) {
        new Cau2_DaoSo();
    }
}