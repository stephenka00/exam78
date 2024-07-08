package exam.exam.Controller;


@RestController
@RequestMapping("/employees")
public class EController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }
}
