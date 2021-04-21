package objectclass.clone;

public class MobileCloneDemo {

	public static void main(String[] args) {
		
		Simcard simcard = new Simcard();
		Mobile mob1 = new Mobile("Lenovo","Red",simcard);
		Mobile mob2 = new Mobile("Apple","Black",simcard);
		Mobile mob3 = null;
		
		System.out.println(mob2);

		
		//mob3 = mob1;
		try {
			mob3= (Mobile) mob2.clone();
			mob3.simcard.type="CDMA";
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(mob3);
		System.out.println(mob2);

		

	}

}
