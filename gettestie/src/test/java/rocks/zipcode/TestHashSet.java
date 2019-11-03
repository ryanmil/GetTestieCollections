package rocks.zipcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Assert;

public class TestHashSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSet() {

        HashSet<String> strHashSet = new HashSet<>();
        strHashSet.add("One");
        strHashSet.add("Two");
        strHashSet.add("Three");
        strHashSet.add("Four");

        Iterator<String> i = strHashSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertTrue(strHashSet.containsAll(Arrays.asList("One", "Two", "Three", "Four")));

        strHashSet.remove("One");

        Assert.assertFalse(strHashSet.containsAll(Arrays.asList("One", "Two", "Three", "Four")));

        Assert.assertFalse(strHashSet.add("Two"));

    }

}
