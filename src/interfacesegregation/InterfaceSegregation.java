package interfacesegregation;

public class InterfaceSegregation {
    
    public InterfaceSegregation() {
        doIncorrectImplementation();
        doCorrectImplementation();
    }
    

    public void doIncorrectImplementation() {
        //interfacesegregation.incorrect.Crow crow = new interfacesegregation.incorrect.Crow();
        //interfacesegregation.incorrect.Penguin penguin = new interfacesegregation.incorrect.Penguin();
        
        //crow.eat();
        //crow.sleep();
        //crow.fly();
        
        //penguin.eat();
        //penguin.sleep();
        //penguin.fly();
    }
    
    public void doCorrectImplementation() {
    	interfacesegregation.correct.Crow crow2 = new interfacesegregation.correct.Crow();
        interfacesegregation.correct.Penguin penguin2 = new interfacesegregation.correct.Penguin();
    
        crow2.eat();
        crow2.sleep();
        crow2.fly();
        
        penguin2.eat();
        penguin2.sleep();
    }
    
    public static void main(String [] args) {
        InterfaceSegregation is = new InterfaceSegregation();
    }
    
}