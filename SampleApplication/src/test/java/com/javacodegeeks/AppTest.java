package com.javacodegeeks;

import org.junit.Test;
import junit.framework.Assert;

/**
* Unit test for simple App.
*/

public class AppTest {
   @Test
   public void testApp() {
      App appObject = new App();
      Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
   }
}
