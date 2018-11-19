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

public class grade_ca94e375_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_ca94e375_000 mainClass = new grade_ca94e375_000 ();
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
        FloatObj n1 = new FloatObj (), n2 = new FloatObj (), n3 =
            new FloatObj (), n4 = new FloatObj ();
        FloatObj perc = new FloatObj ();
        output += (String.format ("Enter thresholds for A, B, C, D"));
        output +=
            (String.format ("\nin that order, decreasing percentages > "));
        n1.value = scanner.nextFloat ();
        n2.value = scanner.nextFloat ();
        n3.value = scanner.nextFloat ();
        n4.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        perc.value = scanner.nextFloat ();
        if (perc.value >= n1.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (perc.value >= n2.value && perc.value < n1.value) {
            output += (String.format ("Student has a B grade\n"));
        } else if (perc.value >= n3.value && perc.value < n2.value) {
            output += (String.format ("Student has a C grade\n"));
        } else if (perc.value >= n4.value && perc.value < n3.value) {
            output += (String.format ("Student has a D grade\n"));
        } else if (perc.value < n4.value) {
            output += (String.format ("Student has failed the course\n"));
        }
        if (true)
            return;;
    }
}
