package utilities;

import java.util.Random;

public class CommonMethods { // khadija u can also add the screenShot method check back last sql class
    //generates random ssn
    public static String generatesRandomSSN(){
        int m = (int) Math.pow(9,8);
        return String.valueOf( m + new Random().nextInt(9*m));
    }

    public static void main(String[] args) {
        System.out.println(generatesRandomSSN());
    }
}
