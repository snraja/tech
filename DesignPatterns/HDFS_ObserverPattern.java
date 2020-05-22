// HDFS_ObserverPattern


	// Publishers + Subscribers = Observer Pattern
	// Publishers are called as SUBJECT and Subscribers as OBSERVERS

// Definition
	// 		The observer pattern defines a one-to-many relationship between objects
	// 	so that when one object changes state, all of its dependents are notified
	// 	and updated automatically

// Design Principle 
	// Strive for loosely coupled designs between objects that interact

public interface Subject 
{
	public void registerObserver(Observer a);
	public void removeObserver(Observer a);
	public void notifyObservers();
}

public interface Observer 
{
	public void update(Object notificationObj);
}

class WeatherMonitor implements Subject
{
	ArrayList<Observer> list;
	public init()
	{
		list =  new ArrayList<Observer>();
	}

	public void registerObserver(Observer a)
	{
		list.add(a)
	}

	public void removeObserver(Observer a)
	{
		list.remove(a)
	}

	public void notifyObservers()
	{
		for(Observer a in list)
		{
			a.update(new Object());//<<Weather Data>>
		}
	}

}

class WeatherDisplay implements Observer
{
	public void update(Object notificationObj)
	{
		// Update the weather data in UI
	}
}
