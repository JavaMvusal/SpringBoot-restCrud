package com.vusalmustafayev.tutorials.FirstApp.location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface LocationRepository extends CrudRepository<Location,String> {
}
