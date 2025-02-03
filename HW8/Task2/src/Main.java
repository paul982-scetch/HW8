public class Main {
    public static void main(String[] args) {
       int min = 40;
       int max = 100;
       int weight = 0;
       int count_people = 0;
       int [] people = new int[10];
       for (int i = 0;i < people.length; i++){
           people[i] = (int)(Math.random() * (max - min)) + min;
           if (people[i] >= 60 && people[i] <= 80){
               count_people ++ ;
           }
       }
       for(int i = 0; i < people.length; i++) {
           int j = people[i];
           System.out.print( j + " ");
       }
        for (int i = 0;i < people.length; i++){
            weight += people[i];
        }
        System.out.println();
        System.out.println(" Средний вес людей " + weight / people.length + " кг.");
        System.out.println(" Людей от 60 до 80 кг \t " + count_people);
        //todo код программы писать тут
    }
}
