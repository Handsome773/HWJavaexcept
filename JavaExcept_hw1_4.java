import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Main {
    public static void main(String[] args) {
        String result = messageHandler();
        System.out.printf(result.length() == 0 ? "Введена пустая строка" : ("Введена строка: " + result));
    }

    public static String messageHandler(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = "";
        try{
            str = iScanner.nextLine();
            if(str.length() == 0){
                throw new Exception("!!! Пустые строки вводить нельзя !!!");
            }
        }
        catch(Exception e){
            System.out.println(e);  // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        }finally{
            iScanner.close();
        }
        return str;
    }
}