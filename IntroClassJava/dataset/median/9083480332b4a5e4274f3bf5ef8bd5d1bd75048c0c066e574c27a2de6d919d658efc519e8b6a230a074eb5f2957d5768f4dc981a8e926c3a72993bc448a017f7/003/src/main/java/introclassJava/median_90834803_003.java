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

public class median_90834803_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_90834803_003 mainClass = new median_90834803_003 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), median =
            new IntObj ();
        output += (String.format ("Enter first integer > "));
        a.value = scanner.nextInt ();
        output += (String.format ("Enter second integer > "));
        b.value = scanner.nextInt ();
        output += (String.format ("Enter third integer > "));
        c.value = scanner.nextInt ();
        if ((a.value >= b.value && b.value >= c.value)
                || (a.value <= b.value && b.value <= c.value)) {
            output += (String.format ("%d is the median\n", b.value));
        } else if ((b.value >= a.value && a.value >= c.value)
                   || (c.value <= a.value && a.value <= b.value)) {
            output += (String.format ("%d is the median\n", a.value));
        } else if ((a.value >= c.value && c.value >= b.value)
                   || (a.value <= c.value && c.value <= b.value)) {
            output += (String.format ("%d is the median\n", c.value));
        } else {
            if (true)
                return;;
        }
        if (true)
            return;;
    }
}
