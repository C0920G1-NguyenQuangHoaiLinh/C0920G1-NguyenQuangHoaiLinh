package _10_dsa_danh_sach.bai_tap.trien_khai_arraylist_theo_thu_vien;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student studentA = new Student(1, "An");
        Student studentB = new Student(2, "Bao");
        Student studentC = new Student(3, "Chi");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(studentA);
        studentMyList.add(studentB);
        studentMyList.add(studentC);

        studentMyList.size();
        System.out.println(studentMyList.size());
        System.out.println(studentMyList.get(0).getName());
    }


}
