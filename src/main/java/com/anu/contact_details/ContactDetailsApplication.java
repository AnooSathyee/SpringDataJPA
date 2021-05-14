package com.anu.contact_details;

import com.anu.contact_details.entity.ContactDetails;
import com.anu.contact_details.repos.ContactDetailsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContactDetailsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ac = SpringApplication.run(ContactDetailsApplication.class, args);
        ContactDetailsRepo repo = ac.getBean(ContactDetailsRepo.class);

        // create object

        ContactDetails cd = new ContactDetails();
        cd.setContactId(100);
        cd.setContactName("Anu");
        cd.setContactMail("anu@email.com");
        repo.save(cd);

        System.out.println("record created >>> ");

    }

}
