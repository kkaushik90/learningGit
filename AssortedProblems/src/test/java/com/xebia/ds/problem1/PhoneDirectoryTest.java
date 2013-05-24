package com.xebia.ds.problem1;

import junit.framework.TestCase;

import com.xebia.ds.domain.Contact;
import com.xebia.ds.problem1.bad.PhoneDirectory;

public class PhoneDirectoryTest extends TestCase {
	
	// This test has failed need to re-visit this.
	public void testCreateNewContact() {
		PhoneDirectory directory = new PhoneDirectory();
		assertTrue(directory.createNewContact(new Contact("contact 1",
				"Sample", 123456789l, 0123, "Rakka", "friend")));
		assertFalse(directory.createNewContact(new Contact("contact 1",
				"#203, TTR Plaza", 123456789l, 0123, "Shekhu", "family")));
		assertTrue(directory.createNewContact(new Contact("contact 2",
				"#43, WRE Block 2", 123456789l, 0123, "Tony", "family")));
		assertTrue(directory.createNewContact(new Contact("contact 3",
				"IIIR Ron Estate Buiding 2", 123456789l, 0123, "Rinki",
				"friend")));
		assertTrue(directory.createNewContact(new Contact("contact 0",
				"#112, Noro Dta", 123456789l, 0123, "Pinki", "friend")));
		assertFalse(directory.createNewContact(new Contact("contact 0",
				"#112, Noro Dta", 123456789l, 0123, "Pinki", "office")));
	}

	// TODO: Complete the test case
	public void testGetAllRecords() {

	}

	public void init(PhoneDirectory directory) {
		directory.createNewContact(new Contact("contact 1", "Sample",
				123456789l, 0123, "Rakka", "friend"));
		directory.createNewContact(new Contact("contact 2", "#43, WRE Block 2",
				123456789l, 0123, "Tony", "family"));
		directory.createNewContact(new Contact("contact 3",
				"IIIR Ron Estate Buiding 2", 123456789l, 0123, "Rinki",
				"friend"));
		directory.createNewContact(new Contact("contact 0", "#112, Noro Dta",
				123456789l, 0123, "Pinki", "friend"));
		directory.createNewContact(new Contact("contact 0", "#112, Noro Dta",
				123456789l, 0123, "Pinki", "office"));

	}
}
