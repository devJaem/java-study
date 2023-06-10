package com.ohigraffers.section02.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        //포트는 65535까지 이용가능 (8000번 미만은 예약되있는 경우가 많음)
        int port=8500;

        ServerSocket server = new ServerSocket(port);

        while(true){
            Socket client = server.accept();

            InputStream input=client.getInputStream();
            OutputStream output=client.getOutputStream();

            BufferedReader br=new BufferedReader(new InputStreamReader(input));
            PrintWriter pw=new PrintWriter(output);

            while(true){
                String message= br.readLine();

                if(!message.equals("exit")){
                    System.out.println(client.getInetAddress().getHostAddress()+"가 보낸 메세지 : "+message);
                    pw.println("메세지 받기 성공!");
                    pw.flush();
                }else{
                    System.out.println("접속종료");
                    break;
                }
            }

            br.close();
            pw.close();
            client.close();
        }

    }
}
