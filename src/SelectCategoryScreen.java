import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SelectCategoryScreen extends JFrame
{
   private int index1; // Creating new integer value called index1
   private Random r; // Creating a random called r
   private JPanel categoryscreen = new JPanel(); // Making new j panel called category screen
   private JLabel pSelect = new JLabel(); // Using j label to display some text
   private JButton techCatButton = new JButton(); // Making a button to select technology questions
   private JButton generalCatButton = new JButton(); // Making a button to select general questions
   private JButton gameCatButton = new JButton(); // Making a button to select game questions
   
	
	public SelectCategoryScreen()
	{ 

		r = new Random(); // r is equal to a random value -  Nothing yet 
		index1 = r.nextInt(14); // Index 1 is equal to a random number between 0 - 14
		
		// I am using this method to get a number between 0 - 14
		// So i can use these numbers as question numbers from the main class array list

		setTitle("Category Screen"); // Set panel title to category screen 
		setSize(500,800);// Size of the page (width and height)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		categoryscreen.setLayout(null); // Layout for the category panel 
		
		categoryscreen.setBackground(Color.gray); // Gray background
		add(categoryscreen); // Adding category screen to j frame
		
		// End of category screen settings
		
		
		// J label used to ask player to pick a category
		
		pSelect.setText("Pick A Question Category"); // Setting text onto this j label
		pSelect.setFont(new Font ("Dialog", 1,30)); // Setting font and text size
		pSelect.setBounds(20,50,600,50); // Setting the j labels location
		categoryscreen.add(pSelect); // Adding the j label into the category screen
		
		
		//Technology category button methods
		
		techCatButton.setText("Technology Questions"); // Sets text into the button
		techCatButton.setFont(new Font ("Dialog", 1,32)); // Set font and text size
		techCatButton.setBounds(20,150,450,50); // Setting the button's location
		
		techCatButton.addActionListener (new ActionListener() // Adding an action to the button
		{
			public void actionPerformed (ActionEvent evt) // Adding events to the action listener of what it will do
			{
					TechnologyQuestionScreen techQuestDialog = new TechnologyQuestionScreen(index1);
					// Adding 15 random numbers to the technology question screen
					techQuestDialog.setVisible(true); // Opens the technology question screen dialog 
					dispose();
			}
				
		});
		categoryscreen.add(techCatButton); // Adding button into the category screen
		
		// End of technology category button methods
		
		
		// General category question button methods
		
		generalCatButton.setText("General Questions"); // Sets text into the button
		generalCatButton.setFont(new Font ("Dialog", 1,32)); // Set font and text size
		generalCatButton.setBounds(20,250,450,50); // Setting the button's location
		
		generalCatButton.addActionListener (new ActionListener() // Adding an action to the button
		{
			public void actionPerformed (ActionEvent evt) // Adding events to the action listener of what it will do
			{	
				GeneralQuestionScreen genQuestDialog = new GeneralQuestionScreen(index1);
				genQuestDialog.setVisible(true);
				dispose();
			}
		});
		categoryscreen.add(generalCatButton); // Adding button into category screen
		
		// End of general category questions button methods
		
		
		// Game question category button methods
		
		gameCatButton.setText("Game Questions"); // Sets text into the button
		gameCatButton.setFont(new Font ("Dialog", 1,32)); // Set font and text size
		gameCatButton.setBounds(20,350,450,50); // Setting the button's location
		
		gameCatButton.addActionListener (new ActionListener() // Adding an action to the button
		{
			public void actionPerformed (ActionEvent evt) // Adding events to the action listener of what it will do
			{	
					GameQuestionScreen gameQuestDialog = new GameQuestionScreen(index1);
					// Adding 15 random numbers to the general question screen
	 				gameQuestDialog.setVisible(true); // Opens the general question screen dialog	
	 				dispose();
			}
		});
		categoryscreen.add(gameCatButton); // Adding button into category screen
		
		// End of game question category button methods

	}


}
