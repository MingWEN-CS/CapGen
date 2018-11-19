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

public class grade_b1924d63_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_b1924d63_000 mainClass = new grade_b1924d63_000 ();
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
        FloatObj a = new FloatObj (), b = new FloatObj (), c =
            new FloatObj (), d = new FloatObj (), score = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat ();
        b.value = scanner.nextFloat ();
        c.value = scanner.nextFloat ();
        d.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat ();
        if (score.value >= a.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if ((score.value >= b.value) && (score.value > a.value)) {
            output += (String.format ("Student has an A grade\n"));
        } else if ((score.value >= c.value) && (score.value < b.value)) {
            output += (String.format ("Student has an A grade\n"));
        } else if ((score.value >= d.value) && (score.value < c.value)) {
            output += (String.format ("Student has an A grade\n"));
        } else if (score.value < d.value) {
            output += (String.format ("Student has failed the course\n"));
        }
        if (true)
            return;;
    }
}
