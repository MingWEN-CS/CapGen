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

public class median_9c9308d4_012 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_9c9308d4_012 mainClass = new median_9c9308d4_012 ();
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
        DoubleObj n1 = new DoubleObj (), n2 = new DoubleObj (), n3 =
            new DoubleObj (), median = new DoubleObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextDouble ();
        n2.value = scanner.nextDouble ();
        n3.value = scanner.nextDouble ();
        if (n1.value >= n2.value || n1.value >= n3.value) {
            if (n2.value >= n3.value && n1.value >= n2.value) {
                median.value = n2.value;
            } else if (n2.value >= n1.value) {
                median.value = n1.value;
            } else {
                median.value = n3.value;
            }
        } else if (n2.value >= n3.value) {
            median.value = n3.value;
        } else {
            median.value = n2.value;
        }
        output += (String.format ("%.0f is the median\n", median.value));
        if (true)
            return;;
    }
}
