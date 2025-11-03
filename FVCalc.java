// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate / 100), years);
		int currentValueint = (int) currentValue;
		System.out.println("After "+years+ " years, $"+currentValueint+" saved at "+rate+"% will yield $" + (int)futureValue);


		
	}
}