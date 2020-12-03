package week4.day2;

public class Desktop implements Hardware,Software {

	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.softwareResources();
		
	}

	@Override
	public void softwareResources() {
		System.out.println("software resources");
		
	}

	
		
	}


