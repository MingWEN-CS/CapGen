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

public class smallest_f8d57dea_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_f8d57dea_000 mainClass = new smallest_f8d57dea_000 ();
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
        IntObj v1 = new IntObj (), v2 = new IntObj (), v3 = new IntObj (), v4 =
            new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        v1.value = scanner.nextInt ();
        v2.value = scanner.nextInt ();
        v3.value = scanner.nextInt ();
        v4.value = scanner.nextInt ();
        if (v1.value < v2.value && v1.value < v3.value && v1.value < v4.value) {
            output += (String.format ("%d is the smallest\n", v1.value));
        } else if (v2.value < v1.value && v2.value < v3.value
                   && v2.value < v4.value) {
            output += (String.format ("%d is the smallest\n", v2.value));
        } else if (v3.value < v1.value && v3.value < v2.value
                   && v3.value < v4.value) {
            output += (String.format ("%d is the smallest\n", v3.value));
        } else {
            output += (String.format ("%d is the smallest\n", v4.value));
        }
        if (true)
            return;;
    }
}
