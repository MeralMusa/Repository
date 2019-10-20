package replIt;

import java.util.*;;

public class price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

       	int	expe=0;
        int age=0;
	     int zip=0;
	  double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String licence="";
		String accdient="";
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		System.out.println("What is the highest level of education you have completed?\n");

          education=scan.nextLine();
          
          String dum="";
          
          dum=education.replace(" ","");
System.out.println(dum);
          
          if (education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")) {
         	 
             	premium=premium-premium*0.05;

         	 
          } else if (education.equalsIgnoreCase("Doctors")) {
         	 
          	premium=premium-premium*0.1;

      	 
       }else if (education.equalsIgnoreCase("Lessthanhighschool")){
      	 
       	premium=premium+premium*0.05;

		   System.out.println(premium);

    }
          
          
          System.out.println(name+", here's your quote!");
          System.out.println("Start Your Policy Today For: $"+premium);
			
          education=education.replace(" ", "");
          referenceNumber = name.substring(0, 2)+age+name.substring(name.length()-2)+zip;
          referenceNumber=referenceNumber+education;
          referenceNumber=referenceNumber.toUpperCase();
          System.out.println("Reference number: "+referenceNumber);

	}
	

	
}
	
			
		
		
		
	


