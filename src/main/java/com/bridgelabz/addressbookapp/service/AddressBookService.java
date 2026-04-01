package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AddressBookService {

    private List<AddressBook> list = new ArrayList<>();
    private int counter = 1;

    public List<AddressBook> getAll() {
        log.info("Fetching all addresses");
        return list;
    }

    public AddressBook getById(int id) {
        log.info("Fetching address with ID: {}", id);

        return list.stream()
                .filter(obj -> obj.getId() == id)
                .findFirst()
                .orElseThrow(() -> {
                    log.error("Address not found with ID: {}", id);
                    return new RuntimeException("Address not found");
                });
    }

    public String create(AddressBookDTO dto) {
        log.info("Creating new address: {}", dto);

        AddressBook obj = new AddressBook(counter++, dto.getName(), dto.getCity());
        list.add(obj);

        log.info("Address created successfully");
        return "Created Successfully";
    }

    public String update(int id, AddressBookDTO dto) {
        log.info("Updating address with ID: {}", id);

        AddressBook obj = getById(id);
        obj.setName(dto.getName());
        obj.setCity(dto.getCity());

        log.info("Address updated successfully");
        return "Updated Successfully";
    }

    public String delete(int id) {
        log.info("Deleting address with ID: {}", id);

        AddressBook obj = getById(id);
        list.remove(obj);

        log.info("Address deleted successfully");
        return "Deleted Successfully";
    }
}