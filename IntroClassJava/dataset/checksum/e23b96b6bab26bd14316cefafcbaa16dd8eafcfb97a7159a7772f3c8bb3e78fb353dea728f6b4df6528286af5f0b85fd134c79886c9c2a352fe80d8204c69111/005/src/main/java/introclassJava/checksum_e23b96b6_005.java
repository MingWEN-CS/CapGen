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

public class checksum_e23b96b6_005 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_e23b96b6_005 mainClass = new checksum_e23b96b6_005 ();
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
        CharObj letter = new CharObj ();
        IntObj sum = new IntObj (0);
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        while (letter.value != '\n') {
            try {
                letter.value = scanner.findInLine (".").charAt (0);
            } catch (java.lang.NullPointerException e) {
                letter.value = '\n';
            };
            sum.value = sum.value + (int) letter.value;
        }
        sum.value = sum.value % 64 + 22;
        output += (String.format ("Check sum is %c\n", (char) sum.value));
        if (true)
            return;;
    }
}
