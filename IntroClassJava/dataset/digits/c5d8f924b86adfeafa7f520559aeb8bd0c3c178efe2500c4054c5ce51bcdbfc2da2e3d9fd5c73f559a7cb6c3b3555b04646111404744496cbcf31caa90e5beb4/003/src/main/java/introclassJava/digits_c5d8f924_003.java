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

public class digits_c5d8f924_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_c5d8f924_003 mainClass = new digits_c5d8f924_003 ();
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
        IntObj number = new IntObj (0), i = new IntObj (0), store =
            new IntObj (0), state = new IntObj (1);
        output += (String.format ("\nEnter an integer > "));
        number.value = scanner.nextInt ();
        output += (String.format ("\n"));
        while (i.value < 9) {
            if (number.value < 0) {
                number.value = number.value * -1;
                state.value = -1;
            }
            store.value = number.value % 10;
            if (number.value <= 9) {
                store.value = number.value * state.value;
            }
            output += (String.format ("%d\n", store.value));
            number.value = number.value / 10;
            i.value++;
            if (number.value == 0) {
                output += (String.format ("That's all, have a nice day!\n"));
                break;
            }
        }
        if (true)
            return;;
    }
}
