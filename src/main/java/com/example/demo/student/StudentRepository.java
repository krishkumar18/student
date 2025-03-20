package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


        @Repository
        public interface StudentRepository extends JpaRepository<Student,Long>{

        }

