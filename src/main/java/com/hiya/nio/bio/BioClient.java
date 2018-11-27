package com.hiya.nio.bio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BioClient
{
    public static void main(String[] args)
    {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try
        {
            System.out.println("���ӵ�������" + serverName + " ���˿ںţ�" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Զ��������ַ��" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("��������Ӧ�� " + in.readUTF());
            client.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}