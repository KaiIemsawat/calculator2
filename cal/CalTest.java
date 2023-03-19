package cal;

public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.performOperation(10.5);
		cal.performOperation("+");
		cal.performOperation(50.0);
		cal.performOperation("/");
		cal.performOperation(10);
		cal.performOperation("=");
		System.out.println(cal.getResult());
	}
}
