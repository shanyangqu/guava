package uk.org.holychina.guava.collection;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * a special kind of map which maintains an inverse view of the map while
 * ensuring that no duplicate values are present in the map and a value can be
 * used safely to get the key back.
 * 
 * @author jl14904
 *
 */
public class BiMapTester {

	public static void main(String args[]) {

		BiMap<Integer, String> empIDNameMap = HashBiMap.create();

		empIDNameMap.put(new Integer(101), "Mahesh");
		empIDNameMap.put(new Integer(102), "Sohan");
		empIDNameMap.put(new Integer(103), "Ramesh");

		// Emp Id of Employee "Mahesh"
		System.out.println(empIDNameMap.get(101));
		System.out.println(empIDNameMap.inverse().get("Mahesh"));
	}
}