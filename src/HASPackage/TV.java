package HASPackage;

public class TV implements HAS{
	public int buttons(int flag)
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
	
	public int channelup( int channel)
	{
		channel = channel + 1;
		System.out.println("CHANNEL UP :" +channel);
		return channel;
	}
	
	public int channeldown( int channel)
	{
		channel = channel - 1;
		System.out.println("CHANNEL DOWN :" +channel);
		return channel;
	}
}
