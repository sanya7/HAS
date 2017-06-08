package HASPackage;

public class AirConditioner implements HAS{

	public int buttons(int flag)
	{
		System.out.println("AIR CONDITIONER");
		
		if(flag==0)
		{
			System.out.println("AIR CONDITIONER ON!!");
			flag = 1;
		}
		else
		{
			System.out.println("AIR CONDITIONER OFF!!");
			flag = 0;
		}
		
		return flag;
	}
}
