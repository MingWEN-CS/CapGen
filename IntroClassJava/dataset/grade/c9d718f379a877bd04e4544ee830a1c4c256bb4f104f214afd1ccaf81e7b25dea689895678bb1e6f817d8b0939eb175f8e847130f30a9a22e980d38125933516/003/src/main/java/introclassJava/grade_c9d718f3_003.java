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

public class grade_c9d718f3_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_c9d718f3_003 mainClass = new grade_c9d718f3_003 ();
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
        FloatObj grade = new FloatObj (), per1 = new FloatObj (), per2 =
            new FloatObj (), per3 = new FloatObj (), per4 = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        per1.value = scanner.nextFloat ();
        per2.value = scanner.nextFloat ();
        per3.value = scanner.nextFloat ();
        per4.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat ();
        if (grade.value >= per1.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (grade.value >= per2.value && grade.value < per1.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (grade.value >= per3.value && grade.value < per2.value) {
            output += (String.format ("Studnet has an C grade\n"));
        } else if (grade.value >= per4.value && grade.value < per3.value) {
            output += (String.format ("Student has an D grade\n"));
        } else if (grade.value < per4.value) {
            output += (String.format ("Studnet has failed the course\n"));
        }
        if (true)
            return;;
    }
}
