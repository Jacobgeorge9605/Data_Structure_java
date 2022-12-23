import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Eve implements ActionListener
{
	JFrame f = new JFrame();
	JButton b1 = new JButton("CLEAR");
	JButton b2 = new JButton("   SUM   ");
	JButton b3 = new JButton("DIFFERENCE");
	JButton b4 = new JButton("PRODUCT");
	JButton b5 = new JButton("DIVISION");
	JButton b6 = new JButton("MODULUS");
	JTextField t1 = new JTextField(5);
	JTextField t2 = new JTextField(5);
	JTextField t3 = new JTextField(10);
	JLabel l1 = new JLabel("First number:");
	JLabel l2 = new JLabel("Second number:");
	JLabel l3 = new JLabel("OUTPUT:");
	//Label l4 = new Label(Difference : );
	//Label l5 = new Label(Multiplication : );
	//Label l6 = new Label(Division : );
	
	public Eve()
	{
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b1);
		f.add(l3);
		f.add(t3);
		
		
		f.setVisible(true);
		f.setSize(400,600);
		f.setLayout(new GridLayout(6,2));
		b1.addActionListener(this);
		b1.setBackground(Color.ORANGE);
                b1.setForeground(Color.BLACK);
		b2.addActionListener(this);
		b2.setBackground(Color.YELLOW);
    		b2.setForeground(Color.BLACK);
		b3.addActionListener(this);
		b3.setBackground(Color.PINK);
    		b3.setForeground(Color.BLACK);
		b4.addActionListener(this);
		b4.setBackground(Color.WHITE);
                b4.setForeground(Color.BLACK);
		b5.setBackground(Color.RED);
    		b5.setForeground(Color.YELLOW);
		b5.addActionListener(this);
		b6.setBackground(Color.BLACK);
    		b6.setForeground(Color.YELLOW);
		b6.addActionListener(this);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(t3);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
		if(e.getSource() == b2)
		{
		
			String s1 = t1.getText();
			int a = Integer.parseInt(s1);
			String s2 = t2.getText();
			int b = Integer.parseInt(s2);
			int c = a+b;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource() == b3)
		{
			String s1 = t1.getText();
			int a = Integer.parseInt(s1);
			String s2 = t2.getText();
			int b = Integer.parseInt(s2);
			int c = a-b;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource() == b4)
		{
			String s1 = t1.getText();
			int a = Integer.parseInt(s1);
			String s2 = t2.getText();
			int b = Integer.parseInt(s2);
			int c = a*b;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource() == b5)
		{
			String s1 = t1.getText();
			int a = Integer.parseInt(s1);
			String s2 = t2.getText();
			int b = Integer.parseInt(s2);
			int c = a/b;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource() == b6)
		{
			String s1 = t1.getText();
			int a = Integer.parseInt(s1);
			String s2 = t2.getText();
			int b = Integer.parseInt(s2);
			int c = a%b;
			t3.setText(Integer.toString(c));
		}
		
		
		
		 
		
	}
}
class SwingCalculator
{

	public static void main(String args[])
	{
		Eve e = new Eve();
	}
}
	