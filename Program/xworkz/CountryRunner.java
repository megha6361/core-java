class CountryRunner
{
public static void main(String[] args)
{
Country country = new Country();
country.setName("India");

State[] states = new State[30];
State state1 = new State();
state1.setName("karnataka");
state1.setChiefMinister("siddaramiah");

states[0] = state1;

country.setStates(states);

System.out.println("Country names and its states");

System.out.println(country.getName());
State[] countryStates = country.getState();
for(int i=0; i<countryStates.length; i++)
{
State state = countryStates[i];
if(state != null)
{
System.out.println(state.getName());
}
}
}
} 