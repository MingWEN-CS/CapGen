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

public class digits_317aa705_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_317aa705_002 mainClass = new digits_317aa705_002 ();
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
        IntObj negative = new IntObj (), integer = new IntObj (), i =
            new IntObj (), digit = new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        integer.value = scanner.nextInt ();
        negative.value = integer.value;
        for (i.value = 1; i.value <= 10; i.value += 1) {
            if ((i.value != 10) && (negative.value < 0)) {
                digit.value = (-1 * integer.value) % 10;
            } else {
                digit.value = integer.value % 10;
            }
            integer.value = integer.value / 10;
            output += (String.format ("\n%d", digit.value));
        }
        output += (String.format ("\nThat's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
