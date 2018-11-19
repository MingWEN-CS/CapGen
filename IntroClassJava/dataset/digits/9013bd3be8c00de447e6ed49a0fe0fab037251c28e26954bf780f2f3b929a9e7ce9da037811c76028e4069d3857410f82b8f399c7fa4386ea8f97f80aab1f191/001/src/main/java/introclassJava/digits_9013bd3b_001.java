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

public class digits_9013bd3b_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_9013bd3b_001 mainClass = new digits_9013bd3b_001 ();
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
        IntObj number = new IntObj (), digit = new IntObj (), j =
            new IntObj (), digit1 = new IntObj ();
        output += (String.format ("Enter an integer > "));
        number.value = scanner.nextInt ();
        output += (String.format ("\n"));
        j.value = 10;
        while (number.value != 0) {
            digit.value = number.value % j.value;
            if (digit.value < 0 && Math.abs (number.value * 10) < 100) {
                output += (String.format ("%d\n", digit.value));
                break;
            } else {
                digit1.value = Math.abs (digit.value);
            }
            output += (String.format ("%d\n", digit1.value));
            number.value = number.value / 10;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
