package com.zthunworks.interviews.health;

import org.springframework.stereotype.Service;

@Service
public class ZHealthServiceTrue implements ZHealthService {

    public boolean get() {
        return true;
    }
}
