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

public class grade_d6364e6e_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_d6364e6e_007 mainClass = new grade_d6364e6e_007 ();
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
            new FloatObj (), D = new FloatObj (), Std = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        Std.value = scanner.nextFloat ();
        if (Std.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
            if (true)
                return;;
        } else if (Std.value >= B.value) {
            output += (String.format ("Student has an B grade\n"));
            if (true)
                return;;
        } else if (Std.value >= C.value) {
            output += (String.format ("Student has an C grade\n"));
            if (true)
                return;;
        } else if (Std.value >= D.value) {
            output += (String.format ("Student has a D grade\n"));
            if (true)
                return;;
        } else if (Std.value < D.value) {
            output += (String.format ("Student has failed the course\n"));
            if (true)
                return;;
        } else {
            output +=
                (String.format
                 ("Program did not understand that grade, please try again and remember to enter a percentage\n"));
            if (true)
                return;;
        }
    }
}
