package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Keeps track of the number of times elements are attempted to be added
    private int totalAdded;

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        this.totalAdded++;
        return super.add(num);
    }
    /**
     * Returns the total number of attempted element insertions.
     *
     * This method returns the number of times elements have been attempted to be
     * added to the list, including duplicate insertions.
     *
     * @return the total number of attempted insertions
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }
}