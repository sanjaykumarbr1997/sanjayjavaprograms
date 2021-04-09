package instanceoperator;

public class InstantOp {

	public static void main(String[] args) {
		
		Abhi abhi = new Abhi();
		Chocoalate choco = new Chocoalate();
		Cake cake = new Cake();
		
		abhi.mouth(cake);
		abhi.mouth(choco);
		
		abhi.mouth(new Cake());

	}

}
