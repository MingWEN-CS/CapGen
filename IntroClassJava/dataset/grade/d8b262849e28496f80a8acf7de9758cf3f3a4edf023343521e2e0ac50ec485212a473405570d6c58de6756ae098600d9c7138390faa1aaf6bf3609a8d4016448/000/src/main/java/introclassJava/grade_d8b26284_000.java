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

public class grade_d8b26284_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_d8b26284_000 mainClass = new grade_d8b26284_000 ();
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
        DoubleObj A = new DoubleObj (), B = new DoubleObj (), C =
            new DoubleObj (), D = new DoubleObj (), score = new DoubleObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble ();
        B.value = scanner.nextDouble ();
        C.value = scanner.nextDouble ();
        D.value = scanner.nextDouble ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextDouble ();
        if (score.value < D.value) {
            output += (String.format ("Student has an F grade\n"));
        } else if (score.value >= D.value && score.value < C.value) {
            output += (String.format ("Student has an D grade\n"));
        } else if (score.value >= C.value && score.value < B.value) {
            output += (String.format ("Student has an C grade\n"));
        } else if (score.value >= B.value && score.value < A.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (score.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
        }
        if (true)
            return;;
    }
}
