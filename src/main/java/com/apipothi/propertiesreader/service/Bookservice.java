package com.apipothi.propertiesreader.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Bookservice {

	
	/* If the data comming from application. properties 
	 * file is equla to "apipothi" then output will be
	 *  "My apipothi" else "OUR APIPOTHI"*/
	
	
	@Value("#{ '${apipothi.bookdescription}'== 'apipothi' ? 'my apipothi' : 'your apipothi'}")
	private String defaultbookDescription;

	@Value("#{ '${apipothi.bookid}' == '1 , 2 , 3' ? '1 , 2 , 3 , 5' : '1 , 2 , 3 , 4'}")
	private int[] bookid;

	@Value("#{'${apipothi.bookprice}' == '100 , 200' ? '30 , 50' : '10 , 20'}")
	private List<Integer> bookprice;

	@Value("#{'${apipothi.booksname}' == 'APIJAVA , POTHIJAVA9' ? 'A , B' : 'C, D'}")
	private Set<String> bookname;
	
	@Value("#{${apipothi.bookswithprice} == {JAVA: '7', Micro: '8'} ? {A: '7', B: '8'} : {C: '7', D: '8'}}")
	Map<String, Integer> bookswithprice;

	@Value("#{'${apipothi.booknotabalable}'== 'true' ? 'false' : 'true'}")
	private boolean booknotabalable;

	public void getDefaultDataFromProperties() {

		System.out.println("START***-Bookservice-getDefaultDataFromProperties() -***");

		System.out.println("Book Description As String -> " + defaultbookDescription);
		
		System.out.println("Book Id As int Array -> " + Arrays.toString(bookid));
		
		System.out.println("Book Price As int List -> " + bookprice);
		
		System.out.println("Book Name As int Set -> " + bookname);

		System.out.println("Book Name with Price As MAP -> " + bookswithprice);
		
		System.out.println("Book is there as Boolean -> " + booknotabalable);

		System.out.println("END***-Bookservice-getDefaultDataFromProperties() -***");
	}

}
