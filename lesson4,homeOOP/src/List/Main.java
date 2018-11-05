package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CarList();
    }

    public static void CarList() {
        LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("Audi");
        Car car4 = new Car("Ferrari");
        Car car5 = new Car("Lamborghini");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.addFirst(car4);
        cars.addFirst(car5); // добавление объекта

        //        Iterator<Car> iterator = cars.descendingIterator(); // обратный итератор
        Iterator<Car> iterator = cars.iterator();


        System.out.println("Весь список:");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        System.out.println("");


        cars.removeFirst(); // удалить объект
        cars.removeLast();
//        cars.remove(2);
        cars.remove(cars.size() - 1); // убирает последний элемент путем вычисления индекса посл. эл.
        System.out.println("Размер списка после редактирования: " + cars.size());

        iterator = cars.iterator();

        System.out.println("Спиоск после редактирования");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
