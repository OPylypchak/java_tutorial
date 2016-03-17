package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Olga", "Pylypchak", "ondine", "+380961234566", "olga.pylypchak@mail.ru", "Google"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().gotoHomePage();
    }

}
