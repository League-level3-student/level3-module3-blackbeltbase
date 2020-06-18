package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		//multiplication bonus of half the growthRate 

		return population*growthRate*(growthRate/2);
	}
	
}
