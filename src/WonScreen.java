import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class WonScreen extends JFrame
{
	private JPanel millionaireScreen = new JPanel(); // Creating j panel called millionaire screen
	private JLabel congratText = new JLabel(); // Creating j label to congratulate the winner
	private JButton exitbutn = new JButton(); // Creating a button to close the screen 
	private JButton nextPlayer = new JButton(); // Setting next player 2 turn
	private MainScreenGUI main; // Getting informations (objects) from the main class GUI
	private SelectCategoryScreen selectCatScrn ;

	
	
	public WonScreen()
	{	
		selectCatScrn =  new SelectCategoryScreen();
		main = new MainScreenGUI(); // Create new main screen gui called main 
		main.setVisible(false); // Setting the screen's visibility to false
		
		setTitle("Millionaire"); // Set screen title millionaire
		setSize(800,500);// Size of the page (width and height)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Adding the close and minimize button to the window
		millionaireScreen.setLayout(null); //Adding layout to the j panel
		
		millionaireScreen.setBackground(Color.gray); // Setting back ground color to gray
		add(millionaireScreen); // Add millionaire screen to the j frame
		
		
		// Congratulation text 
		
		congratText.setText("Well Done!!! You have just becomed a Millionaire"); // Text to be display as a j label
		congratText.setFont(new Font("Dialog", 1,24)); // Setting font and text size
		congratText.setBounds(70,150,700,150); // Setting location for this j label X,Y,Width,Height
		millionaireScreen.add(congratText); // Adding this j label to the panel
		
		//End of congratulation text 
		
		
		// Exit button

		exitbutn.setText("Exit"); // Set text for button
		exitbutn.setFont(new Font("Dialog", 1,30)); // Set font and text sizes
		exitbutn.setBounds(500,250,200,100); // Set button location X,Y,Width,Height
		
		exitbutn.addActionListener(new ActionListener() // Adding action listener to my exit button
		{
		     public void actionPerformed(ActionEvent e) // Add actions that it will need to perform
		     { 
		        jButtonClose(); // This method will be ran when button is clicked
		     }
		});
		
		millionaireScreen.add(exitbutn);// Adding exit button to millionaire screen
	

		//End of exit button
	
	
	// Player 2 start button
	
	nextPlayer.setText("Play Again"); // Set text for button
	nextPlayer.setFont(new Font("Dialog", 1,30)); // Set font and text sizes
	nextPlayer.setBounds(70,250,350,100); // Set button location X,Y,Width,Height
	
	nextPlayer.addActionListener(new ActionListener() // Adding action listener to my exit button
	{
	     public void actionPerformed(ActionEvent e) // Add actions that it will need to perform
	     { 
	    	 dispose(); 
	    	 selectCatScrn.setVisible(true); 
	     }
	});
	
	millionaireScreen.add(nextPlayer); 
}

	// End of Player 2 start button
	
	private void jButtonClose() // Exit button method
		{
			this.dispose(); // Closes the WonScreen
			main.setVisible(true); // Opens main page by setting it to visible
		}
			
				
}

	
