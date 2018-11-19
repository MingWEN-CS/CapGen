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

public class smallest_cb243beb_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_cb243beb_000 mainClass = new smallest_cb243beb_000 ();
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
        IntObj n1 = new IntObj (), n2 = new IntObj (), n3 = new IntObj (), n4 =
            new IntObj (), min = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        n1.value = scanner.nextInt ();
        n2.value = scanner.nextInt ();
        n3.value = scanner.nextInt ();
        n4.value = scanner.nextInt ();
        if (n1.value <= n2.value) {
            min.value = n1.value;
        } else {
            min.value = n2.value;
        }
        if (min.value >= n3.value) {
            min.value = n3.value;
        }
        if (min.value >= n4.value) {
            min.value = n4.value;
        } else {
            output += (String.format ("%d is the smallest\n", min.value));
        }
        if (true)
            return;;
    }
}
