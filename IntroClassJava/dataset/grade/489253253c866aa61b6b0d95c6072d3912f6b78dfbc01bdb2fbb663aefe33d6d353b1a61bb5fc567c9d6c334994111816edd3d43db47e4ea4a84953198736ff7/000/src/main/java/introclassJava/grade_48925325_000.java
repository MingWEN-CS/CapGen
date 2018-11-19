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

public class grade_48925325_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_48925325_000 mainClass = new grade_48925325_000 ();
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
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\n in that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat ();
        if (percent.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (percent.value >= B.value) {
            output += (String.format ("Student has a B grade\n"));
        } else if (percent.value >= C.value) {
            output += (String.format ("Student has a C grade\n"));
        } else if (percent.value >= D.value) {
            output += (String.format ("Student has a D grade\n"));
        } else {
            output += (String.format ("Student has a F grade\n"));
        }
        if (true)
            return;;
    }
}
