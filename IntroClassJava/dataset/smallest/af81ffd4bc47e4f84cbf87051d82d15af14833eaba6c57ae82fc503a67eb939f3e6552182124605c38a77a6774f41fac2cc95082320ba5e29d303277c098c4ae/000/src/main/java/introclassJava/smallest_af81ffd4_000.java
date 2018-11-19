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

public class smallest_af81ffd4_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_af81ffd4_000 mainClass = new smallest_af81ffd4_000 ();
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
        DoubleObj a = new DoubleObj (), b = new DoubleObj (), c =
            new DoubleObj (), d = new DoubleObj (), m = new DoubleObj (), n =
            new DoubleObj (), p = new DoubleObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        if (a.value > b.value) {
            m.value = b.value;
        } else if (a.value < b.value) {
            m.value = a.value;
        }
        if (m.value > c.value) {
            n.value = c.value;
        } else if (m.value < c.value) {
            n.value = m.value;
        }
        if (n.value > d.value) {
            p.value = d.value;
        } else if (n.value < d.value) {
            p.value = n.value;
        }
        output += (String.format ("%.0f is the smallest\n", p.value));
        if (true)
            return;;
    }
}
