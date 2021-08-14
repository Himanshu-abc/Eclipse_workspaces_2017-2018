
import com.app.bean.Employee;
import com.app.dao.EmployeeDAO;
import java.util.List;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amit
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();
        int id, choice = 0;
        String nm, ct;
        Employee e;
        double sal;
        do {
            System.out.println("Enter Choice : ");
            System.out.println("1 : New Employee");
            System.out.println("2 : Search");
            System.out.println("3 : Update");
            System.out.println("4 : Delete");
            System.out.println("5 : List All");
            System.out.println("0 : Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Empid : ");
                    id = sc.nextInt();
                    e = dao.getById(id);
                    if (e != null) {
                        System.out.println("this has been used. please try other!");
                    } else {
                        System.out.println("Enter Name :");
                        nm = sc.next();
                        System.out.println("Enter City :");
                        ct = sc.next();
                        System.out.println("Enter Salary :");
                        sal = sc.nextDouble();
                        e = new Employee(id, nm, ct, sal);
                        int r = dao.add(e);
                        if (r != 0) {
                            System.out.println("Employee Added successfully");
                        } else {
                            System.out.println("Sorry! operation Fail");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter Empid : ");
                    id = sc.nextInt();
                    e = dao.getById(id);
                    if (e == null) {
                        System.out.println("Invalid Empid! Data not Found for this Empid");
                    } else {
                        show(e);
                    }
                    break;
                case 3:
                    System.out.println("Enter Empid to update Employee : ");
                    id = sc.nextInt();
                    e = dao.getById(id);
                    if (e == null) {
                        System.out.println("Invalid Empid! Data not Found for this Empid");
                    } else {
                        System.out.println("Existing data : ");
                        show(e);
                        System.out.println("Enter New Name :");
                        nm = sc.next();
                        System.out.println("Enter New City :");
                        ct = sc.next();
                        System.out.println("Enter New Salary :");
                        sal = sc.nextDouble();
                        e = new Employee(id, nm, ct, sal);
                        int r = dao.update(e);
                        if (r != 0) {
                            System.out.println("Employee Updated successfully");
                        } else {
                            System.out.println("Sorry! operation Fail");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Empid to delete Employee : ");
                    id = sc.nextInt();
                    e = dao.getById(id);
                    if (e == null) {
                        System.out.println("Invalid Empid! Data not Found for this Empid");
                    } else {
                        System.out.println("Existing data : ");
                        show(e);

                        System.out.println("Are you sure to delete this employee (y/n) : ");
                        String c = sc.next();
                        if (c.equals("y")) {
                            int r = dao.delete(e);
                            if (r != 0) {
                                System.out.println("Employee Deleted successfully");
                            } else {
                                System.out.println("Sorry! operation Fail");
                            }
                        }
                    }
                    break;
                case 5:
                           List<Employee> elist= dao.getAll();
                           if(elist!=null){
                                 System.out.printf("%5s %-15s %-15s %10s %n","empId","name","city","salary");                            
                                 System.out.println("---------------------------------------------------------------");
                           for(Employee emp:elist){
                               System.out.println(emp);
                           }
                           System.out.println("---------------------------------------------------------------");
                           }else{
                               System.out.println("No Data Found");
                           }
                    break;
                case 0:
                	System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

    static void show(Employee e) {
        System.out.println("--------------------------------");
        System.out.println("Empid  : " + e.getEmpId());
        System.out.println("Name   : " + e.getName());
        System.out.println("City   : " + e.getCity());
        System.out.println("Salary : " + e.getSalary());
        System.out.println("--------------------------------");
    }
}
