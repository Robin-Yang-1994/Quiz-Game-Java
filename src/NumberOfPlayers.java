import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class NumberOfPlayers extends JFrame {
	
	private JPanel playerMenu =  new JPanel(); // J panel called player menu 
	private JLabel title = new JLabel(); // Title which asks the player to enter their name in the following text fields
	private JLabel selectedP1Image = new JLabel(); // Image to inform the user player 1 has been added
	private JLabel selectedP2Image = new JLabel(); // Image to inform the user player 2 has been added
	private JLabel selectedP3Image = new JLabel(); // Image to inform the user player 3 has been added
	private JLabel hostimage =  new JLabel(); // This is a of the host
	private JTextField p1Name = new JTextField(12); // Text field for player 1 to enter their name
	private JTextField p2Name = new JTextField(12); // Text field for player 2 to enter their name
	private JTextField p3Name = new JTextField(12); // Text field for player 3 to enter their name
	private JButton addP1Butn = new JButton(); // Add player 1 button
	private JButton addP2Butn = new JButton(); // Add player 2 button
	private JButton addP3Butn = new JButton(); // Add player 3 button
	private JButton startButn = new JButton(); // Start game Button
	private MainClass main; // Gets information from the main class
	
	
	public NumberOfPlayers()
{
		
    setTitle("PlayerMenu"); // Set panel title to player menu screen
	setVisible(true); // Showing the created screen after it has been created
	setSize(600,800);// Size of the page (width and height)
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Adding the close and minimize button to the window
	playerMenu.setLayout(null); // Added a layout to move objects
	
	playerMenu.setBackground(Color.gray); // Background
	add(playerMenu); // Adding player Menu to the j frame
	
	title.setText("Enter Name"); // Setting string to the title j label text
	title.setFont(new Font ("Dialog", 1,32)); // Setting fonts and sizes on the button
	title.setBounds(20,25,600,50); // X,Y,Width,Height
	playerMenu.add(title); // This adds the j label to the j panel

	
	// Adding player 1 text field box, this box allows the first player to enter their names

	String initialText = "Enter Your Name"; // Setting the initial text 
	p1Name.setText(initialText); // "Enter Your Name" will be written into the first text box 
	p1Name.selectAll(); // Select all the initial text so the player can delete all text from first text box by clicking 1 button
	p1Name.setBounds(20,100,360,50); // X,Y,Width,Height
	playerMenu.add(p1Name); //Adding this text field into the player menu
	
	// End of player text field boxes
	
	
	//Player 2 text field boxes
	
	String initialText2 = "Enter Your Name"; // Setting the initial text 
	p2Name.setText(initialText2); // "Enter Your Name" will be written into the first text box
	p2Name.setBounds(20,200,360,50); // X,Y,Width,Height
	playerMenu.add(p2Name); //Adding this text field into the player menu
		
	// End of player 2 text field boxes
		
		
	// Player 3 text field boxes
		
	String initialText3 = "Enter Your Name"; // Setting the initial text 
	p3Name.setText(initialText3); // "Enter Your Name" will be written into the first text box
	p3Name.setBounds(20,300,360,50);  // X,Y,Width,Height
	playerMenu.add(p3Name); //Adding this text field into the player menu
		
	// End of player 3 text field boxes
		
	
	//  Adding player 1 button
	
	addP1Butn.setText("Add P1"); // Giving text to the button called Add P1
	addP1Butn.setFont(new Font("Dialog", 1,16)); // Set text font and size
	addP1Butn.setBounds(400,100,150,50); // Set location X,Y,Width,Height
	
	addP1Butn.addActionListener(new ActionListener() // New action listener for add player 1 button
	{
		public void actionPerformed(ActionEvent evt) // Set action
		{
			addPlayer1(); // Setting a method and will be called when button is clicked
		}
	});
	
	playerMenu.add(addP1Butn); // Add button to the player menu panel
	
	
	// Add player 2 button
	
	addP2Butn.setText("Add P2"); // Giving text to the button called Add P1
	addP2Butn.setFont(new Font("Dialog", 1,16)); // Set text font and size
	addP2Butn.setBounds(400,200,150,50); // Set location X,Y,Width,Height
	
	addP2Butn.addActionListener(new ActionListener() // New action listener for add player 2 button
	{
		public void actionPerformed(ActionEvent evt) // Set action
		{
			addPlayer2(); // Setting a method and will be called when button is clicked
		}
	});
	
	playerMenu.add(addP2Butn); // Add button to the player menu panel
	
	
	// Add player 3 button

	addP3Butn.setText("Add P3"); // Giving text to the button called Add P1
	addP3Butn.setFont(new Font("Dialog", 1,16)); // Set text font and size
	addP3Butn.setBounds(400,300,150,50); // Set location X,Y,Width,Height
	
	addP3Butn.addActionListener(new ActionListener() // New action listener for add player 2 button
	{
		public void actionPerformed(ActionEvent evt) // Set action
		{
			addPlayer3(); // Setting a method and will be called when button is clicked
		}
	});
	
	playerMenu.add(addP3Butn); // Add button to the player menu panel
		
	
	// The host image
	
	hostimage.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/the host.psd"))); // Getting image from image folder
	hostimage.setBounds(50,400, 350, 250); // Setting location for the image
	playerMenu.add(hostimage); // Adding the image to the player menu panel
	
	// Selected P1 image
	
	selectedP1Image.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/select.png"))); // Getting image from image folder
	selectedP1Image.setBounds(548,100,48,48); // Setting location for the image
	selectedP1Image.setVisible(false); // Image is put on to the panel but it will set invisible
	playerMenu.add(selectedP1Image); // Adding the image to the player menu panel
	
	// Selected P2 image
	
	selectedP2Image.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/select.png"))); // Getting image from image folder
	selectedP2Image.setBounds(548,200,48,48); // Setting location for the image
	selectedP2Image.setVisible(false); // Image is put on to the panel but it will set invisible
	playerMenu.add(selectedP2Image); // Adding the image to the player menu panel
	
	// Selected P3 image
	
	selectedP3Image.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/select.png"))); // Getting image from image folder
	selectedP3Image.setBounds(548,300,48,48); // Setting location for the image
	selectedP3Image.setVisible(false); // Image is put on to the panel but it will set invisible
	playerMenu.add(selectedP3Image); // Adding the image to the player menu panel
	
	validate(); // Validates the image before putting on to the playerMenu
	
	
	//Start button
	
	startButn.setText("Start"); // Adding text to the button
	startButn.setFont(new Font("Dialog", 1,32)); // Setting font and sizes for the text
	startButn.setBounds(320,445,200,140); // Setting the button location the j panel X,Y,Width,Height
	playerMenu.add(startButn); // Adding button into the player menu panel
	
	startButn.addActionListener (new ActionListener() // Adding an action for start button to perform
	{ 
		public void actionPerformed (ActionEvent evt) // It will perform the following actions
		{
			SelectCategoryScreen categoryDialog = new SelectCategoryScreen(); // Sets select category screen to name dialog
			dispose(); // Close the current screen - playerMenu
			categoryDialog.setVisible(true); // Making the visible true -  showing the dialog screen. Which is the select category screen
		}	
	});	
	
}

	private void addPlayer1() // Add player 1 button method
	{
		selectedP1Image.setVisible(true); // When called the image will set to visible
	}
	
	private void addPlayer2() // Add player 2 button method
	{
		selectedP2Image.setVisible(true); // When called the image will set to visible
	}
	
	private void addPlayer3() // Add player 3 button method
	{
		selectedP3Image.setVisible(true); // When called the image will set to visible
	}

}
