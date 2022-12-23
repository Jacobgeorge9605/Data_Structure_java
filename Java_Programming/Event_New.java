import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Events extends Frame implements ActionListener, WindowListener
{
Button b1 = new Button("Click Me");
Button b2 = new Button("Reset");
TextField t1 = new TextField(10);

public Events()
{
add(t1);
add(b1);
add(b2);
setVisible(true);
setSize(600,600);
setLayout(new FlowLayout());
b1.addActionListener(this);
b2.addActionListener(this);
addWindowListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == b1)
{
String s1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the text :_ \t");
s1 = sc.nextLine();
t1.setText(s1);
}
if(e.getSource() == b2)
{
t1.setText("");
}
}
public void windowClosing(WindowEvent e)
{
System.out.println("Window Closing.....");
System.exit(0);

}
public void windowActivated(WindowEvent e)
{
System.out.println("Window Activated.....");
}
public void windowDeactivated(WindowEvent e)
{
System.out.println("Window De-Activated.....");
}
public void windowOpened(WindowEvent e)
{
System.out.println("Window Opened.....");
}
public void windowClosed(WindowEvent e)
{
System.out.println("Window Closing.....");
}
public void windowIconified(WindowEvent e)
{
System.out.println("Window Iconified.....");
}
public void windowDeiconified(WindowEvent e)
{
System.out.println("Window DeIconified.....");
}

}
class Event_New
{
public static void main(String args[])
{
Events e1 = new Events();
}
}
