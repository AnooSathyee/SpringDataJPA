package com.anu.contact_details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_details")
public class ContactDetails {

    @Id
    @Column(name="contact_Id")
    Integer contactId;
    @Column(name="contact_Name")
    String contactName;
    @Column(name="contact_Mail")
    String contactMail;
    public Integer getContactId() {
        return contactId;
    }
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactMail() {
        return contactMail;
    }
    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }
}
