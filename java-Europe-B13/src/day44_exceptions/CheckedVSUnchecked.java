package day44_exceptions;

public class CheckedVSUnchecked {

	public static void main(String[] args) {
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}