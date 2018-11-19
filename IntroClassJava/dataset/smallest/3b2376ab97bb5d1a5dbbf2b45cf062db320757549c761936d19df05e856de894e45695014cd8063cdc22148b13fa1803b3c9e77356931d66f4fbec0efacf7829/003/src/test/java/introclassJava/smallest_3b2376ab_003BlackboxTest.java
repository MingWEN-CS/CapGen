package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class smallest_3b2376ab_003BlackboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("1 2 3 4");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("4 3 2 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("3 4 2 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("3 2 4 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("1 1 1 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 2 is the smallest";
        mainClass.scanner = new java.util.Scanner ("2 2 2 3");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > -1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 0 0 -1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        smallest_3b2376ab_003 mainClass = new smallest_3b2376ab_003 ();
        String expected =
            "Please enter 4 numbers separated by spaces > -1 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 -1 0 0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
