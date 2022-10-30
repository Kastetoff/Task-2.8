import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Максим", "Петров", 44));
        peoples.add(new Person("Алексей", "Смирнов", 35));
        peoples.add(new Person("Александр", "Порываев", 56));
        peoples.add(new Person("Андрей", "Сухарев-Найданов", 21));
        peoples.add(new Person("Ян", "Кузнецов-Алексеев", 40));
        peoples.add(new Person("Мирослав", "Петров-Смирнов", 38));
        peoples.add(new Person("Константин", "Петров-Иванов-Смирнов", 20));
        peoples.add(new Person("Сергей", "Алексеев-Попов", 25));

        System.out.println(peoples);

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int maxWordsOfSurname = 2;
            int qtyWords1 = o1.getSurName().split("-").length;
            int qtyWords2 = o2.getSurName().split("-").length;

            if (qtyWords1 == qtyWords2 || qtyWords1 > maxWordsOfSurname || qtyWords2 > maxWordsOfSurname) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return Integer.compare(qtyWords2, qtyWords1);
            }
        };
        Collections.sort(peoples, comparator);
        System.out.println(peoples);
    }
}