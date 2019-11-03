package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayList() {

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("One");
        strArrayList.add("Two");
        strArrayList.add("Three");
        strArrayList.add("Four");

        Iterator<String> i = strArrayList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertTrue(strArrayList.add("One"));

        Collections.sort(strArrayList);

        String[] expected = { "Four", "One", "One", "Three", "Two" };

        Assert.assertEquals(expected, strArrayList.toArray());
    }
}
