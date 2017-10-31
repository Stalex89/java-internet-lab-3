public enum CarMakers {
	FIAT,
	FORD,
	VOLVO,
	BMW,
	CHRYSLER,
	GM,
	NOTKNOWN;
	
	
	private static CarMakers checkMaker(String maker)
	{
		switch(maker)
		{
		case "FIAT": return FIAT;
		case "FORD": return FORD;
		case "VOLVO": return VOLVO;
		case "BMW": return BMW;
		case "CHRYSLER": return CHRYSLER;
		case "GM": return GM;
		default: return NOTKNOWN;
		}
	}
	
	
	public static CarMakers convertString(String s) 
	{
		String brand = s.toUpperCase();
		CarMakers maker = checkMaker(brand);
		return maker;
	}
	
	public String showMaker(CarMakers maker)
	{
		switch(maker)
		{
		case FIAT:
			return "Fiat";
		case FORD:
			return "Ford";
		case VOLVO:
			return "Volvo";
		case BMW:
			return "BMW";
		case CHRYSLER:
			return "Chrysler";
		case GM:
			return "GM";
		default:
			return "Unknown";
		}
	}
}
