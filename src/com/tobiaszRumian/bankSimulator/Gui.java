package com.tobiaszRumian.bankSimulator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekori96 on 30.09.2016.
 */
public class Gui extends JFrame
{
    private JButton button1;
    private JPanel mainWindow;
    private JTextField tForename;
    private JTextField tSurname;
    private JTextField tCity;
    private JTextField tStreet;
    private JTextField tHouseNumber;
    private JTextField tApartmentNumber;
    private Configuration cfg = new Configuration();
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;
    public Gui()
    {
        setContentPane(mainWindow);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        start();
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                session=factory.openSession();
                transaction=session.beginTransaction();
                fillData();
                transaction.commit();
                session.close();
                System.out.println("successfully saved");
            }
        });
    }
    private void start()
    {
        cfg.configure("hibernate.cfg.xml");
        factory=cfg.buildSessionFactory();
    }
    private void fillData()
    {
        Customer c1=new Customer();
        c1.setForename(tForename.getText());
        c1.setSurname(tSurname.getText());
        c1.getAddress().setCity(tCity.getText());
        c1.getAddress().setStreet(tStreet.getText());
        c1.getAddress().setHouseNumber(Short.parseShort(tHouseNumber.getText()));
        c1.getAddress().setApartmentNumber(Short.parseShort(tApartmentNumber.getText()));
        session.persist(c1);
        session.persist(c1.getAddress());

    }
}
