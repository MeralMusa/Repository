package replIt;

public class MethodsWithString10amedb {

	
		// TODO Auto-generated method stub

	public static	 String lameDb(String db, String op,String id,String data)
		  {
        String dum="";
		switch(id) {
		
         case "4":{
			
        	 if (op=="add") {
        		 dum=db+"#"+id+data;
        		 
        	 }else if (op=="edit") {
 				
 				String[]arr=db.split("#");
 				
 				for(int i=0;i<arr.length;i++) {
 				
 					if(arr[3]==arr[3]) {
 						arr[3]=id+data;

 					}
 					dum+="#"+arr[i];
 				
 				}
 				
 				dum=dum.substring(1);
 			}else if(op=="delete") {
				
				
                String[]arr=db.split("#");
                for(int i=0;i<arr.length;i++) {
 				if(i!=3) {
                	dum+=arr[i]+"#";
 				}
                }
                dum=dum.substring(0, dum.length()-1);
 			}else {
 				dum=db;
 			}
        	 
			break;
			
		}case "2":{
			if (op=="edit") {
				
				String[]arr=db.split("#");
				
				for(int i=0;i<arr.length;i++) {
				
					if(arr[1]==arr[1]) {
						arr[1]=id+data;

					}
					dum+="#"+arr[i];
				}
				
				dum=dum.substring(1);
			}else if (op=="add") {
       		 dum=db+"#"+id+data;
    		 
       	 }else if(op=="delete") {
				
				
             String[]arr=db.split("#");
				
				dum="#"+arr[1]+"#"+arr[2];
				
			}else {
				dum=db;
			}
			
			
			break;
		}case "1":{
			
			if(op=="delete") {
				
				
               String[]arr=db.split("#");
               for(int i=1;i<arr.length;i++) {
				dum+=arr[i]+"#";
				
               }
               dum=dum.substring(0, dum.length()-1);
			}else if (op=="edit") {
				
				String[]arr=db.split("#");
				
				for(int i=0;i<arr.length;i++) {
				
					if(arr[0]==arr[0]) {
						arr[0]=id+data;

					}
					dum+="#"+arr[i];
			
				}
				
				dum=dum.substring(1);
			}else if (op=="add") {
       		 dum=db+"#"+id+data;
    		 
       	 }
		
			else {
				dum=db;
			}
			
			
			break;
		}}
		    
		    
		return dum;

		    
		    
		    
		  }//end lameDb3
		  
		  
		   public static void main(String[] args) 
		   {
		    
		     
		     System.out.print(
		       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
		       );
		       
		        System.out.print(
		       lameDb("1tst#2bla#3foo","none","1","")+"\n"
		       );
		     
		   }
		  
		
	}


