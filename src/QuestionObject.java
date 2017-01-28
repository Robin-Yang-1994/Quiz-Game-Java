
public abstract class QuestionObject {
	
	String question;
	String correctAns;
	String category;
	String [] fiftyFifty;
	String giveClue;
	

	    public QuestionObject(String category,String question, String[] ans, String correctAns, String [] fiftyFifty, String giveClue) 
	    {
	
		this.question = question;
		this.correctAns = correctAns;
		this.category = category;
		this.fiftyFifty = fiftyFifty;
		this.giveClue = giveClue;
		}
	
	    public String getQuestions()
	    {
	        return question;
	    }
	    
	    public String getCorrectAns()
	    {
	        return correctAns;
	    }
	    
	    public String getPossibleAns1()
	    {
	    	String ans = "";
	        return ans;
	    }
	    
	    public String getPossibleAns2()
	    {
	    	String ans = "";
	        return ans;
	    }
	    
	    public String getPossibleAns3()
	    {
	    	String ans = "";
	        return ans;
	    }
	    
	    public String getPossibleAns4()
	    {
	    	String ans = "";
	        return ans;
	    }

		public String getCategory()
		{
			return question;
		}
		
		
		


}
