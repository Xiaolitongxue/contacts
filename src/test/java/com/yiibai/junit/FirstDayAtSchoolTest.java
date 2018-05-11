package com.yiibai.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	//WRONG
	//String[] bag1 = { "Books", "Notebooks", "Pens", "Toies" };
	//RIGHT
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
    
	//@Ignore
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

}