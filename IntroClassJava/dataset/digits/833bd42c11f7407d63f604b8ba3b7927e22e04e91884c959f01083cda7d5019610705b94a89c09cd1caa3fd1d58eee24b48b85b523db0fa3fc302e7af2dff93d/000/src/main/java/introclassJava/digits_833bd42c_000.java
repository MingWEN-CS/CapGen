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

public class digits_833bd42c_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_833bd42c_000 mainClass = new digits_833bd42c_000 ();
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
        IntObj num_input = new IntObj (), num_input2 = new IntObj (), digit =
            new IntObj ();
        output += (String.format ("Enter an integer > "));
        num_input.value = scanner.nextInt ();
        num_input2.value = num_input.value;
        while (num_input2.value != 0) {
            digit.value = Math.abs (num_input2.value % 10);
            num_input2.value = (num_input2.value / 10);
            if ((num_input2.value == 0) && (num_input.value < 0)) {
                digit.value = digit.value * (-1);
            }
            output += (String.format ("\n%d\n", digit.value));
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
