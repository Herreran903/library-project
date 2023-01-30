package com.example.libraryproject.models;

import lombok.Getter;
import lombok.Setter;

public class User
{
    @Getter @Setter
    private String id_user;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastname;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String id_rol;
}
