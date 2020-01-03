package replIt;

public class MethodOverloading1FindMax {

	public   int findMax(int[] max){
		  int dum = Integer.MIN_VALUE;
int res=0;


 
for(int each: max) {

	if(each > dum) {

		
	res = each;
	dum=each;

	}}


	return res;

		  
		  
		  
		}

		public   double findMax(double[] max){
		 double dum = Integer.MIN_VALUE;
		 double res=0;

		 for(double each: max) {

				if(each > dum) {

					
				res = each;
				dum=each;
		 }}
			

				return res;

		}
		public   void main(String [] args) {
			
			int [] max= {12,13,69,188,2,3,};
			double [] dmax= {12,13,69,2,5,3};
			
			
			System.out.println(	findMax(max));
			System.out.println(	findMax(dmax));
		}
		
}
