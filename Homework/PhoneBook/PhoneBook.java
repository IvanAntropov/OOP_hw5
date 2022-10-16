package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook{
    private List<Contact> Phones;

    public PhoneBook() {
        Phones = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        if(!Phones.contains(contact)){
            Phones.add(contact);
        }
    }

    public void removeContact(Contact contact){
        if(Phones.contains(contact)){
            Phones.remove(contact);
        }
    }

    public void showContact(Contact contact){


    }





}