package pe.edu.pucp.algorithms.sorting.algs;

/**
 * Base class for Sorting Algorithms. Based on Robert Sedgewick Algorithm book.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
public abstract class BaseSorter<T extends Comparable<T>> {

	private T[] data;

	public BaseSorter(T[] data) {
		this.data = data;
	}

	protected abstract void sortData();

	public void sort() {
		sortData();
		if (!isSorted()) {
			throw new RuntimeException("Algoritm is not sorted");
		}
		System.out.println("The input is now sorted");

	}

	protected void exchange(int index, int anotherIndex) {
		T itemAtIndex = data[index];
		setData(index, data[anotherIndex]);
		setData(anotherIndex, itemAtIndex);
	}

	protected boolean isSorted() {
		for (int i = 1; i < data.length; i++) {
			if (data[i].compareTo(data[i - 1]) < 0) {
				return false;
			}
		}
		return true;
	}

	// TODO (cgavidia): Demo implementation
	public void show() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	protected int getLength() {
		return data.length;
	}

	protected T[] getData() {
		return data;
	}

	protected T getData(int index) {
		return data[index];
	}

	protected void setData(int index, T item) {
		data[index] = item;
	}
	
	protected int getMaxIndex() {
		return data.length -1;
	}

}
