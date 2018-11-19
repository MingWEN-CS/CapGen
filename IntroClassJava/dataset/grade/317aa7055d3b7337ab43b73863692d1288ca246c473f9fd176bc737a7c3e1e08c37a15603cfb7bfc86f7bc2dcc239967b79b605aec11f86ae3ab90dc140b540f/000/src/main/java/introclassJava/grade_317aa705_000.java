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

public class grade_317aa705_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_317aa705_000 mainClass = new grade_317aa705_000 ();
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
            new FloatObj (), D = new FloatObj (), percent = new FloatObj ();
        CharObj grade = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) > "));
        percent.value = scanner.nextFloat ();
        if (percent.value >= A.value) {
            grade.value = 'A';
        }
        if ((percent.value < A.value) && (percent.value >= B.value)) {
            grade.value = 'B';
        }
        if ((percent.value < B.value) && (percent.value >= C.value)) {
            grade.value = 'C';
        }
        if ((percent.value < C.value) && (percent.value >= D.value)) {
            grade.value = 'D';
        }
        if (percent.value < D.value) {
            grade.value = 'F';
        }
        output += (String.format ("Student has an %c grade\n\n", grade.value));
        if (true)
            return;;
    }
}
