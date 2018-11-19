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

public class digits_d2b889e1_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d2b889e1_004 mainClass = new digits_d2b889e1_004 ();
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
        IntObj x = new IntObj (), a = new IntObj (), b = new IntObj (), c =
            new IntObj (), y = new IntObj ();
        output += (String.format ("Enter an integer > "));
        b.value = scanner.nextInt ();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format ("\n%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format ("%d\n", y.value));
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format ("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                        (String.format ("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format ("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                        (String.format ("%d\nThat's all, have a nice day!\n", a.value));
                }
            }
        }
        if (true)
            return;;
    }
}
