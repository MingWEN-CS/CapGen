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

public class grade_9013bd3b_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_9013bd3b_000 mainClass = new grade_9013bd3b_000 ();
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
        FloatObj A = new FloatObj (), B = new FloatObj (), C =
            new FloatObj (), D = new FloatObj (), avg = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (perrcent) >"));
        avg.value = scanner.nextFloat ();
        if (avg.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
        }
        if (avg.value >= B.value && avg.value < A.value) {
            output += (String.format ("Student has an B grade\n"));
        }
        if (avg.value >= C.value && avg.value < B.value) {
            output += (String.format ("Student has an C grade\n"));
        }
        if (avg.value >= D.value && avg.value < C.value) {
            output += (String.format ("Student has an D grade\n"));
        }
        if (avg.value < D.value) {
            output += (String.format ("Student has an F grade\n"));
        }
        if (true)
            return;;
    }
}
