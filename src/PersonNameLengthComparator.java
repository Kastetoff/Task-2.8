import java.util.Comparator;

public class PersonNameLengthComparator implements Comparator<Person> {
    private int maxWordsOofSurname;

    public PersonNameLengthComparator(int maxWordsOfSurname) {
        this.maxWordsOofSurname = maxWordsOfSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
//        if (o1.getSurName().contains("-")) {
        int qtyWords1 = o1.getSurName().split("-").length;

//        if (o2.getSurName().contains("-")) {
        int qtyWords2 = o2.getSurName().split("-").length;

        if (qtyWords1 == qtyWords2 || qtyWords1 > maxWordsOofSurname || qtyWords2 > maxWordsOofSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(qtyWords2, qtyWords1);
        }
    }
}