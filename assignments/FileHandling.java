//WAP to Create a File

import java.io.*;
public class FileHandling
{
public static void main(String args[])
{

File myFile=new File(MYFILE.txt);
try
{
myFile.createNewFile();
}
catch(Exeption e)
{
System.out.println("Unable your file");
}
}
}