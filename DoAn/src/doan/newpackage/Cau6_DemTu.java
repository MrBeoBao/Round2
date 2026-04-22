package doan_sanh;

import javax.swing.*;
import java.awt.event.*;

public class Cau6_DemTu extends JFrame implements ActionListener {
    JTextField txt;
    JLabel kq;

    public Cau6_DemTu() {
        setTitle("Câu 6");
        setSize(400, 200);
        setLayout(null);

        txt = new JTextField();
        txt.setBounds(20, 20, 340, 25);
        add(txt);

        JButton btn = new JButton("Đếm");
        btn.setBounds(140, 60, 100, 30);
        btn.addActionListener(this);
        add(btn);

        kq = new JLabel("");
        kq.setBounds(20, 100, 350, 25);
        add(kq);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = txt.getText().trim();

        if (s.isEmpty()) {
            kq.setText("0 từ");
            return;
        }

        String[] words = s.split("\\s+");
        kq.setText("Có " + words.length + " từ");
    }

    public static void main(String[] args) {
        new Cau6_DemTu();
    }
}
