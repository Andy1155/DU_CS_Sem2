package gui_first;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    JLabel nulllabel = new JLabel("   ");
    public Click(){
        frame = new JFrame("gggg");
        JButton button = new JButton("don't click me");
        button.addActionListener(this);


        label = new JLabel("number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createMatteBorder(30,30,30,30,Color.blue));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(nulllabel);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String []args){
        new Click();
    }

    public void actionPerformed(ActionEvent e){
        count++;
        panel.setBorder(BorderFactory.createMatteBorder(count,count,count,count, Color.getHSBColor((float) count/100, (float) count/100,(float) count/100)));
        nulllabel.setText(String.valueOf(count));
        if(count > 20){
            label.setText("legend!");
        }
        else if(count > 10){
            label.setText("u phsycopath");
        }
        else {
            label.setText("number of clicks: " + count);
        }
    }
}
