package com.Crudly.Crudly.Repository;

import com.Crudly.Crudly.model.Studient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudientRepository extends JpaRepository <Studient , Long> {

}
