package exam.exam.Repository;

import exam.exam.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ERepository extends JpaRepository<Employee, Long> {
}
