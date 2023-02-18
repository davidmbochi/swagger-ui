package com.restapitest.swarggerui.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String firstName;

    private String lastName;

    private String email;
}
