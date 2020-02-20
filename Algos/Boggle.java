// compile: javac Boggle.java
// run: java Boggle
// Output :
//
//

import java.util.*;

public class Boggle
{
	HashSet<String> dictionary;

	static char[][] boggle = {	{'G','I','Z'}, 
								{'U','E','K'}, 
								{'Q','S','E'}};

	static int M = 3, N = 3;	// M = Row Index, N = Column Index
	static int[][] visited;

	public Boggle() 
	{
		dictionary =  new HashSet<String>();
		dictionary.add("GEEKS");
		dictionary.add("FOR");
		dictionary.add("QUIZ");
		dictionary.add("GIZKEUQSE");
		dictionary.add("GIZKEUQS");
		dictionary.add("GUQSEIZKE");
		dictionary.add("GUQSEIZK");
		dictionary.add("GUQSEIZ");
		dictionary.add("GUQSEI");
		dictionary.add("GUQSE");
		dictionary.add("GUQS");
		dictionary.add("GUQ");
	}

	void findMatches(int iC, int jC, String intialStr)
	{
		visited = new int[M][N];

		for(int i=0;i<M;i++) 
		{
			for(int j=0;j<N;j++) 
			{
				visited[i][j] = 0;
			}
		}

		findWord(iC,jC, intialStr);

	}


	void findWord(int iIndex, int jIndex, String str)
	{
		str = str + boggle[iIndex][jIndex];

		//System.out.println("For Word::::"+str);

		if(hasWord(str)) 
		{
			System.out.println("Found Match : " + str);
		}


		visited[iIndex][jIndex] = 1;
		
		// Find for its neighbours
		for(int row = iIndex - 1; row <= iIndex + 1 ;row ++)
		{
			for(int col = jIndex -1; col <= jIndex + 1; col++)
			{
				if(row >= 0 && col >= 0 && row < M && col < N && visited[row][col] == 0)
				{
					findWord(row, col, str);
				}
			}
		}

		visited[iIndex][jIndex] = 0;


	}

	boolean hasWord(String str) {
		return dictionary.contains(str);
	}

	public static void main(String args[])
    {
        System.out.println("Boggle Search Begin");
        Boggle b = new Boggle();

        for(int i=0;i<M;i++) 
		{
			for(int j=0;j<N;j++) 
			{
        		b.findMatches(i,j, "");
        	}
        }
        System.out.println("Boggle Search End");

    }
}