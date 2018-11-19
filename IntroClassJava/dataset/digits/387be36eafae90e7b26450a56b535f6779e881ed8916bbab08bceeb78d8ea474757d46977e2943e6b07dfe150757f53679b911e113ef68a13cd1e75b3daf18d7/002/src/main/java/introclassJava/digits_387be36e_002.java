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

public class digits_387be36e_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_387be36e_002 mainClass = new digits_387be36e_002 ();
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
        IntObj x = new IntObj (), d = new IntObj (), n = new IntObj (), z =
            new IntObj (), y = new IntObj ();
        output += (String.format ("Enter an integer > "));
        n.value = scanner.nextInt ();
        d.value = n.value / 10;
        z.value = n.value % 10;
        if (z.value > 0) {
            output += (String.format ("%d\n", z.value));
        } else if (z.value < 0) {
            y.value = z.value * (-1);
            output += (String.format ("%d\n", y.value));
        }
        if (d.value >= 0 && d.value <= 10) {
            output +=
                (String.format ("%d\nThat's all, have a nice day!\n", d.value));
            if (true)
                return;;
        }
        if (d.value > 0) {
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format ("%d\n", x.value));
                if (d.value < 10) {
                    output +=
                        (String.format ("%d\nThat's all, have a nice day!\n", d.value));
                    if (true)
                        return;;
                }
            }
        } else if (d.value < 0) {
            d.value = d.value * (-1);
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format ("%d\n", x.value));
                if (d.value < 10) {
                    d.value = d.value * (-1);
                    output +=
                        (String.format ("%d\nThat's all, have a nice day!\n", d.value));
                }
            }
        }
        if (true)
            return;;
    }
}
