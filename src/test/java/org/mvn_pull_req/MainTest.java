package org.mvn_pull_req;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testSecti()
    {
        int sum = Main.sectiCisla(1,1);
        Assertions.assertEquals(2,sum);
    }
}