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

public class median_9013bd3b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_9013bd3b_000 mainClass = new median_9013bd3b_000 ();
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
        DoubleObj first = new DoubleObj (), second = new DoubleObj (), third =
            new DoubleObj ();
        output +=
            (String.format ("Please enter 3 numbers seperated by spaces > "));
        first.value = scanner.nextDouble ();
        second.value = scanner.nextDouble ();
        third.value = scanner.nextDouble ();
        if ((first.value > second.value && first.value < third.value)
                || (first.value < second.value && first.value > third.value)) {
            output += (String.format ("%.0f is the median\n", first.value));
        }
        if ((second.value > first.value && second.value < third.value)
                || (second.value < first.value && second.value > third.value)) {
            output += (String.format ("%.0f is the median\n", second.value));
        }
        if ((third.value > first.value && third.value < second.value)
                || (third.value < first.value && third.value > second.value)) {
            output += (String.format ("%.0f is the median\n", third.value));
        }
        if (true)
            return;;
    }
}
