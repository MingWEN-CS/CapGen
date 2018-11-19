package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class smallest_93f87bf2_000WhiteboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 0 0 0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 0 1 2");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 0 1 0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 0 3 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 1 0 0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 1 1 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 1 1 0");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        smallest_93f87bf2_000 mainClass = new smallest_93f87bf2_000 ();
        String expected =
            "Please enter 4 numbers separated by spaces > 0 is the smallest";
        mainClass.scanner = new java.util.Scanner ("0 1 3 1");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
