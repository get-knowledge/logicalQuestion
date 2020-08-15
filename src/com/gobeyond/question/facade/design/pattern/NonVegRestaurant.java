package com.gobeyond.question.facade.design.pattern; 

public class NonVegRestaurant implements Hotel 
{ 
	public Menus getMenus() 
	{ 
		NonVegMenu nv = new NonVegMenu(); 
		return nv; 
	} 
} 
