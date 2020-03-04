import java.util.List;

public interface employeeDAO {
    //DRUD Operation
    public List<Employee>gatAllEmp();
    public void addEmp(Employee newEmp);
    public void updateEmp(Employee employee);
    public void deleteEmp(int id);
    public Employee findEmp(int id);

}
