package com.whaletail.dao;

import com.whaletail.entities.Student;
import com.whaletail.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Whaletail
 */
public class StudentDao implements EntityDao<Student> {
    public void add(Student student) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public void update(Student student) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public Student getById(long id) {
        Session session = null;
        Student student = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            student = ((Student) session.get(Student.class, id));
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return student;
    }

    public void delete(Student student) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.delete(student);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }
    public List<Student> getAll(){
        Session session = null;
        List<Student> students = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            students = (ArrayList<Student>) session.createQuery("from Student ").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return students;
    }
}
