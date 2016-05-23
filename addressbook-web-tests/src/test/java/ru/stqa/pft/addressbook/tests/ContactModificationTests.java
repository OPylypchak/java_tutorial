package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by OCheboraka on 4/25/2016.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoContactPage();
            app.getContactHelper().createContact(new ContactData("Manya", "Che", "test30", "al-ch", "+380939876543", "olga.cheboraka@mail.ru", "Orange"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Sasha", "Cheboraka", null, "alch", "+380939876543", "olga.cheboraka@mail.ru", "Apple"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().gotoHomePage();
    }
}
