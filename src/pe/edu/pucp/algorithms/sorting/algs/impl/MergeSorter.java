package pe.edu.pucp.algorithms.sorting.algs.impl;

import java.lang.reflect.Array;

import pe.edu.pucp.algorithms.sorting.algs.BaseSorter;

/**
 * Base Class for Merge Sort algorithms.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public abstract class MergeSorter<T extends Comparable<T>> extends
		BaseSorter<T> {

	public MergeSorter(Class<T> clazz, T[] data) {
		super(clazz, data);

	}

	@Override
	protected abstract void sortData();

	@SuppressWarnings("unchecked")
	protected void merge(int lowerIndex, int midIndex, int higherIndex) {

		int leftArrayMarker = lowerIndex;
		int rightArrayMarker = midIndex + 1;

		int auxArraySize = higherIndex + 1;
		T[] auxiliarArray = (T[]) Array.newInstance(clazz, auxArraySize);
		for (int i = lowerIndex; i <= higherIndex; i++) {
			auxiliarArray[i] = getData(i);
		}
		for (int j = lowerIndex; j <= higherIndex; j++) {
			T itemFromLeftArray = null;
			if (leftArrayMarker < auxArraySize) {
				itemFromLeftArray = auxiliarArray[leftArrayMarker];
			}
			T itemFromRightArray = null;
			if (rightArrayMarker < auxArraySize) {
				itemFromRightArray = auxiliarArray[rightArrayMarker];
			}
			if (leftArrayMarker > midIndex) {
				setData(j, itemFromRightArray);
				rightArrayMarker++;
			} else if (rightArrayMarker > higherIndex) {
				setData(j, itemFromLeftArray);
				leftArrayMarker++;
			} else if (itemFromRightArray != null
					&& itemFromRightArray.compareTo(itemFromLeftArray) < 0) {
				setData(j, itemFromRightArray);
				rightArrayMarker++;
			} else {
				setData(j, itemFromLeftArray);
				leftArrayMarker++;
			}
		}
	}
}
