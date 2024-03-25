package org.aqa.aston;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    @Test
    public void posTest() {
        Method method = new Method();
        Assertions.assertEquals(method.factorial(5), 120);
    }
}
