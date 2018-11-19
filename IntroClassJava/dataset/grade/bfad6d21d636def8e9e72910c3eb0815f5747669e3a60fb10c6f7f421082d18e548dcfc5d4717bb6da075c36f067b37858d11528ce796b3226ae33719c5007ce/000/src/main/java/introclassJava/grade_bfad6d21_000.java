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

public class grade_bfad6d21_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_bfad6d21_000 mainClass = new grade_bfad6d21_000 ();
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
        FloatObj thresha = new FloatObj (), threshb = new FloatObj (), threshc =
            new FloatObj (), threshd = new FloatObj (), stuscore = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        thresha.value = scanner.nextFloat ();
        threshb.value = scanner.nextFloat ();
        threshc.value = scanner.nextFloat ();
        threshd.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        stuscore.value = scanner.nextFloat ();
        if (stuscore.value > thresha.value) {
            output += (String.format ("Student has an A grade\n"));
        }
        if ((stuscore.value < thresha.value) && (stuscore.value >= threshb.value)) {
            output += (String.format ("Student has an B grade\n"));
        }
        if ((stuscore.value < threshb.value) && (stuscore.value >= threshc.value)) {
            output += (String.format ("Student has an C grade\n"));
        }
        if ((stuscore.value < threshc.value) && (stuscore.value >= threshd.value)) {
            output += (String.format ("Student has an D grade\n"));
        }
        if (stuscore.value < threshd.value) {
            output += (String.format ("Student has failed the course"));
        }
        if (true)
            return;;
    }
}
