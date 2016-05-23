package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact(new ContactData("Olga", "Pylypchak", "test30", "ondine", "+380961234566", "olga.pylypchak@mail.ru", "Google"), true);
    }

}
