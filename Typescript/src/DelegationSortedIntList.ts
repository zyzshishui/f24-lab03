/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
import { IntegerList } from './IntegerList.js'
import {SortedIntList} from "./hidden/SortedIntListLibrary";

class DelegationSortedIntList {
  private _totalAdded: number = 0
  private _sortedIntList: SortedIntList = new SortedIntList()

  constructor() {
  }

  add(num: number): boolean {
    this._totalAdded++
    return this._sortedIntList.add(num)
  }

  addAll(list: IntegerList): boolean {
    this._totalAdded += list.size()
    return this._sortedIntList.addAll(list)
  }

  get(index: number): number {
    return this._sortedIntList.get(index);
  }

  remove(num: number): boolean {
    return this._sortedIntList.remove(num);
  }

  removeAll(list: IntegerList): boolean {
    return this._sortedIntList.removeAll(list);
  }

  size(): number {
    return this._sortedIntList.size();
  }

  getTotalAdded(): number {
    return this._totalAdded;
  }
}

export { DelegationSortedIntList }
