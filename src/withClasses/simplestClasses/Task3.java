package withClasses.simplestClasses;

public class Task3 {
    
    static boolean excellentStudent;

    public static void main(String[] args) {
        Student[] list = studentsInflate();
        findBestStudent(list);
    }

    public static void findBestStudent(Student[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].progress.length; j++) {
                if (list[i].progress[j] < 9) {
                    excellentStudent =false;
                } else {
                    excellentStudent = true;
                }
            }
            if(excellentStudent){
                System.out.println("фамилия: " + list[i].getFullName() + " группа №: " + list[i].getGroupNumber());
            }
        }
    }

    public static Student[] studentsInflate() {
        Student[] list = new Student[10];
        list[0] = new Student("Иванов И.И.", 111, new int[]{2, 10, 9, 9, 9});
        list[1] = new Student("Петров И.И.", 33, new int[]{9, 10, 1, 9, 9});
        list[2] = new Student("Сидоров И.И.", 3235, new int[]{9, 1, 9, 9, 9});
        list[3] = new Student("Соболев И.И.", 3523, new int[]{9, 10, 9, 9, 9});
        list[4] = new Student("Сокарев И.И.", 666, new int[]{9, 10, 9, 9, 9});
        list[5] = new Student("Иванко И.И.", 1, new int[]{9, 1, 9, 9, 9});
        list[6] = new Student("Иванов А.А.", 314, new int[]{9, 10, 9, 8, 9});
        list[7] = new Student("Герасимчик П.С.", 4, new int[]{9, 10, 9, 9, 9});
        list[8] = new Student("Мурашко И.В.", 999, new int[]{9, 10, 2, 9, 9});
        list[9] = new Student("Шахорко Е. .", 888, new int[]{9, 10, 9, 9, 9});
        return list;
    }
}

class Student {

    protected String fullName;
    protected int groupNumber;
    protected int[] progress = new int[5];

    public Student(String fullName, int groupNumber, int[] progress) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public String getFullName() {
        fullName = fullName.replaceAll("\\s.*", "");
        return fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
