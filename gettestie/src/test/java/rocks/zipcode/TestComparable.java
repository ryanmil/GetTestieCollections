package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestComparable {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestComparable() {

        String s1 = "Foo";
        String s2 = "Bar";

        Assert.assertEquals(0, s1.compareTo(s1));

        Assert.assertTrue(s1.compareTo(s2) > 0);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(s1);
        stringArrayList.add(s2);
        stringArrayList.add("Zozo");
        stringArrayList.add("Act");

        String[] expected = {"Act", "Bar", "Foo", "Zozo"};

        Collections.sort(stringArrayList);

        Assert.assertEquals(expected, stringArrayList.toArray());
    }

}
