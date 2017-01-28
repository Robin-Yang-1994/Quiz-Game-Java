
public class MultiQuestObject extends QuestionObject // Extending the question object class to inherit it's fields
{
	String [] ans;
	
	public MultiQuestObject(String category,String question, String[] ans, String correctAns, String [] fiftyFifty, String giveClue)
	{ // Constructor
		super(category, question, ans, correctAns, fiftyFifty, giveClue); // Super run the constructor from another class
		this.ans = ans; // ans is equal to ans
	}
	
    public String getPossibleAns1()
    {
        return ans[0]; // Wrong answer 1 is equal to 0
    }
    
    public String getPossibleAns2()
    {
        return ans[1]; // Wrong answer 2 is equal to 0
    }
    
    public String getPossibleAns3()
    {
        return ans[2]; // Wrong answer 3 is equal to 0
    }
    
    public String getPossibleAns4()
    {
        return ans[3]; // Wrong answer 3 is equal to 0
    }
}
