package openclosed;

public class OpenClosed {

	public OpenClosed() {
		doIncorrectImplementation();
		doCorrectImplementation();
	}
	
	public void doIncorrectImplementation() {
		openclosed.incorrect.Rectangle rectangle = new openclosed.incorrect.Rectangle(4,3);
		openclosed.incorrect.Circle circle = new openclosed.incorrect.Circle(5);
	
		openclosed.incorrect.GeometryOperation op = new openclosed.incorrect.GeometryOperation();
		//System.out.println("Area do retangulo -> " + op.getArea(rectangle));
		//System.out.println("Area do circulo -> " + op.getArea(circle));		
	}
	
	public void doCorrectImplementation() {
		openclosed.correct.Rectangle rectangle2 = new openclosed.correct.Rectangle(4,3);
		openclosed.correct.Circle circle2 = new openclosed.correct.Circle(5);
		
		System.out.println("Area do retangulo -> " + rectangle2.getArea(rectangle2));
		System.out.println("Area do circulo -> " + circle2.getArea(circle2));		
	}
	
	public static void main(String[] args) {
		OpenClosed opClo = new OpenClosed();

	}

}
