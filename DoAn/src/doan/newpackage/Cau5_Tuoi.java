package doan_sanh;

import javax.swing.*;
import java.awt.event.*;
import java.time.Year;

public class Cau5_Tuoi extends JFrame implements ActionListener {
    JTextField txt;
    JLabel kq;

    public Cau5_Tuoi() {
        setTitle("Câu 5");
        setSize(300, 200);
        setLayout(null);

        txt = new JTextField();
        txt.setBounds(100, 20, 100, 25);
        add(txt);

        JButton btn = new JButton("Tính");
        btn.setBounds(80, 60, 100, 30);
        btn.addActionListener(this);
        add(btn);

        kq = new JLabel("");
        kq.setBounds(20, 100, 250, 25);
        add(kq);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int year = Integer.parseInt(txt.getText());

        if (year < 0) {
            kq.setText("Nhập sai");
            return;
        }

        int current = Year.now().getValue();
        kq.setText("Tuổi: " + (current - year));
    }

    public static void main(String[] args) {
        new Cau5_Tuoi();
    }
}
