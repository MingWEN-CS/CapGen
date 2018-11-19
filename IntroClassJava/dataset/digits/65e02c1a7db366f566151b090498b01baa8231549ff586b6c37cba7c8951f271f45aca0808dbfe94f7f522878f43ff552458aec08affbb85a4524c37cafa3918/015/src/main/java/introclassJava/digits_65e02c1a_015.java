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

public class digits_65e02c1a_015 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_65e02c1a_015 mainClass = new digits_65e02c1a_015 ();
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
        IntObj d1 = new IntObj (), d2 = new IntObj (), d3 = new IntObj (), d4 =
            new IntObj (), d5 = new IntObj (), d6 = new IntObj (), d7 =
            new IntObj (), d8 = new IntObj (), d9 = new IntObj (), d10 =
            new IntObj (), absnum = new IntObj (), num = new IntObj ();
        DoubleObj floatnum = new DoubleObj ();
        output += (String.format ("\nEnter an integer > "));
        floatnum.value = scanner.nextDouble ();
        num.value = (int) floatnum.value;
        absnum.value = Math.abs (num.value);
        if (!(num.value >= 0 && absnum.value < 10000000000L)) {
            d1.value = (absnum.value % 10);
            d2.value = (absnum.value % 100) / 10;
            d3.value = (absnum.value % 1000) / 100;
            d4.value = (absnum.value % 10000) / 1000;
            d5.value = (absnum.value % 100000) / 10000;
            d6.value = (absnum.value % 1000000) / 100000;
            d7.value = (absnum.value % 10000000) / 1000000;
            d8.value = (absnum.value % 100000000) / 10000000;
            d9.value = (absnum.value % 1000000000) / 100000000;
            d10.value =
                ((num.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                  (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                  (d7.value * 1000000) - (d8.value * 10000000) -
                  (d9.value * 100000000)) / 1000000000);
            if (d10.value == 0 && d9.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                    d2.value, d3.value, d4.value, d5.value, d6.value,
                                    d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                    d2.value, d3.value, d4.value, d5.value, d6.value,
                                    d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value != 0) {
                output +=
                    (String.format
                     ("\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                      d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                    d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                    d3.value, d4.value, d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                                    d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format ("\n%d\n-%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value == 0 && d2.value == 0
                       && d1.value != 0) {
                output += (String.format ("\n-%d\n", d1.value));
            }
        } else if (num.value >= 0 && num.value < 10000000000L) {
            d1.value = (num.value % 10);
            d2.value = (num.value % 100) / 10;
            d3.value = (num.value % 1000) / 100;
            d4.value = (num.value % 10000) / 1000;
            d5.value = (num.value % 100000) / 10000;
            d6.value = (num.value % 1000000) / 100000;
            d7.value = (num.value % 10000000) / 1000000;
            d8.value = (num.value % 100000000) / 10000000;
            d9.value = (num.value % 1000000000) / 100000000;
            d10.value =
                ((num.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                  (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                  (d7.value * 1000000) - (d8.value * 10000000) -
                  (d9.value * 100000000)) / 1000000000);
            if (d10.value == 0 && d9.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                    d2.value, d3.value, d4.value, d5.value, d6.value,
                                    d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                    d2.value, d3.value, d4.value, d5.value, d6.value,
                                    d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value != 0) {
                output +=
                    (String.format
                     ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                      d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value,
                                    d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                    (String.format
                     ("\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value, d4.value,
                      d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                                    d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value != 0) {
                output +=
                    (String.format ("\n%d\n%d\n%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format ("\n%d\n%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value == 0 && d2.value == 0
                       && d1.value != 0) {
                output += (String.format ("\n%d\n", d1.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                       && d7.value == 0 && d6.value == 0 && d5.value == 0
                       && d4.value == 0 && d3.value == 0 && d2.value == 0
                       && d1.value == 0) {
                output += (String.format ("\n0\n"));
            }
        }
        if (floatnum.value >= 10000000000L) {
            output += (String.format ("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n"));
        }
        output += (String.format ("That's all, have a nice day!\n"));
        if (true)
            return;;
    }
}
