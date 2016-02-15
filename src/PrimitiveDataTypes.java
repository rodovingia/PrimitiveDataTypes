/**
 * Created by Ronald on 15-2-2016.
 */
public class PrimitiveDataTypes {
    public static void main(String args[]) {
        System.out.println("Java drives the Web.");

        Integer i = 0;
        System.out.println("minimum integer value:     " + i.MIN_VALUE);
        System.out.println("maximum integer value:     " + i.MAX_VALUE);
        System.out.println("size of an integer:        " + i.SIZE);
        System.out.println("maximum integer value + 1: " + i.MAX_VALUE + 1 + "\n");

        Long l = 0L;
        System.out.println("minimum long value:     " + l.MIN_VALUE);
        System.out.println("maximum long value:     " + l.MAX_VALUE);
        System.out.println("size of a long:         " + l.SIZE);
        System.out.println("minimum long value - 1: " + (l.MIN_VALUE - 1) + "\n");

        Float f = 0F;
        System.out.println("minimum float value:  " + f.MIN_VALUE);
        System.out.println("maximum float value:  " + f.MAX_VALUE);
        System.out.println("size of a float:      " + f.SIZE);
        System.out.println("-maximum float value: " + -f.MAX_VALUE + "\n");

        Double d = 0.0;
        System.out.println("minimum double value:     " + d.MIN_VALUE);
        System.out.println("maximum double value:     " + d.MAX_VALUE);
        System.out.println("size of a double:         " + d.SIZE);

        System.out.println("minimum double value / 2: " + d.MIN_VALUE / 2  + "\n");
    }

}
