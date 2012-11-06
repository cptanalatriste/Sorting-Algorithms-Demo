package pe.edu.pucp.algorithms.sorting.graph;

import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesDataItem;

public class CustomTimeSeriesDataItem extends TimeSeriesDataItem {

	private static final long serialVersionUID = -3099867917159200883L;

	public CustomTimeSeriesDataItem(RegularTimePeriod period, double value) {
		super(period, value);
	}

	public int compareTo(Object o1) {
		int result = 1;

		if (o1 instanceof CustomTimeSeriesDataItem) {
			CustomTimeSeriesDataItem datapair = (CustomTimeSeriesDataItem) o1;
			if (getValue().longValue() > datapair.getValue().longValue()) {
				result = 1;
			} else if (getValue().longValue() < datapair.getValue().longValue()) {
				result = -1;
			} else {
				result = 0;
			}
		}
		return result;
	}
}
