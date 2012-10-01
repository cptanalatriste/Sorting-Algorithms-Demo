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

	public InsertionSorter(T[] data) {
		super(data);
	}

	@Override
	protected void sortData() {
		for (int currentIndex = 1; currentIndex < getLength(); currentIndex++) {
			for (int auxIndex = currentIndex; auxIndex > 0
					&& getData(auxIndex).compareTo(getData(auxIndex - 1)) < 0; auxIndex--) {
				exchange(auxIndex, auxIndex - 1);
			}
		}
	}

}
