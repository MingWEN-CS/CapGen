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

public class grade_30074a0e_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_30074a0e_004 mainClass = new grade_30074a0e_004 ();
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
            new FloatObj (), D = new FloatObj (), Grade = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        Grade.value = scanner.nextFloat ();
        if (Grade.value >= A.value) {
            output += (String.format ("the student has an A grade\n"));
        }
        if (Grade.value >= B.value && Grade.value < A.value) {
            output += (String.format ("the student has an B grade\n"));
        }
        if (Grade.value >= C.value && Grade.value < B.value) {
            output += (String.format ("the student has an C grade\n"));
        }
        if (Grade.value < C.value && Grade.value >= D.value) {
            output += (String.format ("the student has an D grade\n"));
        }
        if (Grade.value < D.value) {
            output += (String.format ("the student has an F grade\n"));
        }
        if (true)
            return;;
    }
}
