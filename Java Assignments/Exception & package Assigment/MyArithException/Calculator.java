package Exception;

public class Calculator 
{
	public int CalResult(int no) throws MyArithException
	{
		if(no == 0)
		{
			throw new MyArithException("Zero Is Not Allowed");
		}
		else
		{
			if(no < 0)
			{
				throw new MyArithException("Negative Is Not Allowed");
			}
			else
			{
				return 2*no;
			}
		}
	}
}
