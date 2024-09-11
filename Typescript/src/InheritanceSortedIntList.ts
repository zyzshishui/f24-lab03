import { SortedIntList } from './hidden/SortedIntListLibrary.js'

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

class InheritanceSortedIntList extends SortedIntList{

  private _totalAdded: number = 0

  constructor() {
    super();
  }

  add(num: number): boolean {
    this._totalAdded++
    return super.add(num);
  }

  getTotalAdded(): number {
    return this._totalAdded;
  }
}

export { InheritanceSortedIntList }
