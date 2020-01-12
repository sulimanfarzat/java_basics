/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class ErrorsClass {
	
	
	// throwing error
	public void thrwingError() throws ArrayIndexOutOfBoundsException{
		int arr[] = {1,2,3};
		System.out.println(arr[3]);
	}
	
	
	// url
	public void urlError() {
		System.out.println("\n------------url-------------\n");

		try {
			URL url = new URL("https://www.oracel.com");
			System.out.println(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Suliman Farzat");
		
	}
	
	
	// uri error in \\
	public void uriError() {
		System.out.println("\n------------uri-------------\n");
		
		try {
			URI url = new URI("https:\\www.oracel.com");
			System.out.println(url);
		} catch (URISyntaxException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Suliman Farzat");
		
	}

}
