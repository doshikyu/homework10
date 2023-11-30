public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача 2");
        String uppercaseFullname = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + uppercaseFullname);

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String formattedFullName = fullName.replaceAll("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + formattedFullName);
    }
}