package com.dockerforjavadevelopers.service;

public class Preview implements IPreview {


	public void createPreview() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("craetePreview");
	}

}
