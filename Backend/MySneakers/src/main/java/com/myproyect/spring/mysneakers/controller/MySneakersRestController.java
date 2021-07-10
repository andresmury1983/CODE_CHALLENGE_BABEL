package com.myproyect.spring.mysneakers.controller;


import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproyect.spring.mysneakers.domain.SneakersRequest;
import com.myproyect.spring.mysneakers.domain.SneakersResponse;
import com.myproyect.spring.mysneakers.domain.enums.Operation;
import com.myproyect.spring.mysneakers.service.SneakersService;
@CrossOrigin(origins = "http://localhost:4200",  methods= {RequestMethod.PUT,RequestMethod.GET,RequestMethod.OPTIONS})
@RestController
@RequestMapping("api/mysneakers")
public class MySneakersRestController {
	
	@Autowired
	private SneakersService service;
	
	@RequestMapping(value = "/listSneakers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SneakersResponse> listSneakers() {
		
	      return startOperation(Operation.LIST, null);					
	}
	
	@RequestMapping(value = "/sneakerInfo/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SneakersResponse> sneakerInfo(@PathVariable("id") Long id) {
		
		  SneakersRequest req = new SneakersRequest();
		  req.setId(String.valueOf(id));	
		  return startOperation(Operation.DETAIL, req);	 

	}
	
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SneakersResponse> addCar(@RequestBody SneakersRequest request, @RequestHeader HttpHeaders heders) {
					
		 return startOperation(Operation.ADD_CAR, request);
	}
		

	@RequestMapping( value = "/image/{id}",  method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody  byte[] image(@PathVariable("id") Long id) throws IOException {
	    InputStream in = getClass()
	      .getResourceAsStream("/img/image_"+id+".jpg");
	    return IOUtils.toByteArray(in);
	}
	
	@RequestMapping( value = "/imagename/{name}",  method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody  byte[] image(@PathVariable("name") String name) throws IOException {
	    InputStream in = getClass()
	      .getResourceAsStream("/img/"+name+".jpg");
	    return IOUtils.toByteArray(in);
	}
	
   //****************************************************
			
	/**
	 * 		
	 * @param operation
	 * @param request
	 * @return
	 */
	private  ResponseEntity<SneakersResponse> startOperation(Operation operation, SneakersRequest request ) {
		
		SneakersResponse response = new SneakersResponse();
			try {	
				switch (operation) {
				     case LIST : 
				    	 response = service.listSneakers();			     
					 break;			 
				     case DETAIL : 
				    	 response = service.sneakerInfo(request.getId());		     
					 break;
				     case ADD_CAR:
				    	 response = service.addCar(request);
				     break;
				}				
				 return new ResponseEntity<>(response , HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(response , HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		
		}	
	
}

