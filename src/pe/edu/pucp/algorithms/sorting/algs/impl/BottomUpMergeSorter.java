package pe.edu.pucp.algorithms.sorting.algs.impl;

/**
 * Implementation of Bottom-Up Merge Sort algorithm.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public class BottomUpMergeSorter<T extends Comparable<T>> extends
		MergeSorter<T> {

	public BottomUpMergeSorter(Class<T> clazz, T[] data) {
		super(clazz, data);
	}

	@Override
	protected void sortData() {
		for (int subArraySize = 1; subArraySize < getLength(); subArraySize = subArraySize
				+ subArraySize) {
			for (int subArrayIndex = 0; subArrayIndex < getLength()
					- subArraySize; subArrayIndex += subArraySize
					+ subArraySize) {
				int lowerIndex = subArrayIndex;
				int midIndex = subArrayIndex + subArraySize - 1;
				int higherIndex = Math.min(subArrayIndex + subArraySize
						+ subArraySize - 1, getMaxIndex());
				merge(lowerIndex, midIndex, higherIndex);
			}
		}
	}

}
