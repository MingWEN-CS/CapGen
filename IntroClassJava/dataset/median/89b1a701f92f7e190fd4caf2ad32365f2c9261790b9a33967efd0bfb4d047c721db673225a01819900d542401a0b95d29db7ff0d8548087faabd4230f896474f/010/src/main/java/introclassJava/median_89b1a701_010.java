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

public class median_89b1a701_010 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_89b1a701_010 mainClass = new median_89b1a701_010 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), m =
            new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        if (a.value == b.value || a.value == c.value) {
            m.value = a.value;
        } else if (b.value == c.value || b.value == a.value) {
            m.value = b.value;
        } else if (c.value == a.value || c.value == b.value) {
            m.value = c.value;
        } else {
            if ((a.value >= b.value && a.value <= c.value)
                    || (a.value >= c.value && a.value <= b.value)) {
                m.value = b.value;
            } else if ((b.value >= a.value && b.value <= c.value)
                       || (b.value >= c.value && b.value <= a.value)) {
                m.value = b.value;
            } else if ((c.value >= a.value && c.value <= b.value)
                       || (c.value >= b.value && c.value <= a.value)) {
                m.value = c.value;
            }
        }
        output += (String.format ("%d is the median\n", m.value));
        if (true)
            return;;
    }
}
