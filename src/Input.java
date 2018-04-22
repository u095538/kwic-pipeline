import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Input
{

    public static void main(String[] args) throws IOException
    {
	Path input =  Paths.get("../", "input.txt");
	List<String> lines = Files.readAllLines(input);
	
	// Get each sentence from standard input
	for (String s : lines)
	{
	    System.out.println(s);
	}

    }
}
