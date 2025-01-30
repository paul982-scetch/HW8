public class Main {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
    }
}
