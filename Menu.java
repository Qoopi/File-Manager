package okutafin;


import java.util.Scanner;

public class Menu {

    /**
     * этот метод считывает ответ от пользователя.
     * По хорошему, этот метод должен быть в другом классе, но пока что
     * мы его оставим тут что бы не усложнять код для первого раза.
     */
    private void readAnswer() {
        Scanner in = new Scanner(System.in);
        // Считывает линию из консоли
        //и сохраняет ее в переменную
        String answer = in.nextLine();

        // заканчиваем процесс чтения, в противном случае
        // программа будет вечно висеть в данном участке кода
        in.close();

        System.out.println("Answer is :" + answer);
        //TODO необходимо сохранить ответ в переменную и передать ее выше так как
        // принятие решения согласно выбору пользователя будет делать метод выше по цепочке вызова
        // в данном случае runMenu()
    }

    //  ПОРЯДОК ВЫОЛНЕНИЯ МЕТОДОВ - не имеет значения в каком порядке снизу вверх были объявлены методы
    // важно в каком порядке были они вызваны в main(String[] args) {
    //
    // }
    // или в каком порядке они были вызваны в методы вызвавшем их, например runMenu().
    // ОБРАТИТЕ ВНИМАНИЕ, что printMenu() объявлен внизу, но это нам не помешало его вызвать раньше чем
    // мы его объявили
    public void runMenu() {
        String answer = ""; // пока что тут пусто, но в скоре нужно внести сюда ответ от пользователя
        printMenu();
        readAnswer();

        // TODO

        switch (answer) {
            case "1":
                //TODO - вызов именно того метода, который ответственен за операцию, которая была выбрана
                // пользователем
                break;

            case "2":
                //TODO - вызов именно того метода, который ответственен за операцию, которая была выбрана
                // пользователем
                break;
        }

    }

    /**
     * метод, коорый выводит список меню в консоль
     */
    private void printMenu() {
        System.out.println("1. Create file"); // вывод текста в консоль
        System.out.println("2. Create file");
        //TODO добавляем пункты меню по мере их появления
    }

}