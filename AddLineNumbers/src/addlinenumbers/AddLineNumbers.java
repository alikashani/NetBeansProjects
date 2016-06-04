package addlinenumbers;

import java.io.*;
import java.util.Scanner;

public class AddLineNumbers
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner scanner = new Scanner(new FileReader("dataInput.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("dataOutput.txt"));
        try
        {
            int count = 1;  
            String str = "";
            while (scanner.hasNextLine())
            {
                str += count++;
                str += "   ";
                str += scanner.nextLine();
                str += "\n";   
            }
            writer.write(str);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            scanner.close();
            writer.close();
        }
    }
}
