package com.xworkz.obj;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.obj.list.ShoppingCartDTO;

public class ShoppingCartTester {

	public static void main(String[] args) {
		ShoppingCartDTO cartDTO1=new ShoppingCartDTO();
		cartDTO1.setItemName("bags");
		cartDTO1.setQuantity(2);
		cartDTO1.setPrice(3000);
		
		ShoppingCartDTO cartDTO2=new ShoppingCartDTO();
		cartDTO2.setItemName("Mobile");
		cartDTO2.setQuantity(1);
		cartDTO2.setPrice(20000);
		
		Collection<ShoppingCartDTO> cartDTOs=new ArrayList<ShoppingCartDTO>();
		cartDTOs.add(cartDTO1);
		cartDTOs.add(cartDTO2);
		
		ShoppingCartDTO cartDTO3=new ShoppingCartDTO();
		cartDTO3.setItemName("bag");
		cartDTO3.setQuantity(3);
		cartDTO3.setPrice(2000);
		
		boolean contains=cartDTOs.contains(cartDTO3);
		System.out.println("contains"+contains);
		
		if(contains)
		{
			System.out.println("bag is in cart");
			
			}
		else {
			System.out.println("adding bag to cart");
			cartDTOs.add(cartDTO3);
		}
		
		
		System.out.println("after adding bag"+cartDTOs.size());		
		
		
		

	}

}
