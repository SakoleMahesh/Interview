package junittest;

import org.junit.Test;

import junit.framework.Assert;

public class Junitt {
    @SuppressWarnings("deprecation")
	@Test
    public void testAssertions() {
        int a = 10;
        int b = 10;
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = null;

        Assert.assertEquals(9, a);
        Assert.assertEquals(5, b);
        Assert.assertTrue(a == b);
        Assert.assertFalse(a == 5);
        Assert.assertNull(str3);
        Assert.assertNotNull(str1);
        Assert.assertEquals(expectedArray, actualArray);
        Assert.assertSame(str1, str2);
        Assert.assertNotSame(str1, new String("Hello"));
    }
}
