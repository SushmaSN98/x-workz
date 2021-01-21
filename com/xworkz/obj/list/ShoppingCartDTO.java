package com.xworkz.obj.list;

public class ShoppingCartDTO {
	
	private String itemName;
	private int quantity;
	private double price;
	
	public ShoppingCartDTO() {
	}
	
   public String getItemName() {
		return itemName;
	}

   public void setItemName(String itemName) {
		this.itemName = itemName;
	}

   public int getQuantity() {
		return quantity;
	}

  public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

  public double getPrice() {
		return price;
	}

   public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals on shopping cart dto");
		if (obj == null) {
			return false;
	}
	if(obj instanceof ShoppingCartDTO) {
		ShoppingCartDTO casted=(ShoppingCartDTO)obj;
		if(this.itemName.equals(casted.itemName)&&this.price==casted.price) {
			System.out.println("item is matching");
			return true;
		}
		
		}
	return false;

	}
}
