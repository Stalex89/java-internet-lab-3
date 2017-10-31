import java.util.ArrayList;

public class MyCar
{
	private double tankCapacity = 40.0;
	//fuel capacity to check how much fuel is in the tank
	private double fuelLevel = 0.00;
	private double fuelConsumption = 5.0;
	private CarMakers maker;
	private double mileage = 0.0;
	private ArrayList<Double> tripDistances = new ArrayList<Double>();
	
	
	private String[] getParams(String s)
	{
		return s.split("[\\;\\t\\_]");	
	}
	
	private double checkCapacity (String param)
	{
		double tankCap = Double.parseDouble(param);
		
		//check conditions
		if(tankCap >= 20.0 && tankCap <= 80.0)
			return tankCap;
		else return 40.0;
	}
	
	private double checkConsumption (String param)
	{
		double fuelCons =  Double.parseDouble(param);
		
		if(fuelCons >=2 && fuelCons <=20)
			return fuelCons;
		else return 5.0;

	}

	public MyCar(String s) 
	{
		//get array of substrings for parameters
		String[] params = getParams(s);
		
		//convert maker string
		CarMakers maker = CarMakers.convertString(params[2]);
		
		//assign parameters with checking
		this.tankCapacity = checkCapacity(params[0]);
		this.fuelConsumption = checkConsumption(params[1]);
		this.maker = maker;
	}
	
	//ASK TEACHER ABOUT THIS FUNCTION (WHAT IS HOWMUCH)
	public boolean tankIt(double howMuch)
	{
		if (howMuch <= tankCapacity)
			return true;
		else return false;
	}
	
	public boolean startTrip(double tripDistance)
	{
		if ((fuelConsumption / 100 * tripDistance) <= fuelLevel)
			return true;
		else return false;
	}
	
	public double getMileage()
	{
		return mileage;
	}
	
	public double getLastTripDistance()
	{
		return tripDistances.get(tripDistances.size()-1);
	}
	
	public double getFuelLevel()
	{
		return fuelLevel;
	}
	
	public String toString() 
	{
		return new String ("( " + CarMakers.showMaker(maker) + ", Total mileage = " + getMileage() + 
				", Last trip distance = " + getLastTripDistance() + ", current fuel level = "
				+ getFuelLevel());
	}
	
	public static void main(String[] args)
	{
	
	}
	
}