package lab26.Task2;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CustomListIterator<T> implements Iterator<T> {
    private final List<T> list; // Список, по которому будем итерироваться
    private int currentIndex = 0; // Текущий индекс

    // Конструктор принимает список, для которого создаётся итератор
    public CustomListIterator(List<T> list) {
        this.list = list;
    }

    // Метод hasNext проверяет, есть ли ещё элементы
    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    // Метод next возвращает текущий элемент и переходит к следующему
    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the list");
        }
        return list.get(currentIndex++);
    }

    // Метод remove удаляет текущий элемент
    @Override
    public void remove() {
        if (currentIndex == 0) {
            throw new IllegalStateException("You must call next() before calling remove()");
        }
        list.remove(--currentIndex);
    }

    public static void main(String[] args) {
        // Создаём список для теста
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Создаём экземпляр нашего кастомного итератора
        CustomListIterator<String> iterator = new CustomListIterator<>(myList);

        System.out.println("Итерируемся по списку:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Удаление элемента
        iterator = new CustomListIterator<>(myList);
        if (iterator.hasNext()) {
            iterator.next(); // Переходим на первый элемент
            iterator.remove(); // Удаляем его
        }

        System.out.println("\nСписок после удаления первого элемента:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}
