package test;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase {
    protected double fvalue1;
    protected double fvalue2;

    @Before
    public void setUp() {
        fvalue1 = 2;
        fvalue2 = 3;
    }

    @Test
    //questo è il primo e unico testcase in questo caso
    public void testAdd() {
        //count the number of the test case
        System.out.println("No of test case = "+this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test case name = "+name);

        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated test case name = "+newName);

    }

    //teardown used to close the connection or clean up activities
    public void tearDown() {}
}