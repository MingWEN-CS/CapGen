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

public class digits_f2997e14_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_f2997e14_002 mainClass = new digits_f2997e14_002 ();
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
        IntObj digit = new IntObj (), input = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        input.value = scanner.nextInt ();
        output += (String.format ("\n"));
        while (true) {
            digit.value = input.value % 10;
            if (input.value == 0) {
                output += (String.format ("0\n"));
                break;
            } else if (Math.abs (digit.value) < 10) {
                digit.value = Math.abs (digit.value);
                output += (String.format ("%d\n", digit.value));
            }
            input.value = input.value / 10;
            if (Math.abs (input.value) < 10 && input.value != 0) {
                output += (String.format ("%d\n", input.value));
                break;
            }
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
