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

public class smallest_346b1d3c_002 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_346b1d3c_002 mainClass = new smallest_346b1d3c_002 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), d =
            new IntObj (), num_1 = new IntObj (), num_2 = new IntObj (), num_3 =
            new IntObj (), num_4 = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers seperated by spaces > "));
        num_1.value = scanner.nextInt ();
        num_2.value = scanner.nextInt ();
        num_3.value = scanner.nextInt ();
        num_4.value = scanner.nextInt ();
        a.value = (num_1.value);
        b.value = (num_2.value);
        c.value = (num_3.value);
        d.value = (num_4.value);
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format ("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format ("%d is the smalles\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format ("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format ("%d is the smallest\n", d.value));
        }
        if (true)
            return;;
    }
}
