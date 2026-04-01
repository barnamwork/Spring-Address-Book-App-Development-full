package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private List<String> list = new ArrayList<>();

    @GetMapping("/")
    public ResponseEntity<List<String>> getAll() {
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        if (id < 0 || id >= list.size()) {
            return ResponseEntity.badRequest().body("Invalid ID");
        }
        return ResponseEntity.ok(list.get(id));
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody String name) {
        list.add(name);
        return ResponseEntity.ok("Added");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody String name) {
        list.set(id, name);
        return ResponseEntity.ok("Updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        list.remove(id);
        return ResponseEntity.ok("Deleted");
    }
}