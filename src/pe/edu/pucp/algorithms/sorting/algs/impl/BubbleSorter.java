package pe.edu.pucp.algorithms.sorting.algs.impl;

import pe.edu.pucp.algorithms.sorting.algs.BaseSorter;

/**
 * Implementation of Bubble Sort algorithm.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public class BubbleSorter<T extends Comparable<T>> extends BaseSorter<T> {

	public BubbleSorter(T[] data) {
		super(data);
	}

	@Override
	protected void sortData() {
		for (int lastIndexToCompare = getLength() - 1; lastIndexToCompare > 1; lastIndexToCompare--) {
			for (int currentIndex = 0; currentIndex < lastIndexToCompare; currentIndex++) {
				if (getData(currentIndex).compareTo(getData(currentIndex + 1)) > 0) {
					exchange(currentIndex, currentIndex + 1);
				}
			}

		}
	}

}
