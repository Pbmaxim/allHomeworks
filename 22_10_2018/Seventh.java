/*
* Задача 7*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия
показывается симметричная комбинация для той, что справа от двоеточия
(например, 02:20, 11:11 или 15:51).
*/
public class Seventh {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 23; i++){
            for (int j = 0; j < 59; i++){
                if (Math.abs(i-j) % 9 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
