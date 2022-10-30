import java.util.Comparator;
import java.util.function.Predicate;

public class PersonNameLengthComparator implements Comparator<Person> {
    private int maxWordsOofSurname;
    private Predicate<Person> less18;

    public PersonNameLengthComparator(int maxWordsOfSurname) {
        this.maxWordsOofSurname = maxWordsOfSurname;
        this.less18 = age -> age.getAge() < 18;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int qtyWords1 = o1.getSurName().split("-").length;
        int qtyWords2 = o2.getSurName().split("-").length;
        if (qtyWords1 == qtyWords2 || qtyWords1 > maxWordsOofSurname || qtyWords2 > maxWordsOofSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(qtyWords2, qtyWords1);
        }
    }
}