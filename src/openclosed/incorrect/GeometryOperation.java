package openclosed.incorrect;

public class GeometryOperation {
    
    public int getArea(Object object) {
        if(object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            return rectangle.getHeight() * rectangle.getWidth();
        } else {
            Circle circle = (Circle) object;
            return (int) (Math.PI * circle.getRadius() * circle.getRadius());
        }
    }
    
}