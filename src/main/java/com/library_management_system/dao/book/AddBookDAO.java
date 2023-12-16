package com.library_management_system.dao.book;


import com.library_management_system.entity.Book;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddBookDAO {

    @Autowired
    SessionFactory sessionFactory;
    public Boolean addBook(Book book){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        return true;
    }
}
