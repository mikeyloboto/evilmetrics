package com.evilbas.metrics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class BaseTest {
    @Test
    public void test() {
        assertEquals(MetricsConfig.test(), "Success");
    }

}
