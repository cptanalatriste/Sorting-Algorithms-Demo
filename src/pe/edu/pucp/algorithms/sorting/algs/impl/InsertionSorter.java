package pe.edu.pucp.algorithms.sorting.algs.impl;

import pe.edu.pucp.algorithms.sorting.algs.BaseSorter;

/**
 * Implementation of Insertion Sort algorithm.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public class InsertionSorter<T extends Comparable<T>> extends BaseSorter<T> {

	public InsertionSorter(Class<T> clazz, T[] data) {
		super(clazz, data);
	}

	@Override
	protected void sortData() {
		for (int currentIndex = 0; currentIndex < getLength(); currentIndex++) {
			T currentItem = getData(currentIndex);
			int auxIndex = currentIndex;
			while (auxIndex > 0
					&& getData(auxIndex - 1).compareTo(currentItem) >= 0) {
				setData(auxIndex, getData(auxIndex - 1));
				--auxIndex;
			}
			setData(auxIndex, currentItem);
		}
	}

}
