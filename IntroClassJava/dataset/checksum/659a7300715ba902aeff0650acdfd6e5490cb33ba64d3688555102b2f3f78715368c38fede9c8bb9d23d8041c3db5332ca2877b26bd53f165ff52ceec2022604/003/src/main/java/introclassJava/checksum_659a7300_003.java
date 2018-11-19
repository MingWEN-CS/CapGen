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

public class checksum_659a7300_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_659a7300_003 mainClass = new checksum_659a7300_003 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int length = 1000000;
    public void exec () throws Exception {
        char[] string = new char[length];
        IntObj count = new IntObj (), i = new IntObj ();
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next ().toCharArray ();
        count.value = 0;
        for (i.value = 0; i.value != string.length; ++i.value) {
            count.value += (int) string[i.value];
        }
        count.value = count.value % 64 + ' ';
        output += (String.format ("Check sum is %c\n", count.value));
        if (true)
            return;;
    }
}
