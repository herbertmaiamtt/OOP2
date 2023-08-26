package interfacesegregation.incorrect;

public class Penguin implements Bird{

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {
        
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Nao suportado"); 
    }

    
}