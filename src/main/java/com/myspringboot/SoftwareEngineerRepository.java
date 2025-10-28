package com.myspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
// < Class ,Data type>
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {

}
