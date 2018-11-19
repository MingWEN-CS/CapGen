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

public class grade_295afd89_010 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_295afd89_010 mainClass = new grade_295afd89_010 ();
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
        FloatObj a = new FloatObj ();
        FloatObj b = new FloatObj ();
        FloatObj c = new FloatObj ();
        FloatObj d = new FloatObj ();
        FloatObj perc = new FloatObj ();
        CharObj grade = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat ();
        b.value = scanner.nextFloat ();
        c.value = scanner.nextFloat ();
        d.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        perc.value = scanner.nextFloat ();
        if (perc.value > a.value) {
            grade.value = 'A';
        } else if (perc.value > b.value) {
            grade.value = 'B';
        } else if (perc.value > c.value) {
            grade.value = 'C';
        } else if (perc.value > d.value) {
            grade.value = 'D';
        } else {
            grade.value = 'F';
        }
        output += (String.format ("Student has an %c grade\n", grade.value));
        if (true)
            return;;
    }
}
