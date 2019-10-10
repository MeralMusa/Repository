package day12_controlFlowStatements_Part6;

public class assessment3 {

	public static void main(String[] args) {
		
		
		int counter=4;
		outer:
			for(int i=0;i<4;i++) {
				middle:
					for(int j=0;j<4;j++) {
						innner:
							for(int k=0;k<4;k++) {
								if(k-j>0) {
									break middle;
								}
								counter++;
							}
					}
			
			}
		System.out.println(counter);
	


	}

}
