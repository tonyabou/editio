package com.gpsdev.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

	private final List<Product> products = new ArrayList<>();
	
	public void add(Product product) {
	     products.add(product);	
	}
	
	public void replace(Product oldProduct, Product newProduct) {
		final int index = products.indexOf(oldProduct);
		if(index!=-1) {
			products.set(index, newProduct);
		}
		
	}
	
	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return products.iterator();
	}

}
