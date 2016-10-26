package net.apispark.webapi;

import org.junit.Assert;
import org.junit.Test;

import net.apispark.webapi.db.ContactPersistence;
import net.apispark.webapi.representation.Contact;

public class ContactPersistenceTest {
	@Test
	public void addContactTest() throws Exception {
		ContactPersistence contactPersistence = new ContactPersistence();
		Contact contact = new Contact();
		Contact createdContact = contactPersistence.addContact(contact);
		Assert.assertNotNull(createdContact.getId());
		Assert.assertEquals(createdContact, contact);
	}
	
	@Test
	public void requestNewContactTest() throws Exception {
		ContactPersistence contactPersistence = new ContactPersistence();
		Contact contact = new Contact();
		Contact createdContact = contactPersistence.addContact(contact);
		Assert.assertEquals(contactPersistence.getContact(createdContact.getId()), createdContact);
	}
	
	
}
