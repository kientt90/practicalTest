package manager.manageremployee.repository;

import manager.manageremployee.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {

}
