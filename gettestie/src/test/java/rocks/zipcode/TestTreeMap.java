package rocks.zipcode;

import org.junit.Assert;

import java.util.Iterator;
import java.util.TreeMap;

public class TestTreeMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMap() {

        TreeMap<String, Integer> strTreeMap = new TreeMap<>();

        strTreeMap.put("A", 50);
        strTreeMap.put("C", 32);
        strTreeMap.put("B", 90);
        strTreeMap.put("A", 1024);

        Assert.assertEquals(1024, strTreeMap.get("A").intValue());

        Integer[] integers = {1024, 90, 32};
        Assert.assertEquals(integers, strTreeMap.values().toArray());

        String[] strings = {"A", "B", "C"};
        Assert.assertEquals(strings, strTreeMap.keySet().toArray());
    }

}
