package hwjavacore.populationcensus;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//      creating a collection
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
////        1. Найти количество несовершеннолетних (т.е. людей младше 18 лет).
        long count = persons.stream()
                .filter((value -> value.getAge() < 18))
                .count();
        System.out.println(count);
////        2. Получить список фамилий призывников (т.е. мужчин от 18 и до 27 лет).
        List<String> conscript = persons.stream()
                .filter((value -> value.getSex() == Sex.MAN))
                .filter(value -> (value.getAge() >= 18) && (value.getAge() <= 27))
                .map(Person::getLastName)
                .collect(Collectors.toList());
        System.out.println(conscript.toString());

//        3. Получить отсортированный по фамилии список потенциально работоспособных людей
//        с высшим образованием в выборке (т.е. с высшим образованием от 18 до 60 лет для женщин
//        и с высшим образованием от 18 до до 65 лет для мужчин).
        List<String> workable =
                persons.stream()
                .filter(value -> value.getEducation() == Education.HIGHER)
                .filter(value -> (value.getAge() >= 18))
                .filter(value -> (value.getSex() == Sex.MAN ? (value.getAge() <= 65) : (value.getAge() <= 60)))
                .map(value -> value.getLastName())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(workable);
    }
}
