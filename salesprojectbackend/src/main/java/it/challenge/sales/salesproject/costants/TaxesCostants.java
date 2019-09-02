package it.challenge.sales.salesproject.costants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TaxesCostants {

	public static double BASIC_TAX=10;
	public static double IMPORTED_ADDITIONAL_TAX=5;
	private static final Map<Integer, String> PRODUCT_TYPE = createMap();

	private static Map<Integer, String> createMap() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		result.put(0, "BOOK");
		result.put(1, "FOOD");
		result.put(2, "MEDICAL");
		result.put(3, "OTHER");
		return Collections.unmodifiableMap(result);
	}
}
