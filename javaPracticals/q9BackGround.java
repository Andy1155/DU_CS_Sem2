import java.awt.*;
import java.awt.event.*;
public class q9BackGround{
	public static void main(String[] args){
		GUI candy = new GUI();
		candy.addWindowListener(new MyWindowListener());
	}
}

class GUI extends Frame{
	private Label l = new Label("Hello World!!!");
	GUI(){
		setSize(300, 200);
		setTitle("Pinky");
		setLocation(100, 100);
		setBackground(Color.PINK);
		setVisible(true);
		setLayout(new FlowLayout());
		add(l);
	}
}

class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		we.getWindow().dispose();
	}
}
