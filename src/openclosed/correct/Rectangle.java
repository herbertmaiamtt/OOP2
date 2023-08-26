package openclosed.correct;

public class Rectangle extends openclosed.correct.GeometryOperation{
    
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

	@Override
	public int getArea(Object object) {
		if(object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            return rectangle.getHeight() * rectangle.getWidth();
        } else return 0;
	}

}