package com.bridgelabz.addressbookapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBook {

    private int id;
    private String name;
    private String city;
}