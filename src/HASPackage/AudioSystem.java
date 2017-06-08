package HASPackage;

public class AudioSystem implements HAS{
	public void buttons(int flag)
	{
		System.out.println("AUDIO SYSTEM");
		
		if(flag==0)
		{
			System.out.println("AUDIO SYSTEM ON!!");
			flag = 1;
		}
		else
		{
			System.out.println("AUDIO SYSTEM OFF!!");
			flag = 0;
		}
	}
	
	public void volumeup( int vol)
	{
		vol = vol + 1;
		System.out.println("VOLUME UP :" +vol);
	}
	
	public void volumedown( int vol)
	{
		vol = vol - 1;
		System.out.println("VOLUME DOWN :" +vol);
	}
}
