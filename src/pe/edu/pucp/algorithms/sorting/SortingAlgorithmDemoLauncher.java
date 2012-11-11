package pe.edu.pucp.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

import org.jfree.data.time.Year;
import org.jfree.ui.RefineryUtilities;

import pe.edu.pucp.algorithms.sorting.algs.BaseSorter;
import pe.edu.pucp.algorithms.sorting.algs.SorterFactory;
import pe.edu.pucp.algorithms.sorting.algs.SortingAlgorithm;
import pe.edu.pucp.algorithms.sorting.graph.AlgorithmAnimationFrame;
import pe.edu.pucp.algorithms.sorting.graph.CustomTimeSeriesDataItem;

public class SortingAlgorithmDemoLauncher {

	private static final String TITLE = "Algoritmos de Ordenamiento";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CustomTimeSeriesDataItem[] dataToSort = getDataToSort();
		AlgorithmAnimationFrame sortingAlgorithmDemo = new AlgorithmAnimationFrame(
				TITLE, dataToSort);
		sortingAlgorithmDemo.pack();
		RefineryUtilities.centerFrameOnScreen(sortingAlgorithmDemo);
		sortingAlgorithmDemo.setVisible(true);
		BaseSorter<CustomTimeSeriesDataItem> sorter = SorterFactory.getSorter(
				CustomTimeSeriesDataItem.class, dataToSort,
				SortingAlgorithm.COMB);
		sorter.setArrayChangeListener(sortingAlgorithmDemo);
		sorter.sort();
	}

	private static CustomTimeSeriesDataItem[] getDataToSort() {
		List<CustomTimeSeriesDataItem> dataToSort = new ArrayList<CustomTimeSeriesDataItem>();
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(1), new Integer(6)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(2), new Integer(1)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(3), new Integer(4)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(4), new Integer(2)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(5), new Integer(8)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(6), new Integer(1)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(7), new Integer(2)));
		dataToSort
				.add(new CustomTimeSeriesDataItem(new Year(8), new Integer(5)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(9),
				new Integer(21)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(10), new Integer(
				18)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(11), new Integer(
				18)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(12), new Integer(
				25)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(13), new Integer(
				11)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(14), new Integer(
				16)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(15), new Integer(
				23)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(16), new Integer(
				14)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(17), new Integer(
				31)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(18), new Integer(
				38)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(19), new Integer(
				31)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(20), new Integer(
				56)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(21), new Integer(
				45)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(22), new Integer(
				74)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(23), new Integer(
				68)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(24), new Integer(
				98)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(25), new Integer(
				85)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(26), new Integer(
				66)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(27), new Integer(
				71)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(28), new Integer(
				65)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(29), new Integer(
				59)));
		dataToSort.add(new CustomTimeSeriesDataItem(new Year(30), new Integer(
				60)));
		return dataToSort.toArray(new CustomTimeSeriesDataItem[dataToSort
				.size()]);
	}
}
