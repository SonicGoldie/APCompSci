package Yahtzee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;
import javax.xml.soap.Text;

public class MyComponent extends JComponent implements MouseListener {

    /**
	 * 
	 */
	Font labelfont;
	private static final long serialVersionUID = 1L;
    int labelnum=0;
    boolean b;
	public void mouseClicked(MouseEvent me) {
        //System.out.println("here was a click ! ");
//        TestMain.P1SetScores(1,2,3,4,5);
//        System.out.println(me);
//        System.out.println(me.getSource());
//        Figure out which button was clicked
        JLabel mylabel = (JLabel)me.getSource();
        // set the scoreset and font values if has not been set yet
        b = (boolean) mylabel.getClientProperty("scoreNotSet");
        if(b)
        {
        	//set the font
    		labelfont = mylabel.getFont();
        	mylabel.setFont(labelfont.deriveFont(labelfont.getStyle() | Font.BOLD));
            // set the scorenetset value
    		mylabel.putClientProperty("scoreNotSet",false);
        }


    }

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}