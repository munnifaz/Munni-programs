package week4.day1;

public class Smartphone extends Androidphone{
	
		public void connectWhatsapp(){
			
			System.out.println("Connecting to whatsapp");}
		
		public void takeVedio() {
			System.out.println("Taking a vedio in smart phone");}
		

        public static void main(String[] args) {
	
        	Smartphone s=new Smartphone();
        	s.connectWhatsapp();
        	s.saveContact();
        	s.makeCall();
        	s.sendMsg();
        	s.takeVedio();

}}


