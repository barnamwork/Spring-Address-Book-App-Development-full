package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private List<AddressBook> list = new ArrayList<>();

    public List<AddressBook> getAll() {
        return list;
    }

    public AddressBook getById(int id) {
        if (id < 0 || id >= list.size()) {
            throw new RuntimeException("Invalid ID");
        }
        return list.get(id);
    }

    public String create(AddressBookDTO dto) {
        AddressBook obj = new AddressBook(list.size(), dto.name, dto.city);
        list.add(obj);
        return "Created";
    }

    public String update(int id, AddressBookDTO dto) {
        if (id < 0 || id >= list.size()) {
            throw new RuntimeException("Invalid ID");
        }
        AddressBook obj = list.get(id);
        obj.setName(dto.name);
        obj.setCity(dto.city);
        return "Updated";
    }

    public String delete(int id) {
        if (id < 0 || id >= list.size()) {
            throw new RuntimeException("Invalid ID");
        }
        list.remove(id);
        return "Deleted";
    }
}