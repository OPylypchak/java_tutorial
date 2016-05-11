package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Olga", "Pylypchak", "test3", "ondine", "+380961234566", "olga.pylypchak@mail.ru", "Google"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().gotoHomePage();
    }

}
