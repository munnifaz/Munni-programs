package week4assignment.org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("desktop size is 30cm");
	}

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
		
	}

}
