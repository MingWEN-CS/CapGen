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

public class smallest_6aaeaf2f_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_6aaeaf2f_000 mainClass = new smallest_6aaeaf2f_000 ();
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
        IntObj int1 = new IntObj (), int2 = new IntObj (), int3 =
            new IntObj (), int4 = new IntObj (), tmp = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by space > "));
        int1.value = scanner.nextInt ();
        int2.value = scanner.nextInt ();
        int3.value = scanner.nextInt ();
        int4.value = scanner.nextInt ();
        tmp.value = int1.value;
        if (int1.value > int2.value) {
            tmp.value = int2.value;
        } else if (tmp.value > int3.value) {
            tmp.value = int3.value;
        } else if (tmp.value > int4.value) {
            tmp.value = int4.value;
        }
        output += (String.format ("%d is the smallest\n", tmp.value));
        if (true)
            return;;
    }
}
