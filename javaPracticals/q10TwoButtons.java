import java.awt.*;
import java.awt.event.*;

public class q10TwoButtons{
	public static void main(String[] args){
		GUI candy = new GUI();
		candy.addWindowListener(new MyWindowListener());
	}
}

class GUI extends Frame implements ActionListener{
	
	private Button b1;
	private Button b2;
	
	public GUI(){
		setTitle("TwoButtons");
		setSize(400,250);
		setLocation(100,100);
		setVisible(true);
		setLayout(null);
		
		b1 = new Button("RED");
		b2 = new Button("BLUE");
		
		add(b1);
		add(b2);
		
		b1.setBounds(50, 100, 100, 50);
		b2.setBounds(250, 100, 100, 50);
		
		b1.setBackground(Color.BLACK);
		b2.setBackground(Color.BLACK);
		
		b1.setForeground(Color.RED);
		b2.setForeground(Color.BLUE); 
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		Button b = (Button)ae.getSource();
		
		if(b == b1){
			setBackground(Color.RED);
		}
		if(b == b2){
			setBackground(Color.BLUE);
		}
	}
	/*b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			setBackground(Color.RED);
		}
	});
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			setBackground(Color.BLUE);
		}
	});*/
}
class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		we.getWindow().dispose();
	}
}
