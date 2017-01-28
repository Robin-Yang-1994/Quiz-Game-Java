import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WrongAnswerScreen extends JFrame
{
	private MainScreenGUI main;
	private JPanel wrongAnsScr =  new JPanel();
	private JLabel wrongAnsText = new JLabel();
	private JButton exitbutton = new JButton();
	


public WrongAnswerScreen()
{	
	main = new MainScreenGUI();
	main.setVisible(false);
	
	setTitle("You lost");
	setSize(450,200);// Size of the page (width and height)
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	wrongAnsScr.setLayout(null);
	
	wrongAnsScr.setBackground(Color.gray);
	add(wrongAnsScr);
	
	wrongAnsText.setText("Unlucky, Wrong Answer. You Lost!!!");
	wrongAnsText.setFont(new Font("Dialog", 1,18));
	wrongAnsText.setBounds(25,50,400,75);
	wrongAnsScr.add(wrongAnsText);
	
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
    
    wrongAnsScr.add(exitbutton);
	
}

	public void exitbuttonClose()
	{
		main.setVisible(true);
		this.dispose();
		
	}
	

	public void setModal(boolean b) 
	{
		
	}
}