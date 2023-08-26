package openclosed.correct;

public class Circle extends openclosed.correct.GeometryOperation{
    
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

	@Override
	public int getArea(Object object) {
		if(object instanceof Circle) {
			Circle circle = (Circle) object;
            return (int) (Math.PI * circle.getRadius() * circle.getRadius());
		} else return 0;
	}
    
}