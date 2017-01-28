import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainClass {
	
	private ArrayList<QuestionObject> questionListTech;
	private ArrayList<QuestionObject> questionListGen;
	private ArrayList<QuestionObject> questionListGame;
	private int questionNumber;
	
	public MainClass()
	{
		questionListTech = new ArrayList<QuestionObject>(); //Making new question array list for technology questions
		questionListGen = new ArrayList<QuestionObject>(); //Making new question array list for general questions
		questionListGame = new ArrayList<QuestionObject>(); //Making new question array list for game questions

	
		String [] ans0 = new String [] {"2013", "2012", "2010", "2011"}; // Creating the string answers

		String correctAns0 = "2013"; // Question 0 of technology questions
		
		String [] fiftyFifty0 = new String [] {"2010", "2011"};
		
		String giveClue0 = "Released on the same year as the iPhone 5";
		
		QuestionObject technology = new MultiQuestObject("tech", "In which year Apple released the MacBook Pro Retina Display?", ans0, correctAns0, fiftyFifty0, giveClue0); // Adding the questions and answers

		questionListTech.add(technology);
		

		String [] ans1 = new String [] {"O2", "EE", "Vodafone", "3"}; // Question 1 of technology questions

		String correctAns1 = "EE";
		
		String [] fiftyFifty1 = new String [] {"3", "02"};
		
		String giveClue1 = "This company was formed by 2 seperate companies";
		
        QuestionObject technology1  = new MultiQuestObject("tech","Which company in the UK first released 4G mobile data?", ans1, correctAns1, fiftyFifty1, giveClue1);
        
		questionListTech.add(technology1);


		String [] ans2 = new String [] {"Philip Watson", "Steve Jobs", "Alexander Bell", "Patrick Howard"};
		
		String correctAns2 = "Alexander Bell";
		
		String [] fiftyFifty2 = new String [] {"Steve Jobs", "Patrick Howard"};
		
		String giveClue2 = "His last name is a helmet brand";

		QuestionObject technology2  = new MultiQuestObject("tech","Who invented telephones?", ans2, correctAns2, fiftyFifty2, giveClue2);

		questionListTech.add(technology2);


		String [] ans3 = new String [] {"Steve Jobs", "Bill Gates", "Ryan Gosling", "Nigel Title"};

		String correctAns3 = "Bill Gates";
		
		String [] fiftyFifty3 = new String [] {"Nigel Title", "Ryan Gosling"};
		
		String giveClue3 = "He was born in Washington U.S";
		
        QuestionObject technology3 = new MultiQuestObject("tech", "Who Invented Microsoft?",ans3, correctAns3, fiftyFifty3, giveClue3);
        
		questionListTech.add(technology3);

		
		String [] ans4 = new String [] {"Size", "Brightness", "Resolution", "Flexability"};

		String correctAns4 = "Flexability";
		
		String [] fiftyFifty4 = new String [] {"Size", "Brightness"};
		
		String giveClue4 = "It is recently used in the latest mobile phones";
		
        QuestionObject technology4 = new MultiQuestObject("tech", "What's the main feature of an OLED?",ans4, correctAns4, fiftyFifty4, giveClue4);
        
		questionListTech.add(technology4);


		
		String [] ans5 = new String [] {"Computing Power Unit", "Computing Processing Unit", "Central Processing Unit", "Computing Processing Unit "};

		String correctAns5 = "Central Processing Unit";
		
		String [] fiftyFifty5 = new String [] {"Computing Power Unit", "Computing Processing Unit"};
		
		String giveClue5 = "It sits in the motherboard and requires a heat sink to cool it down";
		
        QuestionObject technology5 = new MultiQuestObject("tech", "What does CPU stand for?",ans5, correctAns5, fiftyFifty5, giveClue5);
        
		questionListTech.add(technology5);
		


		String [] ans6 = new String [] {"World Wide Weather", "World Worst Web", "World Weird Web", "World Wide Web"};

		String correctAns6 = "World Wide Web";
		
		String [] fiftyFifty6 = new String [] {"World Worst Web", "World Wide Weather"};
		
		String giveClue6 = "You are searching for something throughout the world";
		
		QuestionObject technology6 = new MultiQuestObject("tech", "What does the abbrivation of WWW stand for?",ans6, correctAns6, fiftyFifty6, giveClue6);

		questionListTech.add (technology6);



		String [] ans7 = new String [] {"Game", "Broswers", "Operating System", "Phone"};

		String correctAns7 = "Broswers";
		
		String [] fiftyFifty7 = new String [] {"Operating System", "Phone"};
		
		String giveClue7 = "These a softwares to access the internet";
		
		QuestionObject technology7 = new MultiQuestObject( "tech", "Safari, FireFox, Opera are types of what?", ans7, correctAns7, fiftyFifty7, giveClue7) ;

		questionListTech.add(technology7);


		String [] ans8 = new String [] {"2009", "2004", "2007", "2011"};

		String correctAns8 = "2007";
		
		String [] fiftyFifty8 = new String [] {"2004", "2011"};
		
		String giveClue8 = "This is the year of the pigs";
		
		QuestionObject technology8 =  new MultiQuestObject("tech", "When did Apple's iphone become first available?", ans8, correctAns8, fiftyFifty8, giveClue8);

		questionListTech.add(technology8);
		

		String [] ans9 = new String [] {"Paul Allen", "Phil Mitchell", "Justin Bieber", "Steve Jobs"};

		String correctAns9 = "Paul Allen";
		
		String [] fiftyFifty9 = new String [] {"Phil Mitchell", "Justin Bieber"};
		
		String giveClue9 = "His last name is used for a fried chicken food business";
		
		QuestionObject technology9 = new MultiQuestObject("tech","Along with whom did Bill Gates found Microsoft?", ans9, correctAns9, fiftyFifty9, giveClue9);

		questionListTech.add(technology9);



		String [] ans10 = new String [] {"Wordperfect document file", "MS office document file", "Movie file", "Image file"};

		String correctAns10 = "Movie file";
		
		String [] fiftyFifty10 = new String [] {"MS office document file", "Wordperfect document file"};
		
		String giveClue10 = "You can watch this file";
		
		QuestionObject technology10 = new MultiQuestObject("tech",".MPG extension refers to usually to what kind of file?", ans10, correctAns10, fiftyFifty10, giveClue10);

		questionListTech.add(technology10);



		String [] ans11 = new String [] {"Video home system", "Very high speed", "Video horizontal standard", "Voltage house standard"};

		String correctAns11 = "Video horizontal standard";
		
		String [] fiftyFifty11 = new String [] {"Very high speed", "Video home system"};
		
		String giveClue11 = "This is a video tape";
		
		QuestionObject technology11 = new MultiQuestObject("tech", "What does VHS stand for?", ans11, correctAns11, fiftyFifty11, giveClue11);

		questionListTech.add(technology11);


		String [] ans12 = new String [] {"Anime", "Game", "Music", "Programming Language"};

		String correctAns12 = "Programming Language";
		
		String [] fiftyFifty12 = new String [] {"Music", "Game"};
		
		String giveClue12 = "More then 3 billion devices uses it";
		
		QuestionObject technology12 = new MultiQuestObject("tech", "Java is a type of what?", ans12, correctAns12, fiftyFifty12, giveClue12);

		questionListTech.add(technology12);


		String [] ans13 = new String [] {"Steve Jobs", "Tim Cook", "Neil Weyland", "Alan Sugar"};

		String correctAns13 = "Tim Cook";
		
		String [] fiftyFifty13 = new String [] {"Steve Jobs", "Alan Sugar"};
		
		String giveClue13 = "He's American and he's 53 years old";
		
		QuestionObject technology13 = new MultiQuestObject("tech","Who is the current CEO of Apple?", ans13, correctAns13, fiftyFifty13, giveClue13);

		questionListTech.add(technology13);


		String [] ans14 = new String [] {"Internet Protocol", "Information page", "Information Protocol", "Individual page"};

		String correctAns14 = "Internet Protocol";
		
		String [] fiftyFifty14 = new String [] {"Information page", "Individual page"};
		
		String giveClue14 = "Every device requires this to get access to the internet";
		
		QuestionObject technology14 = new MultiQuestObject("tech", "In networks what does IP standard for?",ans14, correctAns14, fiftyFifty14, giveClue14);

		questionListTech.add(technology14);

		
		//General Questions
	

		String [] ans00 = new String [] {"River Nile", "River Temps", "Amazon River", "Congo River"};

		String correctAns00 = "River Nile";
		
		String [] fiftyFifty00 = new String [] {"Amazon River", "River Temps"};
		
		String giveClue00 = "This river is located in Africa";
		
		QuestionObject general =  new MultiQuestObject("gen", "What is the worlds longest river?", ans00, correctAns00, fiftyFifty00, giveClue00);

		questionListGen.add(general);


		String [] ans01 = new String [] {"Gary Barlow", "Robert Wadlow", "Sultan Kosen", "George Perry"};

		String correctAns01 = "Sultan Kosen";
		
		String [] fiftyFifty01 = new String [] {"Gary Barlow", "Robert Wadlow"};
		
		String giveClue01 = "He is born Mardin, Turkey";
		
		QuestionObject general1 = new MultiQuestObject("gen","Who is the tallest man in the world?", ans01, correctAns01, fiftyFifty01, giveClue01);

		questionListGen.add(general1);


		String [] ans02 = new String [] {"2013", "1981", "1994", "1980"};

		String correctAns02= "1981";
		
		String [] fiftyFifty02 = new String [] {"2013", "1994"};
		
		String giveClue02 = "The FA cup Finals for this year was Tottenham and Manchester City";
		
		QuestionObject general2 = new MultiQuestObject("gen", "When was the game Donkey Kong released?", ans02, correctAns02, fiftyFifty02, giveClue02);

		questionListGen.add(general2);

		
		String [] ans03 = new String [] {"2011", "2012", "2014", "2013"};

		String correctAns03 = "2013";
		
		String [] fiftyFifty03 = new String [] {"2014", "2011"};
		
		String giveClue03 = "Released in the same year as Hunger Games Catching Fire";
		
		QuestionObject general3 = new MultiQuestObject("gen", "When was the original Flappy birds released?", ans03, correctAns03, fiftyFifty03, giveClue03);

		questionListGen.add(general3);


		String [] ans04 = new String [] {"1.932 Billion", "2.1 Billion", "1.351 Billion", "1.568 Billion"};

		String correctAns04 = "1.351 Billion";
		
		String [] fiftyFifty04 = new String [] {"1.932 Billion", "2.1 Billion"};
		
		String giveClue04 = "There is less then 1.6 billion people in China";
		
		QuestionObject general4 = new MultiQuestObject("gen", "How many people is in China?", ans04, correctAns04, fiftyFifty04, giveClue04);

		questionListGen.add(general4);


		String [] ans05 = new String [] {"25", "24", "26", "27"};

		String correctAns05 = "26";
		
		String [] fiftyFifty05 = new String [] {"25", "27"};
		
		String giveClue05 = "Count your fingers atleast 5 times ";
		
		QuestionObject general5 =  new MultiQuestObject("gen", "How many letters is in the alphabet?", ans05, correctAns05, fiftyFifty05, giveClue05);

		questionListGen.add(general5);



		String [] ans06 = new String [] {"America", "UK", "Spain", "China"};

		String correctAns06 = "UK";
		
		String [] fiftyFifty06 = new String [] {"China", "Spain"};
		
		String giveClue06 = "It's located in the north west of 1 of the 4 possible countries";
		
		QuestionObject general6 =  new MultiQuestObject("gen", "Where is Manchester?", ans06, correctAns06, fiftyFifty06, giveClue06);

		questionListGen.add(general6);



		String [] ans07 = new String [] {"Jennifer Lawrance", "Jackie Chan", "Walt Disney", "Leonardo Dicaprio"};

		String correctAns07 = "Walt Disney";
		
		String [] fiftyFifty07 = new String [] {"Jennifer Lawrance", "Jackie Chan"};
		
		String giveClue07 = "He died at the age of 65";
		
		QuestionObject general7 = new MultiQuestObject("gen", "Who has won the most Oscar?", ans07, correctAns07, fiftyFifty07, giveClue07);

		questionListGen.add(general7);


		String [] ans08 = new String [] {"John Steinbeck", "J.k Rowling", "Roald Dahl", "David Attenborough"};

		String correctAns08 = "John Steinbeck";
		
		String [] fiftyFifty08 = new String [] {"J.K Rowling", "David Attenborough"};
		
		String giveClue08 = "His middle name is Ernst";
		
		QuestionObject general8 = new MultiQuestObject("gen", "Who wrote Of mice and men?", ans08, correctAns08, fiftyFifty08, giveClue08);

		questionListGen.add(general8);


		String [] ans09 = new String [] {"Calf", "Mini cow", "Cowy", "Cow"};

		String correctAns09 = "Calf";
		
		String [] fiftyFifty09 = new String [] {"Mini cow", "Cow"};
		
		String giveClue09 = "This name is also used for your leg muscles";
		
		QuestionObject general9 = new MultiQuestObject("gen", "What is a baby cow called?", ans09, correctAns09, fiftyFifty09, giveClue09);

		questionListGen.add(general9);


		String [] ans010 = new String [] {"Harry Main", "Mark Zuckerburg", "Patrick Steward", "Peter Jackson"};

		String correctAns010 = "Mark Zuckerburg";
		
		String [] fiftyFifty010 = new String [] {"Patrick Steward", "Peter Jackson"};
		
		String giveClue010 = "He's jewish and he once went to Harvard university";
		
		QuestionObject general10 =  new MultiQuestObject("gen","Who invented Facebook?", ans010, correctAns010, fiftyFifty010, giveClue010);

		questionListGen.add(general10);


		String [] ans011 = new String [] {"Tesco", "Walmart", "Asda", "7-11"};

		String correctAns011 = "Walmart";
		
		String [] fiftyFifty011 = new String [] {"Tesco", "Asda"};
		
		String giveClue011 = "It was found in 1962";
		
		QuestionObject general11 = new MultiQuestObject("gen", "What is the largest supermarket in the world?", ans011, correctAns011, fiftyFifty011, giveClue011);

		questionListGen.add(general11);


		String [] ans012 = new String [] {"Sweets", "Fruit", "Chocolate cake", "Rice porridge"};

		String correctAns012 = "Rice porridge";
		
		String [] fiftyFifty012 = new String [] {"Sweets", "Fruit"};
		
		String giveClue012 = "Another name for this is 'Jook' ";
		
		QuestionObject general12 =  new MultiQuestObject("gen", "What is congee?",ans012, correctAns012, fiftyFifty012, giveClue012);

		questionListGen.add(general12);



		String [] ans013 = new String [] {"2011", "2012", "2014", "2013"};

		String correctAns013 = "2013";
	
		String [] fiftyFifty013 = new String [] {"2011", "2012"};
		
		String giveClue013 = "The year after the first Hunger Game movie";
		
		QuestionObject general13 = new MultiQuestObject("gen", "When did Catching Fire come out?", ans013, correctAns013, fiftyFifty013, giveClue013);

		questionListGen.add(general13);


		String [] ans014 = new String [] {"June", "July", "September", "December"};

		String correctAns014 = "June";
		
		String [] fiftyFifty014 = new String [] {"July", "December"};
		
		String giveClue014 = "In Q2 of every year";
		
		QuestionObject general14  = new MultiQuestObject("gen", "When does Worldwide developers conference takes place?", ans014, correctAns014, fiftyFifty014, giveClue014);

		questionListGen.add(general14);


		// Game questions


		String [] ans000 = new String [] {"2002", "2013", "2014", "2012"};

		String correctAns000 = "2013";
		
		String [] fiftyFifty000 = new String [] {"2002", "2014"};
		
		String giveClue000 = "The year after the release of Call of duty Black Ops 2 ";
		
		QuestionObject game = new MultiQuestObject("gam", "Which year did Call of duty Ghosts released?", ans000, correctAns000, fiftyFifty000, giveClue000);

		questionListGame.add(game);

		

		String [] ans001 = new String [] {"Squirtle", "Lewis", "Yugi", "Shana"};

		String correctAns001 = "Squirtle";
		
		String [] fiftyFifty001 = new String [] {"Lewis", "Yugi"};
		
		String giveClue001 = "This is 1 of the 3 starting Pokemon in blue and red version";
		
		QuestionObject game1 = new MultiQuestObject("gam", "Which of the followng is a Pokemon?", ans001, correctAns001, fiftyFifty001, giveClue001);

		questionListGame.add(game1);



		String [] ans002 = new String [] {"50", "10", "100", "1000"};

		String correctAns002 = "100";
		
		String [] fiftyFifty002 = new String [] {"50", "1000"};
		
		String giveClue002 = "1+1x5x5x2";
		
		QuestionObject game2 = new MultiQuestObject("gam", "What is the max level your Pokemons get to?", ans002, correctAns002, fiftyFifty002, giveClue002);

		questionListGame.add(game2);



		String [] ans003 = new String [] {"Microsoft", "Cooperative", "Sony", "Samsung"};

		String correctAns003 = "Microsoft";
		
		String [] fiftyFifty003 = new String [] {"Sony", "Cooperative"};
		
		String giveClue003 = "The company Bill Gates had created";
		
		QuestionObject game3 = new MultiQuestObject("gam", "Which company made Xbox?", ans003, correctAns003, fiftyFifty003, giveClue003);

		questionListGame.add(game3);

		

		String [] ans004 = new String [] {"Microsoft", "Cooperative", "Sony", "Samsung"};

		String correctAns004 = "Sony";
		
		String [] fiftyFifty004 = new String [] {"Samsung", "Microsoft"};
		
		String giveClue004 = "This company is one of Apple's main rivals";
		
		QuestionObject game4 = new MultiQuestObject("gam", "Which company made Playstation?", ans004, correctAns004, fiftyFifty004, giveClue004);

		questionListGame.add(game4);

		

		String [] ans005 = new String [] {"Wii U", "Xbox", "GBA SP", "Playstation"};

		String correctAns005 = "Xbox";
		
		String [] fiftyFifty005 = new String [] {"Wii U", "Playstation"};
		
		String giveClue005 = "This platform was created by Microsoft";
		
		QuestionObject game5 = new MultiQuestObject("gam", "Gears of War is only avaliable for which platform?", ans005, correctAns005, fiftyFifty005, giveClue005);

		questionListGame.add(game5);



		String [] ans006 = new String [] {"League", "Legends", "LOL", "Leagy"};

		String correctAns006 = "LOL";
		
		String [] fiftyFifty006 = new String [] {"League", "Legends"};
		
		String giveClue006 = "This is an ABBRIVATED word";
		
		QuestionObject game6 = new MultiQuestObject("gam","What is league of legends abbrivated word?", ans006, correctAns006, fiftyFifty006, giveClue006);

		questionListGame.add(game6);



		String [] ans007 = new String [] {"Fifa 12", "Fifa 13", "Fifa 14", "Fifa 15"};

		String correctAns007 = "Fifa 14";
		
		String [] fiftyFifty007 = new String [] {"Fifa 12", "Fifa 15"};
		
		String giveClue007 = "Think of the current year";
		
		QuestionObject game7 = new MultiQuestObject("gam", "Whats the latest fifa Game called?", ans007, correctAns007, fiftyFifty007, giveClue007);

		questionListGame.add(game7);



		String [] ans008 = new String [] {"Pokemon", "Super Mario", "Spyro", "Fifa"};

		String correctAns008 = "Super Mario";
		
		String [] fiftyFifty008 = new String [] {"Pokemon", "Spyro"};
		
		String giveClue008 = "The developer of this game is Nintendo";
		
		QuestionObject game8 = new MultiQuestObject("gam", "Which game is Toad from?",ans008, correctAns008, fiftyFifty008, giveClue008);

		questionListGame.add(game8);



		String [] ans009 = new String [] {"50", "128", "18", "100"};

		String correctAns009 = "128";
		
		String [] fiftyFifty009 = new String [] {"18", "100"};
		
		String giveClue009 = "This is more 60 players allowed in 1 game";
		
		QuestionObject game9 = new MultiQuestObject("gam","In MAG, what is the maximum players in an online game?", ans009, correctAns009, fiftyFifty009, giveClue009);

		questionListGame.add(game9);



		String [] ans0010 = new String [] {"Dragon Hunter", "Monster Hunter", "Tetris", "Metal Slug"};

		String correctAns0010 = "Monster Hunter";
		
		String [] fiftyFifty0010 = new String [] {"Dragon Hunter", "Tetris"};
		
		String giveClue0010 = "A tigerex is a dragon but it's also a monster";
		
		QuestionObject game10 =  new MultiQuestObject("gam", "In which game you can find Tigerex?", ans0010, correctAns0010, fiftyFifty0010, giveClue0010);

		questionListGame.add(game10);



		String [] ans0011 = new String [] {"Android", "Blackberry", "iOS", "Windows"};

		String correctAns0011 = "iOS";
		
		String [] fiftyFifty0011 = new String [] {"Windows", "Android"};
		
		String giveClue0011 = "This OS is the worlds most advanced mobile OS yet";
		
		QuestionObject game11 =  new MultiQuestObject("gam", "Which Phone OS brought out Game Centre?", ans0011, correctAns0011, fiftyFifty0011, giveClue0011);

		questionListGame.add(game11);



		String [] ans0012 = new String [] {"1994", "2014", "1904", "1985"};

		String correctAns0012 = "1985";
		
		String [] fiftyFifty0012 = new String [] {"2014", "1904"};
		
		String giveClue0012 = "Tetris was developed before the 1990's";
		
		QuestionObject game12 = new MultiQuestObject("gam", "When was the first version of Tetris invented?", ans0012, correctAns0012, fiftyFifty0012, giveClue0012);

		questionListGame.add(game12);



		String [] ans0013 = new String [] {"1", "2", "3", "4"};

		String correctAns0013 = "4";
		
		String [] fiftyFifty0013 = new String [] {"3", "1"};
		
		String giveClue0013 = "How many members is in the band Lawson";
		
		QuestionObject game13 = new MultiQuestObject("gam", "How many color characters in Pac-Man?", ans0013, correctAns0013, fiftyFifty0013, giveClue0013);

		questionListGame.add(game13);



		String [] ans0014 = new String [] {"2005", "2006", "2007", "2013"};

		String correctAns0014 = "2005";
		
		String [] fiftyFifty0014 = new String [] {"2007", "2013"};
		
		String giveClue0014 = "It was released the same year as Harry Potter 4";
		
		QuestionObject game14 = new MultiQuestObject("gam", "Which year did the first World of WarCraft come out?", ans0014, correctAns0014, fiftyFifty0014, giveClue0014);

		questionListGame.add(game14);

		}


    private void addQuestion(QuestionObject question) 
    {
    	questionListTech.add(question);
    	questionListGen.add(question);
    	questionListGame.add(question);
    }
    
    public ArrayList<QuestionObject> getTechArray() 
    {
    	 return questionListTech;
    }
    
    public String getQuestionObject()
    {
    	return questionListTech.get(questionNumber).getQuestions();
    }
    
    public ArrayList<QuestionObject> getGenArray() 
    {
    	 return questionListGen;
    }
    
    public String getQuestionObject1()
    {
    	return questionListGen.get(questionNumber).getQuestions();
    }

    public ArrayList<QuestionObject> getGameArray() 
    {
    	 return questionListGame;
    }
    
    public String getQuestionObject2()
    {
    	return questionListGame.get(questionNumber ).getQuestions();
    }
    
    
}

    




