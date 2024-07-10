package com.kpit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.demo.model.Train;

public interface TrainRepository extends JpaRepository<Train,Long> {

}
