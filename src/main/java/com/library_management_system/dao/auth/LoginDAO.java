package com.library_management_system.dao.auth;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean login()
}
