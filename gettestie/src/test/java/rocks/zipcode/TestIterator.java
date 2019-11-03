package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIterator() {

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("One");
        strArrayList.add("Two");
        strArrayList.add("Three");
        strArrayList.add("Four");

        Iterator<String> i = strArrayList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertFalse(i.hasNext());
    }

}