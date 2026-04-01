package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private List<AddressBook> list = new ArrayList<>();
    private int counter = 1;

    public List<AddressBook> getAll() {
        return list;
    }

    public AddressBook getById(int id) {
        return list.stream()
                .filter(obj -> obj.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Address not found"));
    }

    public String create(AddressBookDTO dto) {
        AddressBook obj = new AddressBook(counter++, dto.name, dto.city);
        list.add(obj);
        return "Created Successfully";
    }

    public String update(int id, AddressBookDTO dto) {
        AddressBook obj = getById(id);
        obj.setName(dto.name);
        obj.setCity(dto.city);
        return "Updated Successfully";
    }

    public String delete(int id) {
        AddressBook obj = getById(id);
        list.remove(obj);
        return "Deleted Successfully";
    }
}