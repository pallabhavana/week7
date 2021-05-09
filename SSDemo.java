import java.util.*;
import java.io.*;
import java.net.*;
class SSDemo
{
public static void main(String args[])
{
try
{
int port = Integer.parseInt(args[1]);
Random random = new Random();
ServerSocket ss = new ServerSocket(port);
while(true)
{
Socket s = ss.accept();
OutputStream os = s.getOutputStream();
DataOutputStream dos = new DataOutputStream(os);
int k = random.nextInt();
System.out.println(k);
dos.writeInt(k);
s.close();
}
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}