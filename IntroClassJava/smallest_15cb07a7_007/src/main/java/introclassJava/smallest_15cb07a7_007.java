package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class smallest_15cb07a7_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_15cb07a7_007 mainClass = new smallest_15cb07a7_007 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        IntObj frst = new IntObj (), scnd = new IntObj (), thrd =
            new IntObj (), frth = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        frst.value = scanner.nextInt ();
        scnd.value = scanner.nextInt ();
        thrd.value = scanner.nextInt ();
        frth.value = scanner.nextInt ();
        if (frst.value < scnd.value && frst.value < thrd.value
                && frst.value < frth.value) {
            output += (String.format ("%d is the smallest\n", frst.value));
        } else if (scnd.value < frst.value && scnd.value < thrd.value
                   && scnd.value < frth.value) {
            output += (String.format ("%d is the smallest\n", scnd.value));
        } else if (thrd.value < frst.value && thrd.value < scnd.value
                   && thrd.value < frth.value) {
            output += (String.format ("%d is the smallest\n", thrd.value));
        } else {
            output += (String.format ("%d is the smallest\n", frth.value));
        }
        if (true)
            return;;
    }
}
