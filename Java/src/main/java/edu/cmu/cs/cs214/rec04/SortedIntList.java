package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AbstractIntList -- a list of integers.
 *
 * @author Nora Shoemaker
 *
 */
public abstract class SortedIntList extends AbstractIntList {
    private List<Integer> list;
    public SortedIntList() {
        this.list = new ArrayList<>();
    }

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        int insertIndex = Collections.binarySearch(list, num);
        if (insertIndex < 0) {
            insertIndex = -insertIndex - 1;
        }
        try {
            list.add(insertIndex, (Integer) num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return list.get(index);
    }

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present (optional operation).
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    @Override
    public boolean remove(int num) {
        return list.remove((Integer) num);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from
     *             the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean removeAll(IntegerList list) {
        boolean e = false;
        for (int i = 0; i < list.size(); i++) {
            e |= list.remove((Integer) list.get(i));
        }
        return e;
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in the list
     */
    @Override
    public int size() {
        return list.size();
    }
}
