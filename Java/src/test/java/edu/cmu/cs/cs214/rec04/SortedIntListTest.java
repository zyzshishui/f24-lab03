package edu.cmu.cs.cs214.rec04;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortedIntListTest {

    private SortedIntList sortedList;

    @Before
    public void setUp() {
        sortedList = new SortedIntList() {};
    }

    @Test
    public void testAdd() {
        assertTrue(sortedList.add(5));
        assertTrue(sortedList.add(3));
        assertTrue(sortedList.add(8));

        assertEquals(3, sortedList.get(0));
        assertEquals(5, sortedList.get(1));
        assertEquals(8, sortedList.get(2));
    }

    @Test
    public void testGet() {
        sortedList.add(2);
        sortedList.add(10);
        sortedList.add(7);

        assertEquals(2, sortedList.get(0));
        assertEquals(7, sortedList.get(1));
        assertEquals(10, sortedList.get(2));
    }

    @Test
    public void testRemove() {
        sortedList.add(10);
        sortedList.add(3);
        sortedList.add(7);

        assertTrue(sortedList.remove(7));
        assertFalse(sortedList.remove(7)); // 7 已经被移除了

        assertEquals(2, sortedList.size());
        assertEquals(3, sortedList.get(0));
        assertEquals(10, sortedList.get(1));
    }

    @Test
    public void testRemoveAll() {
        sortedList.add(3);
        sortedList.add(7);
        sortedList.add(5);

        sortedList.removeAll(sortedList);

        assertEquals(1, sortedList.size());
        assertEquals(5, sortedList.get(0));
    }

    @Test
    public void testSize() {
        assertEquals(0, sortedList.size());

        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);

        assertEquals(3, sortedList.size());
    }
}
