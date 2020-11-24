package models;

import commons.FileUtils;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    private static String employee = "Employee";
    static Stack<Employee> employeeStack = new Stack<>();

    public static void main(String[] args) {
        searchStack();
    }

    public static Stack<Employee> readStack(String fileName) {
        FileUtils.setPath(employee);
        List<String> listEmployee = FileUtils.readFile();

        String[] temp = null;
        for (String str : listEmployee) {
            temp = str.split(",");
            Employee employee = new Employee(temp[0], temp[1], temp[2]);
            employeeStack.add(employee);
        }
        return employeeStack;
    }

    public static void searchStack() {
        readStack(employee);
        System.out.println("Danh sách nhân viên theo tên : ");
        for (Employee employee: employeeStack){
            System.out.println(employee.getHoTenNhanVien());
        }
        System.out.println("nhập tên nhân viên cần tìm kiếm hồ sơ: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        for (Employee employee: employeeStack){
            if (employee.getHoTenNhanVien().equals(search)){
                System.out.println("Họ tên nhân viên : " + employee.getHoTenNhanVien() + "\n"+ "Tuổi nhân viên : " + employee.getTuoiNhanVien()
                + "\n"+ "Địa chỉ nhân viên : "+ employee.getDiaChiNhanVien());
            }
        }
    }
}
