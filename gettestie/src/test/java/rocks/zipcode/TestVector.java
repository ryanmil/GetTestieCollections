package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class TestVector {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestHashSet() {

        Vector<String> strHashSet = new Vector<>();
        strHashSet.add("One");
        strHashSet.add("Two");
        strHashSet.add("Three");
        strHashSet.add("Four");

        Iterator<String> i = strHashSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertTrue(strHashSet.add("One"));

        Collections.sort(strHashSet);

        String[] expected = { "Four", "One", "One", "Three", "Two" };

        Assert.assertEquals(expected, strHashSet.toArray());

    }

}
