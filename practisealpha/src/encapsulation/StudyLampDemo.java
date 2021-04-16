package encapsulation;

public class StudyLampDemo {

	public static void main(String[] args) {
		
		StudyLamp sl = new StudyLamp();
		sl.setBrand("Philips");
		sl.setColor("black");
		sl.setStandbyhours(15);
		
		sl.getBrand();
		sl.getColor();
		sl.getStandbyhours();
		System.out.println(sl.getStandbyhours());
		System.out.println(sl.getBrand());
		System.out.println(sl.getColor());

	}

}
