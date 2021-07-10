package com.myproyect.spring.mysneakers.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myproyect.spring.mysneakers.domain.SneakersRequest;
import com.myproyect.spring.mysneakers.domain.SneakersResponse;
import com.myproyect.spring.mysneakers.model.Sneaker;
import com.myproyect.spring.mysneakers.utils.DataBD;

@Repository
public class SneakersRepository {

	/**
	 * 
	 * @return
	 */
	public  SneakersResponse listSneakers() {		
		
		SneakersResponse response = new SneakersResponse();		
		
		List<Sneaker> list = DataBD.loadSneakerList();
		list.sort((p1, p2)->p2.getPublishDate().compareTo(p1.getPublishDate()));
 		
		response.setList(list);  	
		
		return response;		
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
     public  SneakersResponse sneakerInfo(String id) {
		
		SneakersResponse response = new SneakersResponse();		
		response.setList(new ArrayList<Sneaker>()); 
     
		  for(Sneaker tmp :  DataBD.loadSneakerList()) {
				if(id.equalsIgnoreCase(tmp.getId())) {				
					response.getList().add(tmp);
				}
		   }
				
		return response;
		
	}
     
     /**
      * 
      * @param request
      * @return
      */
     public  SneakersResponse addCar(SneakersRequest request) {
 		
 		SneakersResponse response = new SneakersResponse();		 		
 		return response;
 		
 	}
	
		
   
   /**************************************************************************************************
    *  Metodos para simular acceso a BD 
    ***************************************************************************************************/
	/**
	 * 
	 * @return
	 */
	
	
	public static void main(String[] args) {
		SneakersRepository repo = new SneakersRepository();
		
		
	}
	
	
	
}
