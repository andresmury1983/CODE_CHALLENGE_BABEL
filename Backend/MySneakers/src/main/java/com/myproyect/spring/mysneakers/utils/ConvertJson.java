package com.myproyect.spring.mysneakers.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJson {

public static String convertObjectStringJson(Object request) {
	ObjectMapper mapper = new ObjectMapper();
	String jsonString = "";
	try {
		jsonString = mapper.writeValueAsString(request);
	}catch(JsonProcessingException e) {
		e.printStackTrace();
	}
	return jsonString;
}

}
