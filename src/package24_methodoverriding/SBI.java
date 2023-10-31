package package24_methodoverriding;

//Creating child classes
class SBI extends Bank
{
    @Override
    public int getRateOfInterest()
    {
        return 8;
    }

}
