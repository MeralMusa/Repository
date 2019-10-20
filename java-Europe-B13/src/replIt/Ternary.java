package replIt;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		
		
		
		
	    double price = 0;
			String storageType, screenType, cpu,screenRes;
			int ram = 0 ;
			int memory=0;
			Scanner sc = new Scanner(System.in);
			
			
    		System.out.println("Select screen size:");

    		screenType=sc.next();
    		
    		System.out.println("Select CPU type");

    		cpu=sc.next();
    		System.out.println("Select RAM size:");
    		ram=sc.nextInt();
    		System.out.println("Select storage type:");
    		storageType=sc.next();
    		System.out.println("Enter memory size:");
    		memory=sc.nextInt();

    		System.out.println("Enter screen resolution:");
    		screenRes=sc.next();


         if (screenType.equalsIgnoreCase("13.3")) {
        	 
        	           price=price+200;
 
        	               if (cpu.equalsIgnoreCase("i3")) {
        		 
            	                  price=price+150;

            	                          if (ram<=4) {
                                             price=price+50;

                                             }else {
            	
                	                        price=price+50;

            	                             for(int i=1;i<ram;i++) {
            	
           			                                   if(i%4==0) {
            	                                         price=price+50;

            	                     }
                               }
                                           }

             if(storageType.equalsIgnoreCase("hdd")) {

            	             if (memory<=500) {
                                  price=price+50;

                                  }else {
      	
          	                              price=price+50;

      	                                          for(int i=1;i<memory;i++) {
      	
     			                                    if(i%500==0) {
      	                                                 price=price+50;

      	                     }
                         }
                   }
            	 
             }else if(storageType.equalsIgnoreCase("ssd")) {

                               	 if (memory<=500) {
                                      price=price+100;

                                 }else {
      	
          	                      price=price+100;
     		
      	                                         for(int i=1;i<memory;i++) {
      	 
     			                                              if(i%500==0) {
      	                                                       price=price+100;

      	                     }
                         }
                   }
             }
            
             if(screenRes.equalsIgnoreCase("FULLHD")) {
            	 
        	       price=price+100;

            	 
             }else if(screenRes.equalsIgnoreCase("4K")) {
            	 
      	       price=price+200;

             }
             
        	 }else if(cpu.equalsIgnoreCase("i5")) {
        		 
            	 price=price+250;
            	 if (ram<=4) {
                     price=price+50;
                    }else {
                	price=price+50;
               		for(int i=1;i<ram;i++) {
                	if(i%4==0) {
                	price=price+50;
                }}}
            	 if(storageType.equalsIgnoreCase("hdd")) {

                	 if (memory<=500) {
                         price=price+50;
            
                    }else {
          	
              	       price=price+50;
         		
          	           for(int i=1;i<memory;i++) {
          	
         			                     if(i%500==0) {
          	                     price=price+50;
          	
          	                     }
                             }
                       }
                	 
                 }else if(storageType.equalsIgnoreCase("ssd")) {

                	 if (memory<=500) {
                         price=price+100;
            
                    }else {
          	
              	       price=price+100;
         		
          	           for(int i=1;i<memory;i++) {
          	
         			                     if(i%500==0) {
          	                     price=price+100;
          	
          	                     }
                             }
                       }
               
                 
                 }
            	 
            	 
            	 if(screenRes.equalsIgnoreCase("FULLHD")) {
                	 
          	       price=price+100;

              	 
               }else if(screenRes.equalsIgnoreCase("4K")) {
              	 
        	       price=price+200;

               }
        	 }else if(cpu.equalsIgnoreCase("i7")) {
        		 
            	 price=price+350;
            	 if (ram<=4) {
                     price=price+50;
                    }else {
                	price=price+50;
               		for(int i=1;i<ram;i++) {
                	if(i%4==0) {
                	price=price+50;
                }}
        	  }
        	 
        	       
                    
                   
     if(storageType.equalsIgnoreCase("hdd")) {

            	 if (memory<=500) {
                     price=price+50;
        
                }else {
      	
          	       price=price+50;
     		
      	           for(int i=1;i<memory;i++) {
      	
     			                     if(i%500==0) {
      	                     price=price+50;
      	
      	                     }
                         }
                 }
            	 
        	 }
        	 
        	        else if(storageType.equalsIgnoreCase("ssd")) {

            	 if (memory<=500) {
                     price=price+100;
        
                }else {
      	
          	       price=price+100;
     		
      	           for(int i=1;i<memory;i++) {
      	
     			                     if(i%500==0) {
      	                     price=price+100;
      	
      	                     }
                         }
                   }
             }       		
        	 
        	 
        	 if(screenRes.equalsIgnoreCase("FULLHD")) {
            	 
      	       price=price+100;

          	 
           }else if(screenRes.equalsIgnoreCase("4K")) {
          	 
    	       price=price+200;

           }
         }
        	               
        	               
        	               
                 	
   
         
	               
           
        	

         }          else if(screenType.equalsIgnoreCase("15.0")) {
        	 
	           price=price+300;

	               if (cpu.equalsIgnoreCase("i3")) {
		 
  	                  price=price+150;

  	                          if (ram<=4) {
                                   price=price+50;

                                   }else {
  	
      	                        price=price+50;

  	                             for(int i=1;i<ram;i++) {
  	
 			                                   if(i%4==0) {
  	                                         price=price+50;

  	                     }
                     }
                                 }

   if(storageType.equalsIgnoreCase("hdd")) {

  	             if (memory<=500) {
                        price=price+50;

                        }else {

	                              price=price+50;

                                          for(int i=1;i<memory;i++) {

		                                    if(i%500==0) {
                                                 price=price+50;

                     }
               }
         }
  	 
   }else if(storageType.equalsIgnoreCase("ssd")) {

                     	 if (memory<=500) {
                            price=price+100;

                       }else {

	                      price=price+100;
	
                                         for(int i=1;i<memory;i++) {
 
		                                              if(i%500==0) {
                                                       price=price+100;

                     }
               }
         }
   }
  
   if(screenRes.equalsIgnoreCase("FULLHD")) {
  	 
	       price=price+100;

  	 
   }else if(screenRes.equalsIgnoreCase("4K")) {
  	 
       price=price+200;

   }
   
	 }else if(cpu.equalsIgnoreCase("i5")) {
		 
  	 price=price+250;
  	 if (ram<=4) {
           price=price+50;
          }else {
      	price=price+50;
     		for(int i=1;i<ram;i++) {
      	if(i%4==0) {
      	price=price+50;
      }}}
  	 if(storageType.equalsIgnoreCase("hdd")) {

      	 if (memory<=500) {
               price=price+50;
  
          }else {
	
    	       price=price+50;
		
	           for(int i=1;i<memory;i++) {
	
			                     if(i%500==0) {
	                     price=price+50;
	
	                     }
                   }
             }
      	 
       }else if(storageType.equalsIgnoreCase("ssd")) {

      	 if (memory<=500) {
               price=price+100;
  
          }else {
	
    	       price=price+100;
		
	           for(int i=1;i<memory;i++) {
	
			                     if(i%500==0) {
	                     price=price+100;
	
	                     }
                   }
             }
     
       
       }
  	 
  	 
  	 if(screenRes.equalsIgnoreCase("FULLHD")) {
      	 
	       price=price+100;

    	 
     }else if(screenRes.equalsIgnoreCase("4K")) {
    	 
	       price=price+200;

     }
	 }else if(cpu.equalsIgnoreCase("i7")) {
		 
  	 price=price+350;
  	 if (ram<=4) {
           price=price+50;
          }else {
      	price=price+50;
     		for(int i=1;i<ram;i++) {
      	if(i%4==0) {
      	price=price+50;
      }}
	  }
	 
	       
          
         
if(storageType.equalsIgnoreCase("hdd")) {

  	 if (memory<=500) {
           price=price+50;

      }else {

	       price=price+50;
	
           for(int i=1;i<memory;i++) {

		                     if(i%500==0) {
                     price=price+50;

                     }
               }
       }
  	 
	 }
	 
	        else if(storageType.equalsIgnoreCase("ssd")) {

  	 if (memory<=500) {
           price=price+100;

      }else {

	       price=price+100;
	
           for(int i=1;i<memory;i++) {

		                     if(i%500==0) {
                     price=price+100;

                     }
               }
         }
   }       		
	 
	 
	 if(screenRes.equalsIgnoreCase("FULLHD")) {
  	 
       price=price+100;

	 
 }else if(screenRes.equalsIgnoreCase("4K")) {
	 
     price=price+200;

 }
}
	               
	               
	               
       	


         
 
	

}         else if (screenType.equalsIgnoreCase("17.3")) {
	 
    price=price+400;

        if (cpu.equalsIgnoreCase("i3")) {

               price=price+150;

                       if (ram<=4) {
                          price=price+50;

                          }else {

	                        price=price+50;

                          for(int i=1;i<ram;i++) {

	                                   if(i%4==0) {
                                      price=price+50;

                  }
            }
                        }

if(storageType.equalsIgnoreCase("hdd")) {

          if (memory<=500) {
               price=price+50;

               }else {

                         price=price+50;

                                 for(int i=1;i<memory;i++) {

                                  if(i%500==0) {
                                        price=price+50;

            }
      }
}

}else if(storageType.equalsIgnoreCase("ssd")) {

            	 if (memory<=500) {
                   price=price+100;

              }else {

                 price=price+100;

                                for(int i=1;i<memory;i++) {

                                            if(i%500==0) {
                                              price=price+100;

            }
      }
}
}

if(screenRes.equalsIgnoreCase("FULLHD")) {

price=price+100;


}else if(screenRes.equalsIgnoreCase("4K")) {

price=price+200;

}

}else if(cpu.equalsIgnoreCase("i5")) {

price=price+250;
if (ram<=4) {
  price=price+50;
 }else {
	price=price+50;
	for(int i=1;i<ram;i++) {
	if(i%4==0) {
	price=price+50;
}}}
if(storageType.equalsIgnoreCase("hdd")) {

	 if (memory<=500) {
      price=price+50;

 }else {

      price=price+50;

      for(int i=1;i<memory;i++) {

	                     if(i%500==0) {
                price=price+50;

                }
          }
    }
	 
}else if(storageType.equalsIgnoreCase("ssd")) {

	 if (memory<=500) {
      price=price+100;

 }else {

      price=price+100;

      for(int i=1;i<memory;i++) {

	                     if(i%500==0) {
                price=price+100;

                }
          }
    }


}


if(screenRes.equalsIgnoreCase("FULLHD")) {
	 
  price=price+100;


}else if(screenRes.equalsIgnoreCase("4K")) {

price=price+200;

}
}else if(cpu.equalsIgnoreCase("i7")) {

price=price+350;
if (ram<=4) {
  price=price+50;
 }else {
	price=price+50;
	for(int i=1;i<ram;i++) {
	if(i%4==0) {
	price=price+50;
}}
}


 

if(storageType.equalsIgnoreCase("hdd")) {

if (memory<=500) {
  price=price+50;

}else {

  price=price+50;

  for(int i=1;i<memory;i++) {

                   if(i%500==0) {
            price=price+50;

            }
      }
}

}

 else if(storageType.equalsIgnoreCase("ssd")) {

if (memory<=500) {
  price=price+100;

}else {

  price=price+100;

  for(int i=1;i<memory;i++) {

                   if(i%500==0) {
            price=price+100;

            }
      }
}
}       		


if(screenRes.equalsIgnoreCase("FULLHD")) {

price=price+100;


}else if(screenRes.equalsIgnoreCase("4K")) {

price=price+200;

}
}
        
        
        
	






}
         
         
         
         
           System.out.println("Laptop price is: $"+price);

	}
	
}

	
         
	
         
                

         



		    
