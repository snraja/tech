// Head First Design Patterns

// Chapter 1 - Strategy Pattern (Also called as Policy Pattern)

// Design Principle
// 		Identify the aspects of the application that vary 
//		and separate them from what stays the same

// Design Principle
//		Program to an interface, not an implementation

// Design Principle
// 		Favour composition over inheritance


// Definition:
// 		The strategy pattern defines a family of algorithms, encapsulates each one,
//	 	and makes them interchangeable. Strategy lets the algorithm vary independently
//		from clients that use it


interface Strategy
{
	public void doOperation(int num1, int num2);
}

class OperationAdd implements Strategy
{
	public void doOperation(int num1, int num2)
	{
		System.out.printf("Operation Add :: %d + %d is %d \n", num1, num2, num1 + num2);

	}
}

class OperationMinus implements Strategy
{
	public void doOperation(int num1, int num2)
	{
		System.out.printf("Operation Minus :: %d - %d is %d \n", num1, num2, num1 - num2);
	}
}

class OperationMultiply implements Strategy
{
	public void doOperation(int num1, int num2)
	{
		System.out.printf("Operation Multiply :: %d * %d is %d \n", num1, num2, num1 * num2);
	}
}

class Context
{
	private Strategy strategy;

	public Context(Strategy stgy)
	{
		this.strategy = stgy;
	}

	public void executeStrategy(int n1, int n2)
	{
		strategy.doOperation(n1,n2);
	}

}


class StrategyPatternDemo
{
	public static void main(String[] args) 
	{
		Context context = new Context(new OperationAdd());
		context.executeStrategy(12, 24);

		context = new Context(new OperationMinus());
		context.executeStrategy(40, 25);

		context = new Context(new OperationMultiply());
		context.executeStrategy(23, 32);
	}
}






