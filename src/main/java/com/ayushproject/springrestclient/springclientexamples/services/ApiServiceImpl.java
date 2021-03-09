package com.ayushproject.springrestclient.springclientexamples.services;

import com.ayushproject.springrestclient.model.User;
import com.ayushproject.springrestclient.model.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://private-anon-27ba866dd9-apifaketory.apiary-mock.com/api/user?limit="+limit, UserData.class);
        return userData.getData();
    }
}
