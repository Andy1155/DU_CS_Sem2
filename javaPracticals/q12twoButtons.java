import java.awt.*;
import java.awt.event.*;

public class q12twoButtons{
	public static void main(String[] args){
		new GUI();
	}
}

class GUI extends Frame implements ActionListener{

	Button A;
	Button B;
	TextField t;
	GUI(){
		setTitle("Student Details");
		setSize(800, 400);
		setLocation(100,100);
		setVisible(true);
		setLayout(null);
		
		A = new Button("A");
		B = new Button("B");
		t = new TextField("");
		t.setBackground(Color.BLUE);
		t.setForeground(Color.YELLOW);
		t.setBounds(200, 100, 400, 50);
		A.setBounds(200, 200, 200, 50);
		B.setBounds(400, 200, 200, 50);
		
		add(A);
		add(B);
		add(t);
		
		A.addActionListener(this);
		B.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
	}
	public void actionPerformed(ActionEvent ae){
		Button b = (Button)ae.getSource();
		if(b == A){
			t.setText("And Munkhzul, 3500, Hansraj College DU");
		}
		if(b == B){
			t.setText("CGPA 9.36");
		}
		
	}
	
}
