package com.xworkz.obj.list;

public class AlcoholDTO {
	private String name;
	private String brandName;
	private int spiritQuantity;
	
	public AlcoholDTO() {
	}

	public AlcoholDTO(String name, String brandName, int spiritQuantity) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritQuantity = spiritQuantity;
	}

	

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals on alcohol dto");
	if (obj == null) {
			return false;
		}
	if(obj instanceof AlcoholDTO) {
		AlcoholDTO casted=(AlcoholDTO)obj;
		if(this.name.equals(casted.name)) {
			System.out.println("same name"+this.name);
			return true;
		}
		
		
	}
	return false;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spiritQuantity=" + spiritQuantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSpiritQuantity() {
		return spiritQuantity;
	}

	public void setSpiritQuantity(int spiritQuantity) {
		this.spiritQuantity = spiritQuantity;
	}
}
		
		


