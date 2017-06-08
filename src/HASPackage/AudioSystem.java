package HASPackage;

public class AudioSystem implements HAS{
	public int buttons(int flag)
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
		
		return flag;
	}
	
	public int volumeup( int vol)
	{
		vol = vol + 1;
		System.out.println("VOLUME UP :" +vol);
		return vol;
	}
	
	public int volumedown( int vol)
	{
		vol = vol - 1;
		System.out.println("VOLUME DOWN :" +vol);
		return vol;
	}
}
