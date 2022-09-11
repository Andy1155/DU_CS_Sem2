import java.awt.*;
import java.awt.event.*;

public class q11KeyListener{
	public static void main(String[] args){
		new GUI();
	}
}

class GUI extends Frame{
	private Label lkey;
	
	 GUI(){
		setTitle("Entering Key");
		setSize(400,250);
		setLocation(100,100);
		setVisible(true);
		setLayout(new FlowLayout());
		lkey = new Label();
		
		addKeyListener(new MyKeyListener(lkey));
		add(lkey);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
	}
}
class MyKeyListener extends KeyAdapter{
	private Label lkey;
	MyKeyListener(Label lkey){
		this.lkey = lkey;
	}
	
	public void keyTyped(KeyEvent ke){
		char ch = ke.getKeyChar();
		lkey.setText("Typed Character is : " + ch);
	}
}

