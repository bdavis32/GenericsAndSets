package practice;

import java.util.ArrayList;
import java.util.List;
import common.Address;

/**
 *
 * @author Benjamin
 */
public class Practice1 {
    public static void main(String[] args) {
        
        Address address = new Address();
        address.setAddress1("1234 Street");
        address.setCity("Milwaukee");
        
        /**
         * A List is an ordered structure of objects.
         * The ordering is based on entry order (which comes in 1st, 2nd, 3rd, etc...)
         * These lists can ONLY store objects.
         */
        
        /*//This is the Wrong Way to create a list
        ArrayList list = new ArrayList();
        //Things are going to get a little weird...
        list.add("Hello"); //Strings are technically objects in Java
        //Can you add a number?
        list.add(1); //In Java ver. 1.4 and below, this wouldn't work
        //Technically you're not allowed to store a primitive in a list
        //In version 1.5, a new feature is introduced called autoboxing and autounboxing
        
        //This is what you used to do in Java 1.4 and before
        list.add(new Integer(1));
        //So what is autoboxing and autounboxing?
        //Here's a variable that represents a primitive
        int x = 1;
        //This is how you store it in an Integer object
        Integer y = new Integer(1);
        int primitive = y.intValue();
        //This is what you used to do in Java 1.4 and below
        //It's called boxing and unboxing
        
        //This process is automated in 1.5
        Integer a = 1;
        int primitive2 = a;
        /*Type Wrapper classes
            int   --> Integer
            long  --> Long
            double--> Double
        */
        //Let's try adding an Integer object to the list
        // Integer value = list.get(1);
        //Can't do that. It's a plain object
        //Has to be casted
        
        //Integer value = (Integer)list.get(1);
        
        /*//Create a list
        List<String> list = new ArrayList<>();
        list.add("Beer");
        list.add("Chips");
        list.add("Vodka");
        list.add("Beer");
        
        //This is a Java 8 feature
        list.forEach((item) -> {
            System.out.println(item);
        });*/
    }
}
