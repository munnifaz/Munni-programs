package week4.day2;

public class College extends University {

	public static void main(String[] args) {

      College c=new College();
      c.ug();
      c.pg();

	}

	@Override
	public void ug() {
		System.out.println("this UG override method from university");
		
	}

}
