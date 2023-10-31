package package24_methodoverriding;

//Creating the child class

class ICICI extends Bank
{
    @Override
    public int getRateOfInterest()
    {
        return 7;
    }
}
