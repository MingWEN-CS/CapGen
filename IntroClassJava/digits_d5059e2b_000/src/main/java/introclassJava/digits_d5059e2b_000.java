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

public class digits_d5059e2b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_d5059e2b_000 mainClass = new digits_d5059e2b_000 ();
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
        IntObj num = new IntObj (), digit = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        num.value = scanner.nextInt ();
        digit.value = Math.abs (num.value) % 10;
        if (num.value < 0) {
            num.value = Math.abs (num.value);
            while (num.value != digit.value) {
                digit.value = num.value % 10;
                if (num.value <= digit.value) {
                    output += (String.format ("\n-%d", digit.value));
                } else {
                    output += (String.format ("\n%d", digit.value));
                }
                num.value = (num.value - digit.value) / 10;
                if (num.value == 0) {
                    break;
                }
                if (num.value == digit.value) {
                    output += (String.format ("\n-%d", num.value));
                }
            }
        } else if (num.value == 0) {
            output += (String.format ("\n0"));
        } else if (num.value >= 0) {
            while (num.value != digit.value) {
                digit.value = num.value % 10;
                output += (String.format ("\n%d", digit.value));
                num.value = (num.value - digit.value) / 10;
                if (num.value == 0) {
                    break;
                }
                if (num.value == digit.value) {
                    output += (String.format ("\n%d", num.value));
                }
            }
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
