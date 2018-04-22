import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Alphabetise
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	ArrayList<String> sentences = new ArrayList<>();

	// Get each sentence from standard input
	while (in.hasNext())
	{
	    sentences.add(in.nextLine());
	}
	in.close();

	Collections.sort(sentences);

	for (String sentence : sentences)
	{
	    System.out.println(sentence);
	}
    }
}
