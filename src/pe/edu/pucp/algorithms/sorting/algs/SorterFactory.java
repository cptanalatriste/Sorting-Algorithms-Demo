package pe.edu.pucp.algorithms.sorting.algs;

import pe.edu.pucp.algorithms.sorting.algs.impl.BottomUpMergeSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.BubbleSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.CombSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.InsertionSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.QuickSorter;
import pe.edu.pucp.algorithms.sorting.algs.impl.TopDownMergeSorter;

/**
 * Factory for algorithm implementations.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 */
public class SorterFactory {

	public static <T extends Comparable<T>> BaseSorter<T> getSorter(
			Class<T> clazz, T[] data, SortingAlgorithm algorithm) {
		BaseSorter<T> sorter = null;

		switch (algorithm) {
		case INSERTION:
			sorter = new InsertionSorter<T>(clazz, data);
			break;
		case BUBBLE:
			sorter = new BubbleSorter<T>(clazz, data);
			break;
		case QUICK:
			sorter = new QuickSorter<T>(clazz, data);
			break;
		case TOPDOWN_MERGE:
			sorter = new TopDownMergeSorter<T>(clazz, data);
			break;
		case BOTTOMUP_MERGE:
			sorter = new BottomUpMergeSorter<T>(clazz, data);
			break;
		case COMB:
			sorter = new CombSorter<T>(clazz, data);
			break;
		}
		return sorter;
	}
}
