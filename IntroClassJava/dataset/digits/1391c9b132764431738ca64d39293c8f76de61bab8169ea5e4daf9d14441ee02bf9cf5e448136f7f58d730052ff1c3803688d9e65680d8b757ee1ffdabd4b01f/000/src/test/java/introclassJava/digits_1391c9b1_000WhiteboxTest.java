package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_1391c9b1_000WhiteboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected = "Enter an integer >  0 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test10 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  2 6 6 8 6 5 5 0 0 1 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("1005568662");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected = "Enter an integer >  9 1 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("19");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  0 9 6 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("690");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  0 2 5 3 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("3520");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  8 6 7 2 3 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("32768");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  0 0 0 2 1 5 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("512000");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  1 5 0 6 2 5 1 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("1526051");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  1 3 6 0 6 9 0 4 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("40960631");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test9 () throws Exception {
        digits_1391c9b1_000 mainClass = new digits_1391c9b1_000 ();
        String expected =
            "Enter an integer >  0 2 5 9 7 6 0 4 1 That's all, have a nice day!";
        mainClass.scanner = new java.util.Scanner ("140679520");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
