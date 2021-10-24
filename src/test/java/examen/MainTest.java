package examen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void Test01(){

    }

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void testStress(){

    }
}
