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


public class GeneralQuestionScreen extends JFrame

{
	
	private MainClass main;
	private int questionNumber;
	private int i = 15;
	private Random r;
	private int [] money;
	private int prize;
	private CorrectAnswerScreen crtAnsScr = new CorrectAnswerScreen();
	private WrongAnswerScreen wrgAnsScrn = new WrongAnswerScreen();
	private WonScreen wonScrn = new WonScreen();
	private static URL winSound= (MainScreenGUI.class.getResource("Music/Winner.wav"));
	private JPanel genQuestPanel =  new JPanel(); 
	private JPanel cluePanel =  new JPanel();
	private JPanel audienceChart =  new JPanel();
	private JLabel clueText = new JLabel(); // clue text
	private JLabel moneyImage = new JLabel(); // Money image
	private JLabel moneyPrize = new JLabel(); // Money prize
	private JLabel questions = new JLabel(); // Game Question
	private JButton audienceBtn = new JButton(); // Audience button
	private JButton halfHalfBtn = new JButton(); // 50/50 button -remove 2 wrong answers
	private JButton clueBtn = new JButton(); // Clue button - just hint of the possible answer
	private JButton closeClueButton = new JButton(); // Close clue screen button
	private JButton ans1 = new JButton(); // Answer 1
	private JButton ans2 = new JButton(); // Answer 2
	private JButton ans3 = new JButton(); // Answer 3
	private JButton ans4 = new JButton(); // Answer 4	
	private JButton exitBtn = new JButton(); // Exit button - close game
	 

	public GeneralQuestionScreen(int questionNumber)
{
	money = new int []{0, 250, 500, 750, 3000, 10000, 25000, 50000, 100000, 500000, 1000000,10000000};
	this.questionNumber = questionNumber;
    r = new Random();
	main = new MainClass();
		
    setTitle("Question"); //Set panel title to be called question
	setSize(550,800);// Size of the page (width and height)
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	genQuestPanel.setLayout(null);
	
	genQuestPanel.setBackground(Color.gray);
	add(genQuestPanel).setVisible(true);
	
	// End of j panel screen
	
	cluePanel.setSize(550,200);// Size of the page (width and height)
	cluePanel.setVisible(false);
	cluePanel.setLayout(null);
	cluePanel.setBackground(Color.gray);
	genQuestPanel.add(cluePanel);
	
	// End of clue panel
	
	clueText.setFont(new Font("Dialog", 1,12));
	clueText.setBounds(25,50,500,75);
	cluePanel.add(clueText);
	
	//
	
	
	audienceChart.setSize(550,300);// Size of the page (width and height)
	audienceChart.setVisible(false);
	audienceChart.setLayout(null);
	audienceChart.setBackground(Color.gray);
	genQuestPanel.add(audienceChart);
	
	
	
	// End of clue text
	
	moneyImage.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/Money.png")));
	moneyImage.setBounds(50,25,200,250);
	genQuestPanel.add(moneyImage);
	
	moneyPrize.setText("£"+ money[prize]); // Prize is getting increased by 1, then 2, then 3 if the user get answers right
	moneyPrize.setFont(new Font("Dialog", 1,14));
	moneyPrize.setBounds(50,275,150,30);
	genQuestPanel.add(moneyPrize);
	
	questions.setText(main.getGenArray().get(questionNumber).question);
	questions.setFont(new Font("Dialog", 1,14));
	questions.setBounds(25,350,500,75);// X,Y,Height,Width
	genQuestPanel.add(questions);
	
	audienceBtn.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/Audience.jpg")));
	audienceBtn.setBounds(270,25,170,75);
    genQuestPanel.add(audienceBtn);
    
     
    halfHalfBtn.setText("50/50");
    halfHalfBtn.setFont(new Font ("Bold", 1,24));
    halfHalfBtn.setBounds(265,105,178,70);
    
    halfHalfBtn.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		fiftyFifty();
    	}
    });
    genQuestPanel.add(halfHalfBtn);

    clueBtn.setIcon(new ImageIcon(TechnologyQuestionScreen.class.getResource("Image/QuestionClue.jpg")));
    clueBtn.setBounds(270,180,170,75);
    clueBtn.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		giveClue();
    	}
    });
    
    genQuestPanel.add(clueBtn);
    
    closeClueButton.setText("Close");
    closeClueButton.setFont(new Font ("Bold", 1,12));
    closeClueButton.setBounds(165,110,100,50);
    closeClueButton.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent evt) 
        {
        	giveClueClose();
        }
    });
    cluePanel.add(closeClueButton);
	

    ans1.setText(main.getGenArray().get(questionNumber).getPossibleAns1()); // Answer 1, All answers will be in different orders
    ans1.setFont(new Font ("Bold", 1,14));
    ans1.setBounds(50,425,225,100);
    ans1.addActionListener(new ActionListener() 
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		checkAnswer(ans1.getText()); // Checks which answer is the correct answer for the question
    	}
    	
    });
    genQuestPanel.add(ans1);
    
    
    ans2.setText(main.getGenArray().get(questionNumber).getPossibleAns2()); // Answer 2
    ans2.setFont(new Font ("Bold", 1,14));
    ans2.setBounds(50,550,225,100);
    ans2.addActionListener(new ActionListener() 
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		checkAnswer(ans2.getText()); // Checks which answer is the correct answer for the question
    	}
    	
    });
    genQuestPanel.add(ans2);
    
    ans3.setText(main.getGenArray().get(questionNumber).getPossibleAns3()); // Answer 3
    ans3.setFont(new Font ("Bold", 1,14));
    ans3.setBounds(280,425,225,100);
    ans3.addActionListener(new ActionListener() 
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		checkAnswer(ans3.getText()); // Checks which answer is the correct answer for the question
    	}
    	
    });
    genQuestPanel.add(ans3);
    
    ans4.setText(main.getGenArray().get(questionNumber).getPossibleAns4()); // Answer 4
    ans4.setFont(new Font ("Bold", 1,14));
    ans4.setBounds(280,550,225,100);
    ans4.addActionListener(new ActionListener() 
    {
    	public void actionPerformed(ActionEvent evt)
    	{
    		checkAnswer(ans4.getText()); // Checks which answer is the correct answer for the question
    	}
    	
    });
    genQuestPanel.add(ans4);
    
    exitBtn.setText("Exit");
    exitBtn.setFont(new Font ("Bold", 1,24));
    exitBtn.setBounds(265,260,178,70);
    genQuestPanel.add(exitBtn);
    
    exitBtn.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent evt) 
        {
            jbuttonClose();
        }
    });
    
    validate();
}

    public void jbuttonClose()
    {
        this.dispose();
    }
    
     
     private void fiftyFifty()
     {
    	 if (ans1.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[0]) || ans1.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[1]))
    	 {
    		 ans1.setVisible(false);
    		 halfHalfBtn.setVisible(false);
    	 }
    	 
    	 if (ans2.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[0]) || ans2.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[1]))
    	 {
    		 ans2.setVisible(false);
    		 halfHalfBtn.setVisible(false);
    	 }
    	 
    	 if (ans3.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[0]) || ans3.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[1]))
    	 {
    		 ans3.setVisible(false);
    		 halfHalfBtn.setVisible(false);
    	 }
    	 
    	 if (ans4.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[0]) || ans4.getText().equals(main.getGenArray().get(questionNumber).fiftyFifty[1]))
    	 {
    		 ans4.setVisible(false);
    		 halfHalfBtn.setVisible(false);
    	 }
     }   
     
     private void giveClue()
     {
    	 cluePanel.setVisible(true);
    	 clueText.setText(main.getGenArray().get(questionNumber).giveClue);
    	 
     }
     
     private void giveClueClose()
     {
    	 cluePanel.setVisible(false);
    	 clueBtn.setVisible(false);
    	 
     }
     
     public static void sound (URL sound)
		{
			try 
			{
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
			}
			
			catch (Exception excep)
			{
				excep.printStackTrace(System.out);
			}
		}
     
     
     private void checkAnswer(String Questions) {
    	 if (Questions.equals(main.getGenArray().get(questionNumber).correctAns)) // Checks if correct answer equals the clicked answer
    	 {   
    		 crtAnsScr.setVisible(true);
    		 crtAnsScr.setModal(true);
    		 main.getGenArray().remove(questionNumber);
    		 i = i -1;
    		 prize =  prize + 1;
    		 moneyPrize.setText("£"+ money[prize]);
    		 questionNumber = r.nextInt(i);
    		 questions.setText(main.getGenArray().get(questionNumber).question);
    		 ans1.setText(main.getGenArray().get(questionNumber).getPossibleAns1());
    		 ans1.setVisible(true);
    		 ans2.setText(main.getGenArray().get(questionNumber).getPossibleAns2());
    		 ans2.setVisible(true);
    		 ans3.setText(main.getGenArray().get(questionNumber).getPossibleAns3());
    		 ans3.setVisible(true);
    		 ans4.setText(main.getGenArray().get(questionNumber).getPossibleAns4());
    		 ans4.setVisible(true);
    		 
    	    	if(i == 4)
             	{
             	    wonScrn.setVisible(true);
             	    crtAnsScr.setVisible(false);
             	    wrgAnsScrn.setVisible(false);
             	    sound(winSound);
             	    this.dispose();
             	 }
          
        	 }
        	 	
    	 
    	 else 
    	 {   
    		 wrgAnsScrn.setModal(true);
    		 wrgAnsScrn.setVisible(true);
    		 wrgAnsScrn.setFocusable(isFocusable());
    		 this.dispose();
    		 
    	 }
    	 
    	 
    	 
     }
     
     
}