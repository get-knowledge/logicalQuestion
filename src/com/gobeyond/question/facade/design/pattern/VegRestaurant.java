package com.gobeyond.question.facade.design.pattern; 

public class VegRestaurant implements Hotel 
{ 
	public Menus getMenus() 
	{ 
		VegMenu v = new VegMenu(); 
		return v; 
	} 
} 
