import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        System.out.println("Только нечетные числа: ");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        // проверяем, является ли число нечетным
        for (Integer number : nums) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Задача №2");

        List<Integer> numbs = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printEvenNumbers(numbs);
    }

    public static void printEvenNumbers(List<Integer> numbs) {
        Set<Integer> evenNumbersSet = new HashSet<>();  // Используем Set для удаления повторений
        for (Integer number : numbs) {
            if (number % 2 == 0) {
                evenNumbersSet.add(number);
            }
        }
        // Переводим Set назад в список и сортируем его
        List<Integer> evenNumbersList = new ArrayList<>(evenNumbersSet);
        Collections.sort(evenNumbersList);

        // Выводим четные числа
        System.out.println("Четные числа в порядке возрастания (без повторений):");
        for (Integer evenNumber : evenNumbersList) {
            System.out.print(evenNumber + " ");
        }
        System.out.println();

        System.out.println("Задача №3");

        List<String> words = Arrays.asList("яблоко", "банан", "апельсин",
                "яблоко", "киви", "банан", "грейпфрут");
        // Используем Set для удаления повторений
        Set<String> uniqueWords = new HashSet<>(words);

        // Выводим уникальные слова в консоль
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println();

        System.out.println("Задача №4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        // Используем HashMap для подсчета количества каждого уникального слова
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : strings) {
            // Если слово уже есть в map, увеличиваем счетчик, иначе добавляем его с начальным значением 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим результаты на консоль
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
