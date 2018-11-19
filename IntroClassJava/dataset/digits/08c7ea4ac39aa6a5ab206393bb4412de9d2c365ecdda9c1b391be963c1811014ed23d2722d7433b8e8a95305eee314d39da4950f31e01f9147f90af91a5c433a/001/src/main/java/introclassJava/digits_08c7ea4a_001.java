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

public class digits_08c7ea4a_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_08c7ea4a_001 mainClass = new digits_08c7ea4a_001 ();
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
        IntObj num = new IntObj (), numl = new IntObj (), n = new IntObj (), d0 =
            new IntObj (), d1 = new IntObj (), d2 = new IntObj (), d3 =
            new IntObj (), d4 = new IntObj (), d5 = new IntObj (), d6 =
            new IntObj (), d7 = new IntObj (), d8 = new IntObj (), d9 =
            new IntObj ();
        output += (String.format ("\nEnter an integer > "));
        num.value = scanner.nextInt ();
        numl.value = num.value;
        n.value = 0;
        while (numl.value > 0) {
            n.value += 1;
            numl.value = numl.value / 10;
        }
        d0.value = num.value % 10;
        num.value = (num.value - d0.value) / 10;
        d1.value = num.value % 10;
        num.value = (num.value - d1.value) / 10;
        d2.value = num.value % 10;
        num.value = (num.value - d2.value) / 10;
        d3.value = num.value % 10;
        num.value = (num.value - d3.value) / 10;
        d4.value = num.value % 10;
        num.value = (num.value - d4.value) / 10;
        d5.value = num.value % 10;
        num.value = (num.value - d5.value) / 10;
        d6.value = num.value % 10;
        num.value = (num.value - d6.value) / 10;
        d7.value = num.value % 10;
        num.value = (num.value - d7.value) / 10;
        d8.value = num.value % 10;
        num.value = (num.value - d8.value) / 10;
        d9.value = num.value % 10;
        num.value = (num.value - d9.value) / 10;
        output += (String.format ("\n%d\n", d0.value));
        if (n.value > 1) {
            output += (String.format ("%d\n", d1.value));
        }
        if (n.value > 2) {
            output += (String.format ("%d\n", d2.value));
        }
        if (n.value > 3) {
            output += (String.format ("%d\n", d3.value));
        }
        if (n.value > 4) {
            output += (String.format ("%d\n", d4.value));
        }
        if (n.value > 5) {
            output += (String.format ("%d\n", d5.value));
        }
        if (n.value > 6) {
            output += (String.format ("%d\n", d6.value));
        }
        if (n.value > 7) {
            output += (String.format ("%d\n", d7.value));
        }
        if (n.value > 8) {
            output += (String.format ("%d\n", d8.value));
        }
        if (n.value > 9) {
            output += (String.format ("%d\n", d9.value));
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
