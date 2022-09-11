import java.awt.*;
import java.awt.event.*;

public class q8Mouse{
	
	public static void main(String[] args){
		new GUI();
	}
}
class GUI extends Frame{
	private Label l = new Label();
	private final int initiall = 400, initialh = 250;
	GUI(){
		setSize(initiall, initialh);
		setLocation(100,100);
		setTitle("q8Mouse");
		setLayout(new FlowLayout());
		setVisible(true);
		
		add(l);
		
		addComponentListener(new ComponentAdapter(){
			public void componentResized(ComponentEvent ce){
				addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent me){
						l.setText("Mouse Entered, size is tripled");
						setSize(initiall*3, initialh*3);
					}
					public void mouseClicked(MouseEvent me){
						l.setText("Mouse Clicked, resized to original size");
						setSize(initiall, initialh);
					}
					public void mouseExited(MouseEvent me){
						l.setText("Mouse Exited, Closing app");
						dispose(); 
					}
				}
				);
			}
		
		}
		);
	}
}
