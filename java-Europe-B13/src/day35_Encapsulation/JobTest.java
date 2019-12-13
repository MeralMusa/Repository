package day35_Encapsulation;

import java.util.ArrayList;


public class JobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Job job1=new Job ();
		Job job2=new Job ("Java Developer");
		Job job3=new Job ("TaxiDriver", "Taxitogo", 130000);
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		
		
		ArrayList<Job> jobList= new ArrayList<>();
		
		
		jobList.add(job3);
		jobList.add(new Job("SM","ABC",90000));
		jobList.add(new Job("BA","KKK",90000));
		jobList.add(new Job("FT","XXX",100000));
		
		
		System.out.println(jobList.toString());
		
		double maxSalary=0;
		int heighestIndex=0;
		for (int i=0;i<jobList.size();i++) {
			
			if (jobList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobList.get(i).getAnnualSalary();
				heighestIndex=i;
				
			}
			
		}
	
		System.out.println(jobList.get(heighestIndex).getAnnualSalary());
		
		
		
	}

}
