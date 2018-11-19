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

public class checksum_08c7ea4a_011 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
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
        char[] string = new char[1000000];
        CharObj checksumchar = new CharObj ();
        IntObj i = new IntObj (), stringlength =
            new IntObj (), checksum_summation = new IntObj ();
        output +=
            (String.format
             ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next ().toCharArray ();
        stringlength.value = string.length;
        checksum_summation.value = 0;
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            checksum_summation.value += (int) string[i.value];
        }
        checksum_summation.value %= 64;
        checksum_summation.value += 32;
        checksumchar.value = (char) checksum_summation.value;
        output += (String.format ("Check sum is %c\n", checksumchar.value));
        if (true)
            return;;
    }
}
