package pe.edu.pucp.algorithms.sorting.algs.impl;

/**
 * Implementation of Top-Down Merge Sort algorithm.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public class TopDownMergeSorter<T extends Comparable<T>> extends MergeSorter<T> {

	public TopDownMergeSorter(Class<T> clazz, T[] data) {
		super(clazz, data);
	}

	@Override
	public void sortData() {
		sortData(0, getLength() - 1);
	}

	private void sortData(int lowerIndex, int higherIndex) {
		if (higherIndex <= lowerIndex) {
			return;
		}
		int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
		sortData(lowerIndex, midIndex);
		sortData(midIndex + 1, higherIndex);
		merge(lowerIndex, midIndex, higherIndex);
	}

}
