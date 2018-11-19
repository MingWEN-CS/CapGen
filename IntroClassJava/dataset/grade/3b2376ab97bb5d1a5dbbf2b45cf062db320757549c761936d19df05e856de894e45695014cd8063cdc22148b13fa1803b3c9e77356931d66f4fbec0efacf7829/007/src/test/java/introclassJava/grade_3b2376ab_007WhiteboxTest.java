package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class grade_3b2376ab_007WhiteboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an A grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 95");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an A grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 90");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an B grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 85");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an B grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 80");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an C grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 75");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an C grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 70");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an D grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 65");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has an D grade";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 60");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test9 () throws Exception {
        grade_3b2376ab_007 mainClass = new grade_3b2376ab_007 ();
        String expected =
            "Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. Now enter student score (percent) >Student has failed the course";
        mainClass.scanner = new java.util.Scanner ("90 80 70 60 55");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
