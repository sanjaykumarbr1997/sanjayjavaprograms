package polymorphism.compiletime;

public class CompileTimePolymorphism {
public static void main(String[] args) {
	
	Akshata akshata = new Akshata();
	akshata.speak(new Friend());
	
	
	
	//akshata.speak(new Stranger());  -- if u want to execute stranger methd
}

}
//in overriding u cant over load anything like void  except parameter and parameter type ,[void speak(Stranger s)[
//can you override main method
//can you override written method
//sonar lint and integrate with eclipse 