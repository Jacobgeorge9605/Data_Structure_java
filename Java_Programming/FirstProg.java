import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Events extends Frame implements ActionListener , WindowListener
{
    Button b1 = new Button("OK");
    TextField t1 = new TextField(10);

    public Events()
    {
        add(t1);
        add(b1);
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        addWindowListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        t1.setText("LBS");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window closing ...");
        System.exit(0);
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window closing ...");
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("window opened");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window DE iconified");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window Iconified");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated ...");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window de activated");
    }

}
class FirstProg
{
    public static void main(String args[])
    {
        Events e1 = new Events();
    }
}
