package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class AAATest {

    private List<String> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
    }

    @After
    public void tearDown() {
        list.clear();
        list = null;
    }

    @Test
    public void testListOperations() {
        int initialSize = list.size();
        list.add("item3");
        int finalSize = list.size();

        assertEquals(2, initialSize);
        assertEquals(3, finalSize);
        assertTrue(list.contains("item3"));
    }
}
