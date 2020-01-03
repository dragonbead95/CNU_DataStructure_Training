import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {
	public void run(String file)
	{
		int words = 0, chars = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			
			while(line != null)
			{
				StringTokenizer parser = new StringTokenizer(line, " ");
								
				while(parser.hasMoreTokens())
				{
					++words;
					String word = parser.nextToken();
					chars = chars + word.length();
				}
				line = in.readLine();
			}
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("words: " + words);
		System.out.println("characters : " + chars);
	}
}
