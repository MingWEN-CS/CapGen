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

public class grade_fe9d5fb9_004 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_fe9d5fb9_004 mainClass = new grade_fe9d5fb9_004 ();
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
        FloatObj grade1 = new FloatObj (), grade2 = new FloatObj (), grade3 =
            new FloatObj (), grade4 = new FloatObj (), score = new FloatObj ();
        output += (String.format ("Enter thresholds for A, B, C, D\n"));
        output += (String.format ("in that order, decreasing percentages > "));
        grade1.value = scanner.nextFloat ();
        grade2.value = scanner.nextFloat ();
        grade3.value = scanner.nextFloat ();
        grade4.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat ();
        if (score.value >= grade1.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (score.value >= grade2.value && score.value < grade1.value) {
            output += (String.format ("Student has a B grade\n"));
        } else if (score.value >= grade3.value && score.value < grade2.value) {
            output += (String.format ("Student has a C grade\n"));
        } else if (score.value >= grade4.value && score.value < grade3.value) {
            output += (String.format ("Student has a D grade\n"));
        } else {
            output += (String.format ("Student has failed the course.\n"));
        }
        if (true)
            return;;
    }
}
