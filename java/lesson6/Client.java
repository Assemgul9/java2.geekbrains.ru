package lesson6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(Socket socket = new Socket("localhost", 8189)) {
            System.out.println("Подключен к серверу");
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            Thread thread = new Thread(() -> {

                try {
                    while (true){
                        outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            });

            thread.setDaemon(true);
            thread.start();

            while (true){

                String str = inputStream.readUTF();

                if (str.equals("/close")){
                    System.out.println("Потеряно соединение с сервером");
                    outputStream.writeUTF(str);
                    break;
                }else {
                    System.out.println("Сервер" + str);
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}