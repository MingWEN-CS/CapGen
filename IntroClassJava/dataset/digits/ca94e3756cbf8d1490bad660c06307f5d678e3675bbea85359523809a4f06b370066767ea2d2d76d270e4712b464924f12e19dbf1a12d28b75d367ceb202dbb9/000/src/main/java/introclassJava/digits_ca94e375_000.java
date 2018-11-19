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

public class digits_ca94e375_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_ca94e375_000 mainClass = new digits_ca94e375_000 ();
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
        IntObj n = new IntObj ();
        IntObj x = new IntObj (), y = new IntObj ();
        IntObj temp = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        y.value = scanner.nextInt ();
        n.value = 0;
        while (n.value <= 10) {
            x.value = y.value % 10;
            output += (String.format ("\n%d", Math.abs (x.value)));
            x.value = y.value / 10;
            if (x.value > -10 && x.value < 0) {
                output += (String.format ("\n%d", x.value));
                output += (String.format ("\nThat's all, have a nice day!\n"));
                if (true)
                    return;;
            }
            temp.value = x.value;
            x.value = y.value;
            y.value = temp.value;
            n.value = n.value + 1;
        }
        if (true)
            return;;
    }
}
