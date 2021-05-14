package com.anu.contact_details.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.anu.contact_details.entity.*;

@Repository
public interface ContactDetailsRepo extends CrudRepository<ContactDetails, Integer> {
}
