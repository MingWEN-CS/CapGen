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

public class median_cd2d9b5b_010 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_cd2d9b5b_010 mainClass = new median_cd2d9b5b_010 ();
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
        IntObj num1 = new IntObj (), num2 = new IntObj (), num3 =
            new IntObj (), median = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt ();
        num2.value = scanner.nextInt ();
        num3.value = scanner.nextInt ();
        if ((num1.value < num2.value && num1.value > num3.value)
                || (num1.value > num2.value && num1.value < num3.value)) {
            median.value = num1.value;
        } else if ((num2.value < num1.value && num2.value > num3.value)
                   || (num2.value > num1.value && num2.value < num3.value)) {
            median.value = num2.value;
        } else {
            median.value = num3.value;
        }
        output += (String.format ("%d is the median", median.value));
        if (true)
            return;;
    }
}
