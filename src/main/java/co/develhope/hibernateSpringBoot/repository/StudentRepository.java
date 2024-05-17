package co.develhope.hibernateSpringBoot.repository;

import co.develhope.hibernateSpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public class StudentRepository extends JpaRepository <Student, Long> {
}
