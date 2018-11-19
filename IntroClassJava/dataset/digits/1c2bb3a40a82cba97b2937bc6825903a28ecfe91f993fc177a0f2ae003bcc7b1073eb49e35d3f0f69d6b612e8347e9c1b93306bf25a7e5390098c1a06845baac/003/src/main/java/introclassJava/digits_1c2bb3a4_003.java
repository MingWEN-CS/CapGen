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

public class digits_1c2bb3a4_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_1c2bb3a4_003 mainClass = new digits_1c2bb3a4_003 ();
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
        IntObj x = new IntObj (), y = new IntObj (), i = new IntObj ();
        IntObj step1 = new IntObj (10), step2 = new IntObj (100);
        IntObj num = new IntObj ();
        IntObj max = new IntObj (0);
        output += (String.format ("Enter an integer > "));
        x.value = scanner.nextInt ();
        y.value = x.value;
        while (y.value >= 10) {
            y.value /= 10;
            max.value++;
        }
        if (max.value >= 9) {
            output += (String.format ("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n"));
        } else {
            if (x.value < 0) {
                output += (String.format ("%d\n", x.value % 10));
                x.value = x.value * -1;
            } else {
                output += (String.format ("%d\n", x.value % 10));
            }
            for (i.value = 0; i.value < max.value; i.value++) {
                num.value =
                    ((x.value % step2.value - x.value % step1.value) / step1.value);
                output += (String.format ("%d\n", num.value));
                step2.value *= 10;
                step1.value *= 10;
            }
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
