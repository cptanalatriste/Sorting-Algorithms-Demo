package pe.edu.pucp.algorithms.sorting.algs;

@SuppressWarnings("unchecked")
public interface ArrayChangeListener<T extends Comparable> {

	public void arrayChanged(T[] dataArray);
}
