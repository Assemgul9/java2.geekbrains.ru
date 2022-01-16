package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {


    public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            try {
                System.out.println("Сервер: запущен");
                Socket client = serverSocket.accept();
                System.out.println("Клиент подключился" + client.getRemoteSocketAddress());

                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());

                Thread thread = new Thread(() -> {

                    try {

                        while (true) {
                            out.writeUTF(scanner.nextLine());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });

                thread.setDaemon(true);
                thread.start();

                while (true) {
                    String str = in.readUTF();

                    if (str.equals("/close")) {
                        out.writeUTF(str);
                        System.out.println("Клиент закрыл соединение");
                        client.close();
                        break;
                    } else {
                        System.out.println("Клиент: " + str);
                    }

                }

            } finally {

                serverSocket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }






    }

}
