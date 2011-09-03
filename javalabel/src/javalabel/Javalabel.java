/*
 * To change this template,       choose Tools | Templates
 * and open the template in the editor.
 */
package javalabel;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author valamata
 */
public class Javalabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a label with a plain text
		JLabel northLabel = new JLabel("north ndo maskan");
		//create an icon from an image so we can put it on a label
		ImageIcon labelIcon = new ImageIcon("kude.jpg");
		//create another label with an icon instead of text
		JLabel centralLabel = new JLabel(labelIcon);
		//create another label with an icon
		JLabel southLabel =new JLabel(labelIcon);
		//set the label to display text (as well as Icon)
		southLabel.setText("am from south");
		//create a frame to hold the labels
		JFrame application =new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(northLabel,BorderLayout.NORTH);
		application.add(centralLabel,BorderLayout.CENTER);
		application.add(southLabel,BorderLayout.SOUTH);
		application.setSize(300,300);
		application.setVisible(true);
    }
}
