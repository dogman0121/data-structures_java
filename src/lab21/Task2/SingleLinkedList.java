package lab21.Task2;

class SingleLinkedList {
    private Node head; // Голова списка

    class Node {
        int[] data;        // Массив из 5 элементов
        int size;          // Количество заполненных элементов
        Node next;         // Ссылка на следующий узел

        // Конструктор
        Node() {
            data = new int[5]; // Размер массива
            size = 0;          // Пока массив пуст
            next = null;
        }
    }

    // Конструктор списка
    public SingleLinkedList() {
        head = null;
    }

    // Вставка значения в список
    public void insert(int value) {
        if (head == null) {
            head = new Node();
            head.data[0] = value;
            head.size = 1;
            return;
        }

        Node current = head;

        // Найти место для вставки
        while (current != null) {
            // Если в массиве есть место
            if (current.size < 5) {
                insertIntoArray(current.data, current.size, value);
                current.size++;
                return;
            }

            // Если массив полон, перейти к следующему узлу
            if (current.next == null) {
                current.next = new Node();
            }
            current = current.next;
        }
    }

    // Вставка в массив с сохранением порядка
    private void insertIntoArray(int[] array, int size, int value) {
        int i = size - 1;

        // Сдвинуть элементы вправо для вставки
        while (i >= 0 && array[i] > value) {
            array[i + 1] = array[i];
            i--;
        }

        // Вставить значение
        array[i + 1] = value;
    }

    // Вывод списка
    public void display() {
        Node current = head;
        while (current != null) {
            for (int i = 0; i < current.size; i++) {
                System.out.print(current.data[i] + " ");
            }
            current = current.next;
        }
        System.out.println();
    }
}