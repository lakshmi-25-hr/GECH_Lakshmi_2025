package SpringBootEmployeeCrud.EmployeeCrud.repository;




	import org.springframework.data.jpa.repository.JpaRepository;

	import  SpringBootEmployeeCrud.EmployeeCrud.models.Employee;

	public interface EmployeeRepository  extends JpaRepository<Employee, Long>{


		
		
		
	}

