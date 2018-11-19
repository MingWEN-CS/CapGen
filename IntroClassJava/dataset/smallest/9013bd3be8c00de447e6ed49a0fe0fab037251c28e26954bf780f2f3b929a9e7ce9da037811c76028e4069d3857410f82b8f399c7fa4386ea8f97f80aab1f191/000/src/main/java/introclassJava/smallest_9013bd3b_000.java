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

public class smallest_9013bd3b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_9013bd3b_000 mainClass = new smallest_9013bd3b_000 ();
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
        IntObj first = new IntObj (), second = new IntObj (), third =
            new IntObj (), fourth = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        first.value = scanner.nextInt ();
        second.value = scanner.nextInt ();
        third.value = scanner.nextInt ();
        fourth.value = scanner.nextInt ();
        if ((first.value < second.value) && (first.value < third.value)
                && (first.value < fourth.value)) {
            output += (String.format ("%d is the smallest\n", first.value));
        }
        if ((second.value < first.value) && (second.value < third.value)
                && (second.value < fourth.value)) {
            output += (String.format ("%d is the smallest\n", second.value));
        }
        if ((third.value < first.value) && (third.value < second.value)
                && (third.value < fourth.value)) {
            output += (String.format ("%d is the smallest\n", third.value));
        }
        if ((fourth.value < third.value) && (fourth.value < second.value)
                && (fourth.value < first.value)) {
            output += (String.format ("%d is the smallest\n", fourth.value));
        }
        if (true)
            return;;
    }
}
