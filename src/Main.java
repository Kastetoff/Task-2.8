import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Максим", "Петров", 44));
        peoples.add(new Person("Алексей", "Смирнов", 35));
        peoples.add(new Person("Александр", "Порываев", 14));
        peoples.add(new Person("Андрей", "Сухарев-Найданов", 16));
        peoples.add(new Person("Ян", "Кузнецов-Алексеев", 17));
        peoples.add(new Person("Мирослав", "Петров-Смирнов", 38));
        peoples.add(new Person("Константин", "Петров-Иванов-Смирнов", 20));
        peoples.add(new Person("Сергей", "Алексеев-Попов", 25));

        System.out.println(peoples);

        Collections.sort(peoples, new PersonNameLengthComparator(2));
        System.out.println(peoples);

        peoples.removeIf(person -> person.getAge() < 18);
        System.out.println(peoples);
    }
}