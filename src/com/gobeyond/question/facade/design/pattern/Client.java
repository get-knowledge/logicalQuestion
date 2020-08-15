package com.gobeyond.question.facade.design.pattern; 

public class Client 
{ 
	public static void main (String[] args) 
	{ 
		HotelKeeper keeper = new HotelKeeper(); 
		
		VegMenu v = keeper.getVegMenu(); 
		NonVegMenu nv = keeper.getNonVegMenu(); 
		Both = keeper.getVegNonMenu(); 

	} 
} 
