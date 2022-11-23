public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    private static void task8(){
        int one = 7;
        int two = 8;
        int free = 9;
        if (free > two && free > one) {
            System.out.println("Три самое большое число");
        }else {System.out.println("Неправильный ответ");}
    }
    private static void task7() {
        int ageHuman = 4;
        if (ageHuman >= 5){
            System.out.println("Ребенок может кататься на атракционе");}
        else {
            System.out.println("Если ребенку меньше 5 лет,то он не может кататься на атракционе");}
        int ageMax = 7;
        if (ageHuman <= 5|| ageMax >=14){
            System.out.println("Если возраст позволяет,то ребенок может кататься в сопровождении взрослого");}
        else {
            System.out.println("Если взрослого нет,то кататься нельзя");}
        int ageGeorg =14;
        if (ageGeorg >=14){
            System.out.println("Если возраст позволяет,то ребенок может кататься без взрослого");}
        else {System.out.println("Если возраст не позволяет,то кататься нельзя без взрослого,действуют ограничения");}
    }
    private static void task6() {
        int ageHuman = 2;
        if (ageHuman <= 2 || ageHuman >= 6) {
            System.out.println("Мальчик ходит в детский сад");
        } else {
            System.out.println("Возраст еще не наступил,нужно еще подождать");
        }
        int ageMax = 8;
        if (ageMax <= 7 || ageMax >= 18) {
            System.out.println("Мальчик ходит в детский сад");
        } else {
            System.out.println("Человек может пойти в школу");
        }
        int ageIgor = 17;
        if (ageIgor <= 18 || ageIgor >= 24) {
            System.out.println("Мальчик ходит в школу");
        } else {
            System.out.println("Человек может пойти в университет");
        }
        int ageMaik = 25;
        if (ageMaik <= 24) {
            System.out.println("Мальчик ходит в университет");
        } else {
            System.out.println("Человек может искать себе работу");
        }
    }


    private static void task4() {
        int ageHuman = 17;

        if(ageHuman>= 18) {
            System.out.println("Поздравить с совершенолетием");}
        else {System.out.println("Возраст совершенолетия еще не наступил,нужно немного подождать");
        }}
    private static void task5(){
        int ageHuman = 6;
        if (ageHuman >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Возраст еще не достигнут,надо немного подождать");
            if (ageHuman >= 18) ;
            else {
                System.out.println("Человек закончил школу и может оправляться в университет");
                if (ageHuman >= 24) ;
                else {
                    System.out.println("Человек закончил университет,пора искать первую работу");
                }
                int stendingPlacesTotal = 40;
                int seatsPlacesTotal = 45;
                if (stendingPlacesTotal >= 42 && seatsPlacesTotal >= 60) {
                    System.out.println("В вагоне мест нет");
                }
                if (stendingPlacesTotal <= 40 && seatsPlacesTotal >= 60) ;
                else {
                    System.out.println("В вагоне есть стоячее место");
                }
                if (stendingPlacesTotal >= 42 && seatsPlacesTotal <= 59) ;
                else {
                    System.out.println("В вагоне есть сидячее место");
                }
            }

        }
    }



    private static void task3() {
        int stendingPlacesTotal = 40;
        int seatsPlacesTotal = 45;
        if (stendingPlacesTotal >= 42 && seatsPlacesTotal >= 60) {
            System.out.println("В вагоне мест нет");
        }
        if (stendingPlacesTotal <= 40 && seatsPlacesTotal >= 60) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (stendingPlacesTotal >= 42 && seatsPlacesTotal <= 59) {
            System.out.println("В вагоне есть сидячее место");
        }
    }


    private static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }
        if (age < 18) {
            System.out.println("Ты не можешь водить");
        }
    }

    private static void task2() {

        int age = 7;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age <= 18) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (age <= 24) {
            System.out.println("Человек окончил университет,ему пора искать работу");
        }


        int ageHuman = 17;
        if (age >= 18) {
            System.out.println("Поздравить с совершенолетием");
        }
        System.out.println("Возраст совершенолетия еще не наступил,нужно еще немного подождать");
    }




}