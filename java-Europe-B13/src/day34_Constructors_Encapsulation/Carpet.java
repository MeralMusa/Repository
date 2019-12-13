package day34_Constructors_Encapsulation;

public class Carpet {

		// TODO Auto-generated method stub
	double cost;
	public Carpet(double cost) {
			
			
			if (cost<0) {
				this.cost=0;
			} else {
				this.cost = cost;
			}
		}
		
		public double getCost() {
			
			return cost;
		}
	}