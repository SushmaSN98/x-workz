package com.xworkz.obj;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.obj.list.AlcoholDTO;

public class AlcoholDTOTester {

	public static void main(String[] args) {
		AlcoholDTO alcoholDTO1=new AlcoholDTO();
		alcoholDTO1.setName("IB");
		alcoholDTO1.setBrandName("Imperial");
		alcoholDTO1.setSpiritQuantity(48);
		
		AlcoholDTO alcoholDTO2=new AlcoholDTO();
		alcoholDTO2.setName("Amstel");
		alcoholDTO2.setBrandName("King Fister");
		alcoholDTO2.setSpiritQuantity(4);
	
		AlcoholDTO alcoholDTO3=new AlcoholDTO();
		alcoholDTO3.setName("Magic Moments");
		alcoholDTO3.setBrandName("NA");
		alcoholDTO3.setSpiritQuantity(38);
		
		List<AlcoholDTO> alcoholDTOs=new ArrayList<AlcoholDTO>();
		alcoholDTOs.add(alcoholDTO3);
		alcoholDTOs.add(1,alcoholDTO2);
		alcoholDTOs.add(alcoholDTO1);
		
		alcoholDTOs.remove(alcoholDTO1);
		
		
		int index=alcoholDTOs.indexOf(alcoholDTO3);
		System.out.println("indexOf"+index);
		
		

     for(AlcoholDTO alcoholDTO:alcoholDTOs) {
     System.out.println(alcoholDTO);
}
}
}
