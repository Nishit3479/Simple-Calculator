import javax.swing.*;
import javax.swing.event.*;
import java.awt.Font;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener{
public static void main(String []args)
{
	new SimpleCalculator();
}
static JTextField tf1;
static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,ba,bs,bm,bd,be,bc;
static JFrame frame;
SimpleCalculator()
{
	frame = new JFrame("Calculator");
	frame.setBounds(780,350,340,300);
	frame.setLayout(null);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	b1 = new JButton("1");
	b1.setBounds(0,50,80,50);
	b1.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b1);
	b1.addActionListener(this);
	
	b2 = new JButton("2");
	b2.setBounds(80,50,80,50);
	b2.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b2);
	b2.addActionListener(this);
	
	b3 = new JButton("3");
	b3.setBounds(160,50,80,50);
	b3.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b3);
	b3.addActionListener(this);
	
	b4 = new JButton("4");
	b4.setBounds(0,100,80,50);
	b4.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b4);
	b4.addActionListener(this);

	b5 = new JButton("5");
	b5.setBounds(80,100,80,50);
	b5.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b5);
	b5.addActionListener(this);
	
	b6 = new JButton("6");
	b6.setBounds(160,100,80,50);
	b6.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b6);
	b6.addActionListener(this);
	
	b7 = new JButton("7");
	b7.setBounds(0,150,80,50);
	b7.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b7);
	b7.addActionListener(this);
	
	b8 = new JButton("8");
	b8.setBounds(80,150,80,50);
	b8.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b8);
	b8.addActionListener(this);
	
	b9 = new JButton("9");
	b9.setBounds(160,150,80,50);
	b9.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b9);
	b9.addActionListener(this);
	
	b0 = new JButton("0");
	b0.setBounds(80,200,80,50);
	b0.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(b0);
	b0.addActionListener(this);
	
	bp = new JButton(".");
	bp.setBounds(0,200,80,50);
	bp.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(bp);
	bp.addActionListener(this);
	
	ba = new JButton("+");
	ba.setBounds(240,50,80,50);
	ba.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(ba);
	ba.addActionListener(this);
	
	bs = new JButton("-");
	bs.setBounds(240,100,80,50);
	bs.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(bs);
	bs.addActionListener(this);
	
	bm = new JButton("×");
	bm.setBounds(240,150,80,50);
	bm.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(bm);
	bm.addActionListener(this);
	
	bd = new JButton("÷");
	bd.setBounds(240,200,80,50);
	bd.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(bd);
	bd.addActionListener(this);
	
	bc = new JButton("C");
	bc.setBounds(240,0,80,49);
	bc.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(bc);
	bc.addActionListener(this);
	
	be = new JButton("=");
	be.setBounds(160,200,80,50);
	be.setFont(new Font("Arial", Font.PLAIN, 25));
	frame.add(be);
	be.addActionListener(this);
	
	tf1 = new JTextField(20);
	tf1.setBounds(0,0,240,50);
	frame.add(tf1);
	tf1.setVisible(true);

	frame.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
	System.out.println(e.getActionCommand());
	if(e.getActionCommand().equals("="))
	{
		tf1.setText(tf1.getText()+" = "+cal(tf1.getText()));
		
	}
	else if(e.getActionCommand().equals("C"))
	{
		tf1.setText(null);
	}
	else
	{
		tf1.setText(tf1.getText()+e.getActionCommand());
	}
}
public static String cal(String str)
{
	char A [] = str.toCharArray();
    String s1 = "";
    String s2 = "";
    String s3 = "";
    double result = 0;
    
    for (int i = 0; i < A.length; i++) {
       if (A[i] >= '0' && A[i] <= '9' || A[i] == '.') 
       {
          if(s3.isEmpty())
          {
             s1 += A[i];
          }
          else
          {
             s2 += A[i];
          }
       }  

       if(A[i] == '+' || A[i] == '-' || A[i] == '×' || A[i] == '÷' && s3 == "") 
       {
          s3 += A[i];
       }
    }

    if (s3.equals("+"))
       result = (Double.parseDouble(s1) + Double.parseDouble(s2));
    else if (s3.equals("-"))
       result = (Double.parseDouble(s1) - Double.parseDouble(s2));
    else if (s3.equals("÷"))
       result = (Double.parseDouble(s1) / Double.parseDouble(s2));
    else
       result = (Double.parseDouble(s1) * Double.parseDouble(s2));          
    return ""+result;
}
}
