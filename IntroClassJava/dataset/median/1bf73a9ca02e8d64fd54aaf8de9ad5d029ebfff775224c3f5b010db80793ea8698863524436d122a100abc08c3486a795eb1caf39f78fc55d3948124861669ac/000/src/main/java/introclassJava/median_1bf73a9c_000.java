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

public class median_1bf73a9c_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_1bf73a9c_000 mainClass = new median_1bf73a9c_000 ();
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
            new IntObj (), ans = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separeted by spaces > "));
        first.value = scanner.nextInt ();
        second.value = scanner.nextInt ();
        third.value = scanner.nextInt ();
        if ((first.value > second.value && first.value < third.value)
                || (first.value > third.value && first.value < second.value)) {
            ans.value = first.value;
        } else if ((second.value > first.value && second.value < third.value)
                   || (second.value > third.value && second.value < first.value)) {
            ans.value = second.value;
        } else {
            ans.value = third.value;
        }
        output += (String.format ("%d is the median\n", ans.value));
        if (true)
            return;;
    }
}
