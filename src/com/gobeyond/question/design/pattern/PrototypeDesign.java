package com.gobeyond.question.design.pattern;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable {

	private List<String> vehicleList;

	public Vehicle() {
		this.vehicleList = new ArrayList<>();
	}

	public Vehicle(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void insertData() {
		vehicleList.add("CAR1");
		vehicleList.add("CAR2");
		vehicleList.add("CAR3");
		vehicleList.add("CAR4");
		vehicleList.add("CAR5");
		vehicleList.add("CAR6");

	}

	public List<String> getVehicleList() {
		return vehicleList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		List<String> tempVehicleList = new ArrayList<>();

		for (String lst : this.getVehicleList()) {

			tempVehicleList.add(lst);

		}

		return new Vehicle(tempVehicleList);

	}

}

public class PrototypeDesign {
	
	
	public static void main(String a[]) throws CloneNotSupportedException {
		
		Vehicle v = new Vehicle();
		
		v.insertData();
		
		Vehicle c = (Vehicle) v.clone();
		
		System.out.println("Before Clone ::"+v);
		
		System.out.println("After Clone ::"+c	);
		
		
	}

}
