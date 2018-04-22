import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Output
{

    public static void main(String[] args) throws FileNotFoundException 
    {
	// collect input lines from stdin
	// and write them out to output.txt
	Scanner in = new Scanner(System.in);
	PrintStream out = new PrintStream("../output.txt");

	while (in.hasNext())
	{
	    out.println(in.nextLine());
	}
	in.close();
	out.close();
    }
}
 