package interviewMistify;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamClass {

    public static class Employee implements Comparable<Employee>{
        public String empName;
        public String empId;
        public String managerId;
        public String lastName;
        public String joiningData;
        public Integer id = 10;

        public Employee(String empName, String empId, String managerId, String lastName, String joiningData) {
            this.empName = empName;
            this.empId = empId;
            this.managerId = managerId;
            this.lastName = lastName;
            this.joiningData = joiningData;
        }

        public String getEmpName() {
            return empName;
        }

        public String getEmpId() {
            return empId;
        }

        public String getManagerId() {
            return managerId;
        }

        public String getLastName() {
            return lastName;
        }

        public String getJoiningData() {
            return joiningData;
        }

        public Integer getId() {
            return id;
        }

        @Override
        public int compareTo(Employee o) {
            return o.getManagerId().compareTo(this.getManagerId());
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empName='" + empName + '\'' +
                    ", empId='" + empId + '\'' +
                    ", managerId='" + managerId + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", joiningData='" + joiningData + '\'' +
                    '}';
        }

        public <T> T getValue(Employee emp){
            return (T) this.getId();
        }
    }

    public static int sum = 0;
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("raj", "vijay", "mystifly", "viraj");

//        Collections.sort(strList);
//        for(String str: strList) {
//            System.out.println(str);
//        }

//        List<String> sortedList = strList.stream().sorted().collect(Collectors.toList());
//        for(String str: sortedList) {
//            System.out.println(str);
//        }
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("a", "1", "m1", "z", "j1"));
        empList.add(new Employee("b", "1", "m1", "z", "j1"));
        empList.add(new Employee("c", "1", "m2", "z", "j1"));
        empList.add(new Employee("d", "1", "m2", "z", "j1"));
        //Collections.sort(empList);


        Map<String, List<Employee>> finalMap = new HashMap<>();


        BinaryOperator<Employee> bo = new BinaryOperator<Employee>() {
            public Employee apply(Employee employee, Employee employee2) {
                return new Employee(employee.getEmpName()+employee2.getEmpName(), "1", "m2", "z", "j1");
            }
        };
        Optional<Employee> emp1 = empList.stream()
                .filter(x -> {return x.getManagerId().equals("m1");})
                .reduce(bo);
        //System.out.println(emp1.get().getEmpName());

        List<Integer> arrayLiost = new ArrayList<>();
        arrayLiost.add(4);
        arrayLiost.add(1);
        arrayLiost.add(6);
        arrayLiost.add(3);


        Predicate<Integer> perd = new Predicate<Integer>() {
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        };
        List<Integer> finalList = arrayLiost.stream()
                                    .map(x -> {
                                        if(x == 6){
                                            return x*x;
                                        } else {
                                            return x*2;
                                        }
                                    })
                                    .collect(Collectors.toList());

        finalList.stream().forEach(x -> System.out.println(x));

Employee emp = new Employee("d", "1", "m2", "z", "j1");
        ;
        System.out.println(emp.getValue(emp).getClass().getName());

    }

    //employee
    /*
    emp_id
    emp_name
    emp_lastName
    joining_data
    manager_id
     */

    public static void testing(int x) {
        sum = sum+x;
    }
}
