package okutafin;


public class Main {


    /**
     * Стартовая точка входа в программу. Отсюда все начинается c 'main(String[] args) {'
     * <p/>
     * и тут все заканчивается, после '}'
     *
     * @param args
     */
    public static void main(String[] args) {

        // что бы вызвать метод другого класса - необходимо иметь экзмпляр этого класса.
        // нужно создать переменную которая сможет хранить новый объект - FileUtils fileUtils;
        FileUtils fileUtils;

        // создать экземпляр класса можно с помощью конструкции new FileUtils();
        // далее необходимо сохранить ссылку на объект(экзеспляр класса в переменной) в переменной
        // что бы ниже через нее обратиться к методам объекта

        fileUtils = new FileUtils();

        // что бы вызвать метод класса напишите имя переменной хранящей объект и через точку имя метода
        // внутри () передаются значения, которые сохранятся в параметрах, который будут видны
        // только внутри метода createFile.
        fileUtils.createFile("/Users/macbook/Downloads/testLab");

        Menu menu = new Menu();
        menu.runMenu();
    }
}
