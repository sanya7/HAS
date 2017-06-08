package HASPackage;

public class HASMain {

	public static void main(String[] args) {
		  
		  int flagon = 0;
		  int flagoff = 1;
		  
		  HASFactory hasfactory = new HASFactory();

	      
	      HAS app1 = hasfactory.getAppliances("HOME LIGHTS");
	      app1.buttons(flagoff);

	      
	      HAS app2 = hasfactory.getAppliances("AIR CONDITIONER"); 
	      app2.buttons(flagon);

	     
	      HAS app3 = hasfactory.getAppliances("WASHING MACHINE");
	      app3.buttons(flagoff);
	      
	      
	      HAS app4 = hasfactory.getAppliances("TV");
	      app4.buttons(flagon);
	      
	      TV a4 = new TV();
	      
	      a4.volumeup(10);
	      a4.volumedown(10);
	      a4.channelup(5);
	      a4.channeldown(5);
	      
	      HAS app5 = hasfactory.getAppliances("AUDIO SYSTEM");
	      app5.buttons(flagon);
	      
	      AudioSystem a5 = new AudioSystem();
	      a5.volumeup(20);
	      a5.volumedown(20);
	}

}
