import java.util.*;
public class WhackAMole 
{
	int score, molesLeft=10,  attemptsLeft, totalAttempts;
	char[][] moleGrid;
	WhackAMole(int numAttempts, int gridDimension)
	{
		attemptsLeft=numAttempts;
		moleGrid=new char[gridDimension][gridDimension];
	}
	boolean place(int x, int y)
	{
		int i,j;
		for(i=0;i<moleGrid.length;i++)
		{
			for(j=0;j<moleGrid[i].length;j++)
			{
				if(x==i&& y==j)
				{
					//moleGrid[x][y]='M';
					return true;
				}
			}
		}
		return false;
	}
	void whack(int x, int y)
	{
		if(place(x,y))
		{
			moleGrid[x][y]='W';
			score++;
			molesLeft--;
		}
		else
		{
			moleGrid[x][y]='*';
		}
		attemptsLeft--;
	}
	void printGridToUser()
	{
		for(int i=0;i<moleGrid.length;i++)
		{
			for(int j=0;j<moleGrid[i].length;j++)
			{
				if(moleGrid[i][j]=='M'||moleGrid[i][j]!='W')
				{
					System.out.print("*");
					
				}
				else
				{
				
					System.out.print(moleGrid[i][j]);
				}
			}
			System.out.println();
		}
	}
	void printGrid()
	{
		for(int i=0;i<moleGrid.length;i++)
		{
			for(int j=0;j<moleGrid[i].length;j++)
			{
				if(moleGrid[i][j]=='W'||moleGrid[i][j]=='M')
				{
					System.out.print(moleGrid[i][j]);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		WhackAMole play= new WhackAMole(50,10);
		//System.out.print(play.attemptsLeft+" "+ play.molesLeft);
		Random r=new Random();
		int min=0, max=10, x, y;
		for(int i=0;i<10;i++)
		{
			play.moleGrid[r.nextInt(max-min)+min][r.nextInt(max-min)+min]='M';
		}
		while(play.attemptsLeft>0 && play.molesLeft>0)
		{
			System.out.println("Enter coordinates to take a whack, you only have 50 attempts");
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==-1 && y==-1)
			{
				break;
			}
			play.whack(x,y);
			play.printGridToUser();
		}
		play.printGrid();
		
	}
	
}
