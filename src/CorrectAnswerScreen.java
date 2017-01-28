import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CorrectAnswerScreen extends JFrame
{
	private JPanel crrtAnsScr =  new JPanel();
	private JLabel correctAnsText = new JLabel();
	private JButton exitbutton = new JButton();
	


public CorrectAnswerScreen()
{
	setVisible(false);
	setSize(450,200);// Size of the page (width and height)
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	crrtAnsScr.setLayout(null);
	
	crrtAnsScr.setBackground(Color.gray);
	add(crrtAnsScr);
	
	correctAnsText.setText("Correct Answer, Well Done!!!");
	correctAnsText.setFont(new Font("Dialog", 1,18));
	correctAnsText.setBounds(80,50,400,75);
	crrtAnsScr.add(correctAnsText);
	
	exitbutton.setText("Close");
	exitbutton.setFont(new Font ("Bold", 1,12));
	exitbutton.setBounds(165,110,100,50);
	exitbutton.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent evt) 
        {
            exitbuttonClose();
        }
    });
	crrtAnsScr.add(exitbutton);
	
}

public void exitbuttonClose()
{
    this.dispose();
}



public void setModal(boolean b) {	
}

}