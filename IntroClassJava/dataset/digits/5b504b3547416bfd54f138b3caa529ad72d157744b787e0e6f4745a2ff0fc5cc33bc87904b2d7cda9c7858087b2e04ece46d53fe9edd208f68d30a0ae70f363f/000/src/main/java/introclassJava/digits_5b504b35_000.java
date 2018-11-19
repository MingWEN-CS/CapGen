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

public class digits_5b504b35_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_5b504b35_000 mainClass = new digits_5b504b35_000 ();
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
        IntObj n = new IntObj (), input = new IntObj (), digit =
            new IntObj (), inter = new IntObj (), lastdigit = new IntObj ();
        output += (String.format ("Enter an integer > "));
        input.value = scanner.nextInt ();
        lastdigit.value = 0;
        for (n.value = 10; n.value < 10000000001L; n.value = n.value * 10) {
            digit.value = input.value % n.value;
            inter.value = digit.value;
            inter.value = inter.value - lastdigit.value;
            if (input.value < 0 && !(input.value == digit.value)) {
                output += (String.format ("%d\n", -inter.value * 10 / n.value));
            }
            if (input.value < 0 && input.value == digit.value) {
                output += (String.format ("%d\n", inter.value * 10 / n.value));
            }
            if (input.value > 0) {
                output += (String.format ("%d\n", inter.value * 10 / n.value));
            }
            if (input.value == digit.value) {
                break;
            }
            lastdigit.value = digit.value;
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
