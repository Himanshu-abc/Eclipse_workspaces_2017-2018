package com.demo.s_t_m4_annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component/*("nexus")  //by default*/   //non-qualified and de-capitalized
public class Nexus {
	
	@Autowired
	@Qualifier("snapdragon")
	private MobileProcessor mp;
	
	public MobileProcessor getMp() {
		return mp;
	}
	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}
	
	public void config() {		
		System.out.println("google_nexus,4 gb ram,15 MP camera");
		mp.Processor();
	}

}
