package co.sofka.Employee.net.javaguides.springboot.repository;

import co.sofka.Employee.net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
