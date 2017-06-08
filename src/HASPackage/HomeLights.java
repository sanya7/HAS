package HASPackage;

public class HomeLights implements HAS{
	public void buttons(int flag)
	{
		System.out.println("HOME LIGHTS");
		
		if(flag==0)
		{
			System.out.println("LIGHTS ON!!");
			flag = 1;
		}
		else
		{
			System.out.println("LIGHTS OFF!!");
			flag = 0;
		}
	}

}
