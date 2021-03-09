package com.ayushproject.springrestclient.springclientexamples.services;

import com.ayushproject.springrestclient.model.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
