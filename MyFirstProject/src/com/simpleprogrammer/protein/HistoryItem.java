package com.simpleprogrammer.protein;

public class HistoryItem {
	private int amount;
	private int id;
	private int total;
	private String operation;

	public HistoryItem(int id, int amount, String operation, int total) {
		this.id = id;
		this.amount = amount;
		this.operation = operation;
		this.total = total;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
