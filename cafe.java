import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code =cafe.class height=2500 width=2500>
</applet>
*/


public class cafe extends JApplet implements ActionListener
{
	Container co;
	JButton b1;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26;
	JLabel l1,l2,l3,l4,l5;
	ImageIcon im;
	Font f =new Font("Chiller",Font.BOLD,36);
		

	public cafe()
	{
		co=getContentPane();
		co.setLayout(null);
		co.setBackground(Color.orange);

		Label l1 = new Label("@SNACK_POINT");
		l1.setFont(f);

		b1=new JButton("Order");
		im=new ImageIcon("Malshej Ghat.jpg");		
	
		l2=new JLabel("--Pizza's--");
		l2.setFont(f);
		
		c1=new JCheckBox("Spicy Pizza...................@RS.119");
		c2=new JCheckBox("Chees Pizza..................@RS.99");
		c3=new JCheckBox("BBQ Chicken Pizza.....@RS.199");
		c4=new JCheckBox("Pepperoni Pizza..........@RS.149");
		c5=new JCheckBox("Hawaiian Pizza............@RS.129");

		l3=new JLabel("--Dessert's--");
		l3.setFont(f);

		c6=new JCheckBox("Vanilla..................@RS.79");
		c7=new JCheckBox("Strawerry...........@RS.69");
		c8=new JCheckBox("Tutty_Fruity..........@RS.49");
		c9=new JCheckBox("Mango...................@RS.99");
		c10=new JCheckBox("Chocolate...........@RS.89"); 		
		c11=new JCheckBox("Malai_Kulfi................@RS.75");
		c12=new JCheckBox("Kaju_Kishmish...........@RS.59");
		c13=new JCheckBox("Kesar_Pista.....@RS.49");

		l4=new JLabel("--Sandwiches--");
		l4.setFont(f);
		
		c14=new JCheckBox("Cheese Sandwiches.............@RS.119");
		c15=new JCheckBox("Grilled Cheese Sandwiches.....@RS.99");
		c16=new JCheckBox("Bacon Sandwiches..............@RS.199");
		c17=new JCheckBox("Beef Sandwiches...............@RS.149");
		c18=new JCheckBox("Toast_Sandwiches..............@RS.49");

		l5=new JLabel("--Shakes--");
		l5.setFont(f);
		
		c19=new JCheckBox("Mexican Chocolate Milkshakes..........@RS.149");
		c20=new JCheckBox("Bourbon Chocolate Milkshake...........@RS.199");
		c21=new JCheckBox("White Chocolate Raspberry Milkshake...@RS.199");
		c22=new JCheckBox("Ice Cream Sandwich Milkshake..........@RS.149");
		c23=new JCheckBox("Brown Butter Peach Milkshake..........@RS.79");
		c24=new JCheckBox("Vanilla Malt Milkshake................@RS.99");
		c25=new JCheckBox("Marshmallow Milkshake.................@RS.199");
		c26=new JCheckBox("Biscoff Milkshake.....................@RS.79");
		
		l1.setBounds(500,10,500,50);
		l2.setBounds(140,70,350,50);
		l3.setBounds(360,70,350,50);	
		l4.setBounds(580,70,350,50);
		l5.setBounds(900,70,350,50);	

		c1.setBounds(140,130,200,50);
		c2.setBounds(140,170,200,50);
		c3.setBounds(140,210,200,50);
		c4.setBounds(140,250,200,50);
		c5.setBounds(140,290,200,50);

		c6.setBounds(360,130,200,50);
		c7.setBounds(360,170,200,50);
		c8.setBounds(360,210,200,50);
		c9.setBounds(360,250,200,50);
		c10.setBounds(360,290,200,50);
		c11.setBounds(360,330,200,50);
		c12.setBounds(360,370,200,50);
		c13.setBounds(360,410,200,50);

		c14.setBounds(580,130,250,50);
		c15.setBounds(580,170,250,50);
		c16.setBounds(580,210,250,50);
		c17.setBounds(580,250,250,50);
		c18.setBounds(580,290,250,50);

		c19.setBounds(850,130,300,50);
		c20.setBounds(850,170,300,50);
		c21.setBounds(850,210,300,50);
		c22.setBounds(850,250,300,50);
		c23.setBounds(850,290,300,50);
		c24.setBounds(850,330,300,50);
		c25.setBounds(850,370,300,50);
		c26.setBounds(850,410,300,50);


		b1.setBounds(600,500,100,50);
		b1.addActionListener(this);

		co.add(c1);
		co.add(c2);
		co.add(c3);
		co.add(c4);
		co.add(c5);
		
		co.add(c6);
		co.add(c7);
		co.add(c8);
		co.add(c9);
		co.add(c10);
		co.add(c11);
		co.add(c12);
		co.add(c13);

		co.add(c14);
		co.add(c15);
		co.add(c16);
		co.add(c17);
		co.add(c18);

		co.add(c19);
		co.add(c20);
		co.add(c21);
		co.add(c22);
		co.add(c23);
		co.add(c24);
		co.add(c25);
		co.add(c26);
			
		co.add(l1);
		co.add(l2);
		co.add(l3);
		co.add(l4);
		co.add(l5);
	
		co.add(b1);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		float amt=0;
		String msg=" ";
	
		if(c1.isSelected())
		{
			amt=amt+119;
			msg=msg+"Spicy Pizza @RS.119\n";
		}
		if(c2.isSelected())
		{
			amt=amt+99;
			msg=msg+"Chees Pizza @RS.99\n";
		}
		if(c3.isSelected())
		{
			amt=amt+199;
			msg=msg+"BBQ Chicken Pizza @RS.199\n";
		}
		if(c4.isSelected())
		{
			amt=amt+149;
			msg=msg+"Pepperoni Pizza @RS.149\n";
		}
		if(c5.isSelected())
		{
			amt=amt+129;
			msg=msg+"Hawaiian Pizza @RS.129\n";
		}

		if(c6.isSelected())
		{
			amt=amt+79;
			msg=msg+"Vanilla @RS.79\n";
		}
		if(c7.isSelected())
		{
			amt=amt+69;
			msg=msg+"Strawerry @RS.69\n";
		}
		if(c8.isSelected())
		{
			amt=amt+49;
			msg=msg+"Tutty_Fruity @RS.49\n";
		}
		if(c9.isSelected())
		{
			amt=amt+99;
			msg=msg+"Mango @RS.99\n";
		}
		if(c10.isSelected())
		{
			amt=amt+89;
			msg=msg+"Chocolate @RS.89\n";
		}
		if(c11.isSelected())
		{
			amt=amt+75;
			msg=msg+"Malai_Kulfi @RS.75\n";
		}
		if(c12.isSelected())
		{
			amt=amt+59;
			msg=msg+"Kaju_Kishmish @RS.59\n";
		}
		if(c13.isSelected())
		{
			amt=amt+49;
			msg=msg+"Kesar_Pista @RS.49\n";
		}

		if(c14.isSelected())
		{
			amt=amt+119;
			msg=msg+"Cheese Sandwiches @RS.119\n";
		}
		if(c15.isSelected())
		{
			amt=amt+99;
			msg=msg+"Grilled Cheese Sandwiches @RS.99\n";
		}
		if(c16.isSelected())
		{
			amt=amt+199;
			msg=msg+"Bacon Sandwiches @RS.199\n";
		}
		if(c17.isSelected())
		{
			amt=amt+149;
			msg=msg+"Beef Sandwiches @RS.149\n";
		}
		if(c18.isSelected())
		{
			amt=amt+49;
			msg=msg+"Toast_Sandwiches @RS.49\n";
		}
		
		if(c19.isSelected())
		{
			amt=amt+149;
			msg=msg+"Mexican Chocolate Milkshakes @RS.149\n";
		}
		if(c20.isSelected())
		{
			amt=amt+199;
			msg=msg+"Bourbon Chocolate Milkshake @RS.199\n";
		}
		if(c21.isSelected())
		{
			amt=amt+199;
			msg=msg+"White Chocolate Raspberry Milkshake @RS.199\n";
		}
		if(c22.isSelected())
		{
			amt=amt+149;
			msg=msg+"Pepperoni Pizza @RS.149\n";
		}
		if(c23.isSelected())
		{
			amt=amt+79;
			msg=msg+"Brown Butter Peach Milkshake @RS.79\n";
		}

		if(c24.isSelected())
		{
			amt=amt+99;
			msg=msg+"Vanilla Malt Milkshake @RS.99\n";
		}
		if(c25.isSelected())
		{
			amt=amt+199;
			msg=msg+"Marshmallow Milkshake @RS.199\n";
		}
		if(c26.isSelected())
		{
			amt=amt+79;
			msg=msg+"Biscoff Milkshake @RS.79\n";
		}
		JOptionPane.showMessageDialog(this,msg+"Total :"+amt);
	}


		public static void main(String args[])
		{
			new cafe();
		}

}
