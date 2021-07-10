package com.myproyect.spring.mysneakers.utils;

import java.util.ArrayList;
import java.util.List;

import com.myproyect.spring.mysneakers.model.AvailableSize;
import com.myproyect.spring.mysneakers.model.Sneaker;

public class DataBD {
  
public static List<Sneaker> loadSneakerList(){
		
		List<Sneaker> lista = new ArrayList<Sneaker>(); 
		
		Sneaker sneaker = new Sneaker();		
		sneaker.setId("4");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 4");
		sneaker.setPrice("61000");
		sneaker.setLaunchDate("2011/12/01");
		sneaker.setPublishDate("2011/11/01");
		sneaker.setImage("https://secure-images.nike.com/is/image/DotCom/DD1068_103_A_PREM?$SNKRS_COVER_WD$&amp;align=0,1");
		sneaker.setListaAvailableSize(loadAvailableSize("4"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("1");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 1");
		sneaker.setPrice("58000");
		sneaker.setLaunchDate("2018/12/01");
		sneaker.setPublishDate("2018/11/01");
		sneaker.setImage("https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/f4d248f4-bc72-4806-8419-6635404cac71/air-max-plus-zapatillas-HVGbFd.png");
		sneaker.setListaAvailableSize(loadAvailableSize("1"));
		lista.add(sneaker);
		
		
		
	    sneaker = new Sneaker();
		sneaker.setId("3");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 3");
		sneaker.setPrice("60000");
		sneaker.setLaunchDate("2020/12/01");
		sneaker.setPublishDate("2020/11/01");
		sneaker.setImage("https://cronicaglobal.elespanol.com/uploads/s1/89/10/54/0/nike-air-force-1-07-originales_12_658x347.jpeg");
		sneaker.setListaAvailableSize(loadAvailableSize("3"));
		lista.add(sneaker);
		
		
		sneaker = new Sneaker();
		sneaker.setId("2");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 2");
		sneaker.setPrice("59000");
		sneaker.setLaunchDate("2019/12/01");
		sneaker.setPublishDate("2019/11/01");
		sneaker.setImage("https://www.redaccionmedica.com/images/destacados/salen-a-venta-las-zapatillas-nike-para-medicos-y-enfermeros-7306.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("2"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("5");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 5");
		sneaker.setPrice("62000");
		sneaker.setLaunchDate("2021/12/01");
		sneaker.setPublishDate("2021/11/01");
		sneaker.setImage("https://i.pinimg.com/originals/1f/b2/ed/1fb2ed78a71918762d0759ae873911d3.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("5"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("6");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 6");
		sneaker.setPrice("63000");
		sneaker.setLaunchDate("2023/12/01");
		sneaker.setPublishDate("2023/11/01");
		sneaker.setImage("https://resize.sprintercdn.com/f/261x261/products/0299715/nike-venture_0299715_00_4_93852664.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("6"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("7");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 7");
		sneaker.setPrice("64000");
		sneaker.setLaunchDate("2014/12/01");
		sneaker.setPublishDate("2014/11/01");
		sneaker.setImage("https://seventeenst.com/15775-home_default/zapatillas-nike-precision-iv-hombre-azl-osc.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("7"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("8");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 8");
		sneaker.setPrice("65000");
		sneaker.setLaunchDate("2012/12/01");
		sneaker.setPublishDate("2012/11/01");
		sneaker.setImage("https://e00-marca.uecdn.es/assets/multimedia/imagenes/2020/04/22/15875581293834.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("8"));
		
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("9");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 9");   
		sneaker.setPrice("66000"); 
		sneaker.setLaunchDate("2026/12/01");
		sneaker.setPublishDate("2026/11/01");
		sneaker.setImage("https://media.revistagq.com/photos/60be4a3aea95b3cb11bfb1ec/master/w_1280,h_854,c_limit/zapatillas%20nike%20orgullo%202.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("9"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("10");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 10");
		sneaker.setPrice("67000");
		sneaker.setLaunchDate("2015/12/01");
		sneaker.setPublishDate("2015/11/01");
		sneaker.setImage("https://http2.mlstatic.com/D_NQ_NP_874532-MLA45683832186_042021-W.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("10"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("11");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 11");
		sneaker.setPrice("68000");
		sneaker.setLaunchDate("2028/12/01");
		sneaker.setPublishDate("2028/11/01");
		sneaker.setImage("https://i.blogs.es/02539c/28xp-shoes-05-superjumbo/1366_2000.jpeg");
		sneaker.setListaAvailableSize(loadAvailableSize("11"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("12");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 12");
		sneaker.setPrice("69000");
		sneaker.setLaunchDate("2029/12/01");
		sneaker.setPublishDate("2029/11/01");
		sneaker.setImage("https://www.digitalsport.com.ar/files/products/5f4c3bc404f59-487929-500x500.jpg");
		sneaker.setListaAvailableSize(loadAvailableSize("12"));
		lista.add(sneaker);
		
		sneaker = new Sneaker();
		sneaker.setId("13");
		sneaker.setBrand("Nike");
		sneaker.setModel("Air Force 13");
		sneaker.setPrice("70000");
		sneaker.setLaunchDate("2010/12/01");
		sneaker.setPublishDate("2010/11/01");
		sneaker.setImage("https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/a42a5d53-2f99-4e78-a081-9d07a2d0774a/air-force-1-07-zapatillas-ktGJCV.png");
		sneaker.setListaAvailableSize(loadAvailableSize("13"));
		lista.add(sneaker);
		
		return lista;
		
	}
	
public static List<AvailableSize> loadAvailableSize(String idSneaker){
		List<AvailableSize> lista = new ArrayList<AvailableSize>(); 
		
		
		AvailableSize availableSize = new AvailableSize();
		
		switch (idSneaker ) {
		case "1" :
			availableSize.setId("1");
			availableSize.setSize("40");
			availableSize.setAmount("2");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("42");
			availableSize.setAmount("5");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("3");
			availableSize.setSize("41");
			availableSize.setAmount("1");			
			lista.add(availableSize);
			break;
		case "2" :
			availableSize.setId("1");
			availableSize.setSize("39");				
			availableSize.setAmount("10");		
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("40");
			availableSize.setAmount("5");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("3");
			availableSize.setSize("41");
			availableSize.setAmount("8");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("4");
			availableSize.setSize("42");
			availableSize.setAmount("5");			
			lista.add(availableSize);			
			break;
		case "3" :
			availableSize.setId("1");
			availableSize.setSize("40");				
			availableSize.setAmount("20");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("15");			
			lista.add(availableSize);
			
		
			break;
		case "4" :
			availableSize.setId("1");
			availableSize.setSize("39");				
			availableSize.setAmount("8");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("15");			
			lista.add(availableSize);
			
			break;
		case "5" :
			availableSize.setId("1");
			availableSize.setSize("40");				
			availableSize.setAmount("7");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("43");
			availableSize.setAmount("2");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("3");
			availableSize.setSize("42");
			availableSize.setAmount("1");			
			lista.add(availableSize);
			
			break;
		case "6" :
			availableSize.setId("1");
			availableSize.setSize("39");
			availableSize.setAmount("10");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("40");
			availableSize.setAmount("9");			
			lista.add(availableSize);
			
				
			break;
		case "7" :
			availableSize.setId("1");
			availableSize.setSize("42");
			availableSize.setAmount("10");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("43");
			availableSize.setAmount("29");			
			lista.add(availableSize);	
			break;
		case "8" :
			availableSize.setId("1");
			availableSize.setSize("40");
			availableSize.setAmount("10");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("2");			
			lista.add(availableSize);	
			
			availableSize = new AvailableSize();
			availableSize.setId("3");
			availableSize.setSize("42");
			availableSize.setAmount("20");			
			lista.add(availableSize);
			break;
		case "9" :
			availableSize.setId("1");
			availableSize.setSize("40");
			availableSize.setAmount("18");
			lista.add(availableSize);		
			
			break;
		case "10" :
			availableSize.setId("1");
			availableSize.setSize("42");
			availableSize.setAmount("10");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("43");
			availableSize.setAmount("20");			
			lista.add(availableSize);	
			break;
		case "11" :
			availableSize.setId("1");
			availableSize.setSize("39");
			availableSize.setAmount("10");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("40");
			availableSize.setAmount("20");			
			lista.add(availableSize);	
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("15");			
			lista.add(availableSize);
			break;
		case "12" :
			availableSize.setId("1");
			availableSize.setSize("39");
			availableSize.setAmount("2");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("40");
			availableSize.setAmount("20");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("7");			
			lista.add(availableSize);
			break;
		case "13" :
			availableSize.setId("1");
			availableSize.setSize("40");
			availableSize.setAmount("30");
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("2");
			availableSize.setSize("41");
			availableSize.setAmount("20");			
			lista.add(availableSize);
			
			availableSize = new AvailableSize();
			availableSize.setId("3");
			availableSize.setSize("42");
			availableSize.setAmount("30");			
			lista.add(availableSize);
			break;	
		
		}
		
		return lista;
		
	}
	
}
