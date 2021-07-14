import com.sun.jdi.ByteValue;
import com.sun.jdi.LongValue;

import java.util.Arrays;

public class JavaCore1 {
    public static void main(String[] args) {

        byte c = 0;
        Byte C = Byte.valueOf( c);
        short b = 1;
        Short B = Short.valueOf( b);
        int a =2;
        Integer A = Integer.valueOf(a) ;
        long d = 3;
        Long D = Long.valueOf(d);
        float i = 4;
        Float I = Float.valueOf(i);
        double f = 5 ;
        Double F = Double.valueOf(f);
        char g = 6 ;
        Character G = Character.valueOf(g);
        boolean j =true ;
        Boolean J = Boolean.valueOf(j);

        System.out.print(Byte.MAX_VALUE + " ");
        System.out.println(Byte.MIN_VALUE);
        System.out.print(Short.MAX_VALUE + " ");
        System.out.println(Short.MIN_VALUE);
        System.out.print(Integer.MAX_VALUE + " ");
        System.out.println(Integer.MIN_VALUE);
        System.out.print(Long.MAX_VALUE + " ");
        System.out.println(Long.MIN_VALUE);
        System.out.print(Float.MAX_VALUE + " ");
        System.out.println(Float.MIN_VALUE);
        System.out.print(Double.MAX_VALUE + " ");
        System.out.println(Double.MIN_VALUE);
        System.out.print(Character.MAX_VALUE + " ");
        System.out.println(Character.MIN_VALUE);



        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(array).average());
        System.out.println(Arrays.stream(array).min());






    }



}
