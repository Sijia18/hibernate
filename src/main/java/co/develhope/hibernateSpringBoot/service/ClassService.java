package co.develhope.hibernateSpringBoot.service;

import co.develhope.hibernateSpringBoot.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class createClass(Class classe) {
        return classRepository.save(classe);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
