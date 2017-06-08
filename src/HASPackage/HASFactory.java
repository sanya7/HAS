package HASPackage;

public class HASFactory {
	public HAS getAppliances(String applianceType){
	      if(applianceType == null)
	      {
	         return null;
	      }		
	      if(applianceType.equalsIgnoreCase("HOME LIGHTS"))
	      {
	         return new HomeLights();
	         
	      } 
	      else if(applianceType.equalsIgnoreCase("AIR CONDITIONER"))
	      {
	         return new AirConditioner();
	         
	      } 
	      else if(applianceType.equalsIgnoreCase("WASHING MACHINE"))
	      {
	         return new WashingMachine();
	      }
	      else if(applianceType.equalsIgnoreCase("TV"))
	      {
	         return new TV();
	         
	      } 
	      else if(applianceType.equalsIgnoreCase("AUDIO SYSTEM"))
	      {
	         return new AudioSystem();
	      }
	      
	      return null;
	   }

}
