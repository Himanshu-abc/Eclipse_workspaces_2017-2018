package com.app.bean;

import java.util.List;

public class Restaurant {
	
	private List<String> waitersList;

	public void setWaitersList(List<String> waitersList) {
		this.waitersList = waitersList;
	}
	
	public void displayWaiterList() {
		
		System.out.println("Restaurant Waiter List : + " +waitersList);
	}
}
