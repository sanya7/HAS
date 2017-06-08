package HASPackage;

public class TV implements HAS{
	public void buttons(int flag)
	{
		System.out.println("TV");
		
		if(flag==0)
		{
			System.out.println("TV ON!!");
			flag = 1;
		}
		else
		{
			System.out.println("TV OFF!!");
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
	
	public void channelup( int channel)
	{
		channel = channel + 1;
		System.out.println("CHANNEL UP :" +channel);
	}
	
	public void channeldown( int channel)
	{
		channel = channel - 1;
		System.out.println("CHANNEL DOWN :" +channel);
	}
}
