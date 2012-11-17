package pe.edu.pucp.algorithms.sorting.algs;

/**
 * Base class for Sorting Algorithms. Based on Robert Sedgewick Algorithm book.
 * 
 * @author Carlos Gavidia (c.gavidia@hotmail.com)
 * 
 * @param <T>
 *            Type of the array to be sorted
 */
@SuppressWarnings("unchecked")
public abstract class BaseSorter<T extends Comparable> {

	private static final String FAIL_MESSAGE = "La ejecución del algoritmo no ordenó el set de datos.";
	private static final String SUCCESS_MESSAGE = "El set de Datos se encuentra ordenado.";
	private static final String HORIZONTAL_LINE = "==============================";
	private static final String EXECUTION_FINISHED = "Ejecución finalizada";

	protected Class<T> clazz;
	private T[] data;
	private ArrayChangeListener<T> arrayChangeListener;

	public BaseSorter(Class<T> clazz, T[] data) {
		this.data = data;
		this.clazz = clazz;
	}

	protected abstract void sortData();

	public void sort() {
		sortData();
		System.out.println(EXECUTION_FINISHED);
		System.out.println(HORIZONTAL_LINE);
		if (!isSorted()) {
			throw new RuntimeException(FAIL_MESSAGE);
		}
		System.out.println(SUCCESS_MESSAGE);

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

	protected int getLength() {
		return data.length;
	}

	public T[] getData() {
		return data;
	}

	protected T getData(int index) {
		return data[index];
	}

	protected void setData(int index, T item) {
		data[index] = item;
		arrayChangeListener.arrayChanged(data);
	}

	protected int getMaxIndex() {
		return data.length - 1;
	}

	public void setArrayChangeListener(ArrayChangeListener arrayChangeListener) {
		this.arrayChangeListener = arrayChangeListener;
	}

}
