class Country
{
private String name;
private int numberOfStates;
private State[] states;
private String primeMinister;

public void setName(String name)
{
this.name = name;
}
public String getName()
{
return name;
}
public void setStates(State[] states)
{
this.states = states;
}
public State[] getState()
{
return states;
}
public void setprimeMinister(String name)
{
	primeMinister = name;
}
public String getprimeMinister()
{
	return primeMinister;
}
}