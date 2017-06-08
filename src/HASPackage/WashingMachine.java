package HASPackage;

public class WashingMachine implements HAS{
	public int buttons(int flag)
	{
		System.out.println("WASHING MACHINE");
		
		if(flag==0)
		{
			System.out.println("WASHING MACHINE ON!!");
			flag = 1;
		}
		else
		{
			System.out.println("WASHING MACHINE OFF!!");
			flag = 0;
		}
		
		return flag;
	}

}
