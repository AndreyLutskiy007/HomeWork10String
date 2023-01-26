public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        String phone = "79063455677";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас шпион!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79063455678";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Провал");
        }
    }

    public static void task2() {
        //Задача 1,2
        String fistName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + fistName + " " + middleName;
        String changeFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + changeFullName);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String changeFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + changeFullName);
    }


}