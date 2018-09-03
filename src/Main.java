
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Retha");
        
        Car myCar = new Car( 25.5, 
                             "1BC32E", 
                             Color.BLUE, 
                             true );
        
        Car sallyCar = new Car( 13.9, "3D20BN", Color.BLACK, false);
        
        System.out.println("My Car's Licence Plate " + myCar.licencePlate);
        System.out.println("Sally's Licence Plate " + sallyCar.licencePlate);
        
        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }
}