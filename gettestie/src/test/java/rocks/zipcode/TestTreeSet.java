package rocks.zipcode;

import org.junit.Assert;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeSet() {

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("One");
        stringTreeSet.add("Two");
        stringTreeSet.add("Three");
        stringTreeSet.add("Four");

        Iterator<String> i = stringTreeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        String[] strings = {"Four", "One", "Three", "Two"};
        Assert.assertEquals(strings, stringTreeSet.toArray());

        Assert.assertFalse(stringTreeSet.add("One"));
        Assert.assertEquals(4, stringTreeSet.size());
    }

}
