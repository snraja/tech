// compile: javac Fibonacci.java
// run: java Fibonacci 12
// Output :
// Time taken 609 nano seconds
// Febonacci of 12 is 144
//

public class Fibonacci
{
	static long fib(int num)
	{
		long start = System.nanoTime();
		long lastBefore = 0;
		long last = 1;
		long now = last + lastBefore;
		for(int i=2;i<=num;i++)
		{
			now = last + lastBefore;
			lastBefore = last;
			last = now;
		}

		long end = System.nanoTime();
		System.out.println("Time taken " + (end - start) + " nano seconds");
		return now;
	}

	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("No arguments");
			return;
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("Febonacci of "+ num + " is "+ Fibonacci.fib(num));
	}
}