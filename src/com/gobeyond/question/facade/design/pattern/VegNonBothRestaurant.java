package com.gobeyond.question.facade.design.pattern; 

public class VegNonBothRestaurant implements Hotel 
{ 
	public Menus getMenus() 
	{ 
		Both b = new Both(); 
		return b; 
	} 
} 
