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

public class smallest_1b31fa5c_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_1b31fa5c_003 mainClass = new smallest_1b31fa5c_003 ();
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
        IntObj A = new IntObj (), B = new IntObj (), C = new IntObj (), D =
            new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        A.value = scanner.nextInt ();
        B.value = scanner.nextInt ();
        C.value = scanner.nextInt ();
        D.value = scanner.nextInt ();
        if (A.value < B.value && A.value < C.value && A.value < D.value) {
            output += (String.format ("%d is the smallest\n", A.value));
            if (true)
                return;;
        } else if (B.value < A.value && B.value < C.value && B.value < D.value) {
            output += (String.format ("%d is the smallest\n", B.value));
            if (true)
                return;;
        } else if (C.value < A.value && C.value < B.value && C.value < D.value) {
            output += (String.format ("%d is the smallest\n", C.value));
            if (true)
                return;;
        } else if (D.value < A.value && D.value < B.value && D.value < C.value) {
            output += (String.format ("%d is the smallest\n", D.value));
            if (true)
                return;;
        }
    }
}
