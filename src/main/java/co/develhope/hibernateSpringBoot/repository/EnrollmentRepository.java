package co.develhope.hibernateSpringBoot.repository;

import co.develhope.hibernateSpringBoot.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public class EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
