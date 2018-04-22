import java.util.ArrayList;
import java.util.Scanner;

public class CircularShift
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	ArrayList<String> sentences = new ArrayList<>();
	ArrayList<String> output = new ArrayList<>();

	// Get each sentence from standard input
	while (in.hasNext())
	{
	    sentences.add(in.nextLine());
	}

	in.close();

	// For each sentence, perform circular shift
	for (String sentence : sentences)
	{
	    // split the sentence into an array of words
	    String words[] = sentence.split("\\s+"); // split on space, "\\s" is
						     // a space, + means 'one
						     // or more spaces'

	    // Now shift and record each shift in output
	    for (int i = 0; i < words.length; i++)
	    {
		String shiftedSentence = "";
		int wordsToTheRight = words.length - i; // words to the right of
							// words[i]
		int wordsToTheLeft = i; // words to the left of words[i]

		for (int j = 0; j < wordsToTheRight; j++)
		{
		    shiftedSentence += words[i + j] + " ";
		}

		for (int j = 0; j < wordsToTheLeft; j++)
		{
		    shiftedSentence += words[j] + " ";
		}

		// commit the new sentence to output
		output.add(shiftedSentence);
	    }
	}

	for (String sentence : output)
	{
	    System.out.println(sentence);
	}
    }

}
