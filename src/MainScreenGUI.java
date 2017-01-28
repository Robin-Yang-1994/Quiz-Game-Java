import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainScreenGUI extends JFrame
{
	private JPanel jpanel = new JPanel(); // MainScreen user interface
	private JLabel zillionaireimage = new JLabel(); // Main picture
	private JButton playbutn = new JButton(); // Start game button
	private JButton exitbutn = new JButton(); // Exit game button
	private static Clip clip;
	private static URL sound = (MainScreenGUI.class.getResource("Music/intro.wav")); // Getting the sound url from music folder

	
	
	
	public MainScreenGUI()
	{
		
		setTitle("Zillionaire"); // Set panel title to zillionaire
		setVisible(true); // Showing the created screen after it has been created
		setSize(600,800);// Size of the page (width and height)

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Adding the close and minimize button to the window 
		
		jpanel.setLayout(null); // Setting the layout to absolute
        jpanel.setBackground(Color.gray); // J panel uses and sets the background to a gray color
		
		zillionaireimage.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/Millionaire logo.png")));
		// Getting the millionaire image from the image folder and using it in the j panel
		zillionaireimage.setBounds(135,25,325,340); //Using set bounds, i can position the the picture where i wanted
		jpanel.add(zillionaireimage); // This adds the zillionaire image to the j panel
		
		add(jpanel); // Adds the j panel to the j frame
		
		playbutn.setText("Play"); // Sets the button text to the String
		playbutn.setFont(new Font("Dialog", 1,30)); // Setting fonts and sizes on the button
		playbutn.setBounds(134,355,325,100); // X,Y,Width,Height
		jpanel.add(playbutn); // Adding play button into the j panel
		
		playbutn.addActionListener (new ActionListener() // Adding action to the button so the play button performs a action
		{
			public void actionPerformed (ActionEvent evt) // Perform the following actions
			{
				NumberOfPlayers Numberofplayersdialog = new NumberOfPlayers(); // Setting the name dialog to the number of players screen 
				dispose(); // Close the current J panel
				Numberofplayersdialog.setVisible(true); // Open the number of players screen 
				clip.stop(); // Sttop the music from player when you click the play button
			
			}
		}); // This main menu screen will close when the user clicks on the play button and the next page will show
		
		exitbutn.setText("Exit"); // Sets the button text to the String
		exitbutn.setFont(new Font("Dialog", 1,30)); // Setting fonts and sizes on the button
		exitbutn.setBounds(134,480,325,100); // X,Y,Width,Height
		
		
		exitbutn.addActionListener(new ActionListener() //Using exit button to create new action listener 
		{ 
		     public void actionPerformed(ActionEvent e)
		     {
		         jButtonClose();// Call another method in the same class which will close this J frame
		    }
		});

		jpanel.add(exitbutn); // Adding play button into the j panel
		
		validate(); // Validates the image before putting on to the JPanel
	}

	public static void sound (URL sound) // Method for zillionaire sound
	{
		try 
		{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start(); // Play the music
			clip.loop(999999999); // Looping the music until it reaches the given number
		}
		
		catch (Exception excep)
		{
			excep.printStackTrace(System.out);
		}
}
		
		public static void main (String[]args) // This is the method to set a new main screen
									   // Only the main screen will have this method
			{
				MainScreenGUI M = new MainScreenGUI();
				sound(sound);
				
				}	

			public void jButtonClose() // When the exit button is clicked/called, it will activate this method
				{						   
					this.dispose(); // Closes the main screen 
	                clip.stop(); // Stopping the music when the you click the cloes button
				}
			
			
	
}

