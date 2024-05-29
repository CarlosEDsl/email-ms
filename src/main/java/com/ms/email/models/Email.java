package com.ms.email.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = Email.TABLE_NAME)
public class Email {

    final static String TABLE_NAME = "emailContent";



}
