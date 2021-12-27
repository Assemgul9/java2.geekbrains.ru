package lesson3;

import java.util.Map;
import java.util.Set;
import java.util.*;


public class PhoneBook {

    private Map <String, Set<String>> phonebook = new HashMap<>();

    public void add (String name, String phone){

        Set<String> phoneNumber = phonebook.getOrDefault(name, new HashSet<>());

        phoneNumber.add(phone);

        phonebook.put(name, phoneNumber);
    }

    public Set <String> get(String name){
        return phonebook.get(name);
    }
}
