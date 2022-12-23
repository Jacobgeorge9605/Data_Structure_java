import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Eve implements ActionListener
{
    JFrame f = new JFrame();
    JButton b1 = new JButton("ok");
    JTextField t1 = new JTextField(10);
    public Eve()
    {
        f.add(b1);
        f.add(t1);
        f.setVisible(true);
        f.setSize(600,600);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            t1.setText("JACOB");
        }
    }
}
class SwingAss
{
    public static void main(String args[])
    {
        Eve e = new Eve();
    }
}