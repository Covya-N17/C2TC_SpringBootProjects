package com.tnsif.springq;

import org.springframework.stereotype.Component;

@Component
public class Food implements ShoppingMall{
 
	 public void purchase()
	 {
		 System.out.println("I m going to ording the food ...");
	 }
}
