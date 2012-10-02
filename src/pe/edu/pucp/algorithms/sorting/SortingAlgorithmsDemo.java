package pe.edu.pucp.algorithms.sorting;

import pe.edu.pucp.algorithms.sorting.algs.BaseSorter;
import pe.edu.pucp.algorithms.sorting.algs.SorterFactory;
import pe.edu.pucp.algorithms.sorting.algs.SortingAlgorithm;

/**
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 */
public class SortingAlgorithmsDemo {

	public static void main(String[] args) {
		String[] dataToSort = { "S", "O", "R", "T", "E", "X", "A", "M", "P",
				"L", "E" };
		BaseSorter<String> sorter = SorterFactory.getSorter(dataToSort,
				SortingAlgorithm.QUICK);
		System.out.println("Before sorting ...");
		sorter.show();

		System.out.println("After sorting ...");
		sorter.sort();
		sorter.show();
	}

}
