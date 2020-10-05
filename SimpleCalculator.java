import javax.swing.*;
import javax.swing.event.*;
import java.awt.Font;
import java.awt.Color;
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
	b1.setBackground(Color.BLACK);
	b1.setForeground(Color.white);
	frame.add(b1);
	b1.addActionListener(this);
	
	b2 = new JButton("2");
	b2.setBounds(80,50,80,50);
	b2.setFont(new Font("Arial", Font.PLAIN, 25));
	b2.setBackground(Color.BLACK);
	b2.setForeground(Color.white);
	frame.add(b2);
	b2.addActionListener(this);
	
	b3 = new JButton("3");
	b3.setBounds(160,50,80,50);
	b3.setFont(new Font("Arial", Font.PLAIN, 25));
	b3.setBackground(Color.BLACK);
	b3.setForeground(Color.white);
	frame.add(b3);
	b3.addActionListener(this);
	
	b4 = new JButton("4");
	b4.setBounds(0,100,80,50);
	b4.setFont(new Font("Arial", Font.PLAIN, 25));
	b4.setBackground(Color.BLACK);
	b4.setForeground(Color.white);
	frame.add(b4);
	b4.addActionListener(this);

	b5 = new JButton("5");
	b5.setBounds(80,100,80,50);
	b5.setFont(new Font("Arial", Font.PLAIN, 25));
	b5.setBackground(Color.BLACK);
	b5.setForeground(Color.white);
	frame.add(b5);
	b5.addActionListener(this);
	
	b6 = new JButton("6");
	b6.setBounds(160,100,80,50);
	b6.setFont(new Font("Arial", Font.PLAIN, 25));
	b6.setBackground(Color.BLACK);
	b6.setForeground(Color.white);
	frame.add(b6);
	b6.addActionListener(this);
	
	b7 = new JButton("7");
	b7.setBounds(0,150,80,50);
	b7.setFont(new Font("Arial", Font.PLAIN, 25));
	b7.setBackground(Color.BLACK);
	b7.setForeground(Color.white);
	frame.add(b7);
	b7.addActionListener(this);
	
	b8 = new JButton("8");
	b8.setBounds(80,150,80,50);
	b8.setFont(new Font("Arial", Font.PLAIN, 25));
	b8.setBackground(Color.BLACK);
	b8.setForeground(Color.white);
	frame.add(b8);
	b8.addActionListener(this);
	
	b9 = new JButton("9");
	b9.setBounds(160,150,80,50);
	b9.setFont(new Font("Arial", Font.PLAIN, 25));
	b9.setBackground(Color.BLACK);
	b9.setForeground(Color.white);
	frame.add(b9);
	b9.addActionListener(this);
	
	b0 = new JButton("0");
	b0.setBounds(80,200,80,50);
	b0.setFont(new Font("Arial", Font.PLAIN, 25));
	b0.setBackground(Color.BLACK);
	b0.setForeground(Color.white);
	frame.add(b0);
	b0.addActionListener(this);
	
	bp = new JButton(".");
	bp.setBounds(0,200,80,50);
	bp.setFont(new Font("Arial", Font.PLAIN, 25));
	bp.setBackground(Color.BLACK);
	bp.setForeground(Color.white);
	frame.add(bp);
	bp.addActionListener(this);
	
	ba = new JButton("+");
	ba.setBounds(240,50,80,50);
	ba.setFont(new Font("Arial", Font.PLAIN, 25));
	ba.setBackground(Color.BLACK);
	ba.setForeground(Color.white);
	frame.add(ba);
	ba.addActionListener(this);
	
	bs = new JButton("-");
	bs.setBounds(240,100,80,50);
	bs.setFont(new Font("Arial", Font.PLAIN, 25));
	bs.setBackground(Color.BLACK);
	bs.setForeground(Color.white);
	frame.add(bs);
	bs.addActionListener(this);
	
	bm = new JButton("×");
	bm.setBounds(240,150,80,50);
	bm.setFont(new Font("Arial", Font.PLAIN, 25));
	bm.setBackground(Color.BLACK);
	bm.setForeground(Color.white);
	frame.add(bm);
	bm.addActionListener(this);
	
	bd = new JButton("÷");
	bd.setBounds(240,200,80,50);
	bd.setFont(new Font("Arial", Font.PLAIN, 25));
	bd.setBackground(Color.BLACK);
	bd.setForeground(Color.white);
	frame.add(bd);
	bd.addActionListener(this);
	
	bc = new JButton("AC");
	bc.setBounds(240,0,80,49);
	bc.setFont(new Font("Arial", Font.PLAIN, 25));
	bc.setBackground(Color.BLACK);
	bc.setForeground(Color.white);
	frame.add(bc);
	bc.addActionListener(this);
	
	be = new JButton("=");
	be.setBounds(160,200,80,50);
	be.setFont(new Font("Arial", Font.PLAIN, 25));
	be.setBackground(Color.BLACK);
	be.setForeground(Color.white);
	frame.add(be);
	be.addActionListener(this);
	
	tf1 = new JTextField(20);
	tf1.setBounds(0,0,240,50);
	tf1.setFont(new Font("Arial", Font.PLAIN, 20));
	tf1.setBackground(Color.WHITE);
	tf1.setForeground(Color.black);
	frame.add(tf1);
	tf1.setVisible(true);

	frame.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
	System.out.println(e.getActionCommand());
	if(e.getActionCommand().equals("="))
	{
		tf1.setText(cal(tf1.getText()));
		
	}
	else if(e.getActionCommand().equals("AC"))
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
    String r = Double.toString(result);
    int c=0;
    for(int i=0; i<r.length();i++)
    {
    	int p = r.charAt(i);
    	if(p == '.')
    	{
    		break;
    	}
    	c++;
    }
    int a=0;
    for(int i=c+1; i<r.length();i++)
    {
    	int p = r.charAt(i);
    	if(p == '0')
    	{
    		continue;
    	}
    	else
    	{
    		a=1;
    		break;
    	}
    }
    if(a == 1)
    {
    	s1=s2=s3=null;
    	return r;
    }
    else
    {
    	s1=s2=s3=null;
    	int res = (int)result;
    	return ""+res;
    }
}
}
