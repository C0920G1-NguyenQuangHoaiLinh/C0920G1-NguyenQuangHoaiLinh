package case_study.bai_tap_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
    static List<Person> personList = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);

    public void addNewPerson() {
        Person person = new Person();

        System.out.println("Nhập họ tên : ");
        String fullName = scanner.nextLine();
        while (!Validate.checkFullName(fullName)) {
            System.err.print("họ tên không được để trống !");
            System.out.println("Nhập họ tên : ");
            fullName = scanner.nextLine();
            Validate.checkFullName(fullName);
        }

        System.out.println("Nhập số điện thoại : ");
        String numberPhone = scanner.nextLine();
        while (!Validate.checkNumberPhone(numberPhone)) {
            System.err.print("số điện thoại không đúng (vd: 0xxx xxx xxx )");
            System.out.println("Nhập số điện thoại : ");
            numberPhone = scanner.nextLine();
            Validate.checkNumberPhone(numberPhone);
        }

        System.out.println("Nhập nhóm của số này : ");
        String group = scanner.nextLine();
        while (!Validate.checkGroup(group)) {
            System.err.print("Nhóm không được để trống ! ");
            System.out.println("Nhập nhóm của số này : ");
            group = scanner.nextLine();
            Validate.checkNumberPhone(group);
        }

        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();
        while (!Validate.checkAddress(address)) {
            System.err.print("Địa chỉ không được để trống ! ");
            System.out.println("Nhập địa chỉ : ");
            address = scanner.nextLine();
            Validate.checkAddress(address);
        }

        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();
        while (!Validate.checkGender(gender)) {
            System.err.print("Giới tính không đúng (Nam/Nu/Khac) ");
            System.out.println("Nhập giới tính : ");
            gender = scanner.nextLine();
            Validate.checkGender(gender);
        }

        System.out.println("Nhập ngày sinh : ");
        String dateOfBirth = scanner.nextLine();
        while (!Validate.checkBirthday(dateOfBirth)) {
            System.err.print("Ngày sinh không đúng định dạng (dd/MM/yyyy > 1900) ");
            System.out.println("Nhập ngày sinh : ");
            dateOfBirth = scanner.nextLine();
            Validate.checkBirthday(dateOfBirth);
        }

        System.out.println("Nhập email : ");
        String email = scanner.nextLine();
        while (!Validate.checkEmail(email)) {
            System.err.print("Email không đúng định dạng (abc@abc.xyz) ");
            System.out.println("Nhập email : ");
            email = scanner.nextLine();
            Validate.checkEmail(email);
        }

        person.setFullName(fullName);
        person.setNumberPhone(numberPhone);
        person.setGroup(group);
        person.setAddress(address);
        person.setGender(gender);
        person.setDateOfBirth(dateOfBirth);
        person.setEmail(email);
        System.out.println("Thêm mới thành công !");
        scanner.nextLine();
        personList.add(person);
    }

    public void editPerson() {
        System.out.println("Nhập số điện thoại của danh bạ muốn sửa : ");
        String temp = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getNumberPhone().equals(temp)) {
                System.out.println("Nhập họ tên mới: ");
                String fullName = scanner.nextLine();
                while (!Validate.checkFullName(fullName)) {
                    System.err.println("họ tên không được để trống !");
                    System.out.println("Nhập họ tên mới: ");
                    fullName = scanner.nextLine();
                    Validate.checkFullName(fullName);
                }

                System.out.println("Cập nhật nhóm của số này : ");
                String group = scanner.nextLine();
                while (!Validate.checkGroup(group)) {
                    System.err.println("Nhóm không được để trống ! ");
                    System.out.println("Cập nhật nhóm của số này : ");
                    group = scanner.nextLine();
                    Validate.checkGroup(group);
                }

                System.out.println("Nhập địa chỉ mới: ");
                String address = scanner.nextLine();
                while (!Validate.checkAddress(address)) {
                    System.err.println("Địa chỉ không được để trống ! ");
                    System.out.println("Nhập địa chỉ mới: ");
                    address = scanner.nextLine();
                    Validate.checkAddress(address);
                }

                System.out.println("Nhập giới tính mới: ");
                String gender = scanner.nextLine();
                while (!Validate.checkGender(gender)) {
                    System.err.println("Giới tính không đúng (Nam/Nu/Khac) ");
                    System.out.println("Nhập giới tính mới: ");
                    gender = scanner.nextLine();
                    Validate.checkGender(gender);
                }

                System.out.println("Nhập ngày sinh mới: ");
                String dateOfBirth = scanner.nextLine();
                while (!Validate.checkBirthday(dateOfBirth)) {
                    System.err.println("Ngày sinh không đúng định dạng (dd/MM/yyyy > 1900) ");
                    System.out.println("Nhập ngày sinh mới: ");
                    dateOfBirth = scanner.nextLine();
                    Validate.checkBirthday(dateOfBirth);
                }

                System.out.println("Cập nhật email mới: ");
                String email = scanner.nextLine();
                while (!Validate.checkEmail(email)) {
                    System.err.println("Email không đúng định dạng (abc@abc.xyz)");
                    System.out.println("Cập nhật email mới: ");
                    email = scanner.nextLine();
                    Validate.checkEmail(email);
                }

                personList.get(i).setFullName(fullName);
                personList.get(i).setGroup(group);
                personList.get(i).setAddress(address);
                personList.get(i).setGender(gender);
                personList.get(i).setDateOfBirth(dateOfBirth);
                personList.get(i).setEmail(email);
                System.out.println("Cập nhật danh bạ thành công ! ");
                check = true;
                break;
            }
        }
        if (!check) {
            System.err.println("Không tìm được danh bạ với số điện thoại trên.");
            System.out.println("Enter để quay lại menu hoặc nhập ký tự khác để quay lại chức năng cập nhật !");
            if (scanner.nextLine().equals("")) {
                Main.displayMenu();
            } else {
                editPerson();
            }
        }
        System.out.println("____________________");
    }

    public void deletePerson() {
        System.out.println("Nhập vào số điện thoại của danh bạ muốn xoá : ");
        String temp = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getNumberPhone().equals(temp)) {
                System.out.println("Xác nhận muốn xóa số điện thoại này ? nhập 'y' !");
                if (scanner.nextLine().equals("y")) {
                    personList.remove(i);
                } else if (scanner.nextLine().equals("")) {
                    Main.displayMenu();
                }
                check = true;
            }
        }
        if (!check){
            System.err.println("Không tìm được danh bạ với số điện thoại trên.");
            System.out.println("Enter để quay lại menu hoặc nhập ký tự khác để quay lại chức năng xóa !");
            if (scanner.nextLine().equals("")) {
                Main.displayMenu();
            } else {
                deletePerson();
            }
        }
    }

    public void showPerson() {
        System.out.println("Danh sách danh bạ hiện tại : ");
        for (Person person : personList) {
            System.out.println(person.showName());
        }
        scanner.nextLine();
        for (Person person : personList) {
            System.out.println(person.showNumberPhone());
        }
        scanner.nextLine();
        for (Person person : personList) {
            System.out.println(person.showGroup());
        }
        scanner.nextLine();
        for (Person person : personList) {
            System.out.println(person.showAddress());
        }
        scanner.nextLine();
        for (Person person : personList) {
            System.out.println(person.showGender());
        }
        scanner.nextLine();
        System.out.println("___________________________");
    }

    public void searchPerson() {
        System.out.println("Nhập tên hoặc sđt muốn tìm : ");
        String search = scanner.nextLine();
        boolean check = false;
        for (Person person : personList) {
            if (person.getNumberPhone().contains(search) || person.getFullName().contains(search)) {
                System.out.println(person.toString());
                check = true;
            }
        }
        scanner.nextLine();
        if (!check){
            System.err.println("Không tồn tại trong danh sách ! ");
            scanner.nextLine();
        }
    }

    public List<Person> readContacts(){
        File csvContacts = new File("src/case_study/bai_tap_2/data/contacts.csv");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvContacts));
            String line = null;
            Person person = null;
            String[] temp = null;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                person = new Person(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
                personList.add(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }

    public void writeContacts(){
        try {
            FileWriter csvContacts = new FileWriter("src/case_study/bai_tap_2/data/contacts.csv",false);
            BufferedWriter bufferedWriter = new BufferedWriter(csvContacts);
            for (Person person: personList){
                bufferedWriter.write(person.getFullName()+","+person.getNumberPhone()+","+person.getGroup()
                        +","+person.getAddress()+","+person.getEmail()+","+person.getGender()+","+person.getDateOfBirth());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
