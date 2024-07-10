package com.kpit.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo.model.Passenger;
 

 
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
