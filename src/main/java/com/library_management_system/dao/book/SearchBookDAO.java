package com.library_management_system.dao.book;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library_management_system.entity.Book;

@Repository
public class SearchBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Book searchBookByCategory(String category, String value){
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Book.class);
        return (Book) criteria.add(Restrictions.like("%"+category+"%", value)).list();


    }
}
