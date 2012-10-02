package pe.edu.pucp.algorithms.sorting.algs;

import pe.edu.pucp.algorithms.sorting.algs.impl.BubbleSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.InsertionSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.QuickSorter;

/**
 * Factory for algorithm implementations.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 */
public class SorterFactory {

	public static <T extends Comparable<T>> BaseSorter<T> getSorter(T[] data,
			SortingAlgorithm algorithm) {
		BaseSorter<T> sorter = null;

		switch (algorithm) {
		case INSERTION:
			sorter = new InsertionSorter<T>(data);
			break;
		case BUBBLE:
			sorter = new BubbleSorter<T>(data);
			break;
		case QUICK:
			sorter = new QuickSorter<T>(data);
		}
		return sorter;

	}

}
