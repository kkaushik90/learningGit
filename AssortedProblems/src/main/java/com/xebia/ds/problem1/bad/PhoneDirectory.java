package com.xebia.ds.problem1.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xebia.ds.domain.Contact;

/**
 * Represents a simple Phone directory.Allows to save and lookup contacts.
 * numbers lookup can only be done based on contact name. name is unique.
 * sorting is to be maintained for the contacts.
 */
public class PhoneDirectory {
	List<Contact> contacts = new ArrayList<Contact>();

	public boolean createNewContact(Contact contact) {
		if (this.findByName(contact) == null) {
			contacts.add(contact);
			return true;
		}
		return false;
	}

	public Contact findByName(Contact newContact) {
		int index = Collections.binarySearch(contacts, newContact, new Comparator<Contact>(){
			@Override
			public int compare(Contact o1, Contact o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		return index<0 ? null :contacts.get(index);
		/*for (Iterator<Contact> iterator = contacts.iterator(); iterator
				.hasNext();) {
			Contact contact = (Contact) iterator.next();
			if (contact.getName().equals(newContact.getName())) {
				return contact;
			}
		}
		return null;*/
	}

	/**
	 * does not work
	 * 
	 * @return
	 */
	public List<Contact> getAllContacts() {
		Collections.sort(contacts, new Comparator<Contact>(){
			@Override
			public int compare(Contact o1, Contact o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		//Arrays.sort(contacts.toArray());
		return contacts;
	}
}
