package com.gpsdev.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		final Map<Integer, Product> idToProduct = new HashMap<>();
		idToProduct.put(1, new Product("a1", 10));
		idToProduct.put(2, new Product("a2", 20));
		idToProduct.put(3, new Product("a2", 30));
		
		final Set<Integer> ids = idToProduct.keySet();
		System.out.println(ids);
		
		final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
		
		final Collection<Product> products = idToProduct.values();
		System.out.println(products);
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		// System.out.println(formula.calculate(100)); // 100.0
		// System.out.println(formula.sqrt(16)); // 4.0

		List<Product> names = new ArrayList<>();
		names.add(new Product("a1", 10));
		names.add(new Product("a2", 44));
		names.add(new Product("a3", 120));
		names.add(new Product("a4", 12)); 
   //  List<String> result=   names.stream().map(Product::getName).collect(toList());
//int total = names.stream().collect(summingInt(Product::getWeight));

		/*
		 * Collections.sort(names, new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product a, Product b) { return
		 * b.getWeight()-a.getWeight(); } });
		 */

		List<Integer> stringCollection = new ArrayList<>();
		stringCollection.add(1);
		stringCollection.add(30);
		stringCollection.add(6);
	
		int x =stringCollection.parallelStream().reduce(0, Integer::sum);
		System.out.println(x);
	}
	
}
