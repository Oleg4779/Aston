package org.aqa.aston;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;

public class AppTest {

    @Test
    public void test1() {
        assertEquals(Method.factorial(5), 120);
    }
}
