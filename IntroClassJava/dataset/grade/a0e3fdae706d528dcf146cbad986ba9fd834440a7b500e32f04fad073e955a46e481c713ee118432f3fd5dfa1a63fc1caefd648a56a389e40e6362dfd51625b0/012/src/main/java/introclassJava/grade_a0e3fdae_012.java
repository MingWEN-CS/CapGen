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

public class grade_a0e3fdae_012 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_a0e3fdae_012 mainClass = new grade_a0e3fdae_012 ();
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
        FloatObj th_1 = new FloatObj (), th_2 = new FloatObj (), th_3 =
            new FloatObj (), th_4 = new FloatObj (), score = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\n in that order, decreasing percentages> "));
        th_1.value = scanner.nextFloat ();
        th_2.value = scanner.nextFloat ();
        th_3.value = scanner.nextFloat ();
        th_4.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat ();
        if (score.value >= th_1.value) {
            output += (String.format ("Student has an A grade \n"));
        } else {
            if (th_2.value <= score.value && score.value < th_1.value) {
                output += (String.format ("Student has an B grade \n"));
            } else {
                if (th_3.value <= score.value && score.value < th_2.value) {
                    output += (String.format ("Student has an C grade \n"));
                } else {
                    if (th_4.value <= score.value && score.value < th_3.value) {
                        output += (String.format ("Student has an D grade \n"));
                    } else {
                        if (score.value < th_4.value) {
                            output += (String.format ("Student has an F grade \n"));
                        }
                    }
                }
            }
        }
        if (true)
            return;;
    }
}
