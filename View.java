
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame{
	
	JFrame frame = new JFrame("Example");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JTextField pol1 = new JTextField(15);
	JTextField pol2 = new JTextField(15);
	JTextField rez = new JTextField(30);
	private JButton suma = new JButton("suma");
	private JButton  dif=new JButton("diferenta");
	private JButton  prod=new JButton("produs");
	private JButton  integ=new JButton("integrare");
	private JButton derivare=new JButton("derivare");
	
	
	public View(){
		
		frame.setLayout(new GridLayout(4,1));
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		JLabel label = new JLabel("Polinom 1: ");
		JLabel label1 = new JLabel("Polinom 2: ");
		p1.add(label);
		p1.add(pol1);
		
		p2.add(label1);
		p2.add(pol2);
		
		
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		JLabel l = new JLabel("Rezultat: ");

		p4.add(l);
		p4.add(rez);
		
		frame.add(p4);
		p3.add(suma);
		p3.add(dif);
		p3.add(prod);
		p3.add(integ);
		p3.add(derivare);
		
		
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	
  public void	updateResult(String s)
	{
	  rez.setText(s);
		
	}
	public String getTextP1(){
		
		return pol1.getText();
		
	}
   public String getTextP2(){
		
		return pol2.getText();
		
	}
	public void setButonSumaListener(ActionListener x)
	{
		suma.addActionListener(x);
	}
	
	public void setButonDiferenta(ActionListener x)
	{
		dif.addActionListener(x);
	}
	
	public void setButonInmultire(ActionListener x)
	{
		prod.addActionListener(x);
	}
	public void setButonDerivare(ActionListener x)
	{
		derivare.addActionListener(x);
	}
	
	public void setButonIntegrare(ActionListener x)
	{
		integ.addActionListener(x);
	}
	
	

	public static void main(String[] args) {
			
	}


	

}
