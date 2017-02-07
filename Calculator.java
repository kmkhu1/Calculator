public class Calculator
{
    private double memory1;
    private double memory2;
    private double memory3;
    private double screenValue;
    
    public Calculator()
    {
        memory1 = 0;
        memory2 = 0;
        memory3 = 0;
        screenValue = 0;
    }
    
    public void setMemory1(double d)
    {
        memory1 = d;
    }
    
     public void setMemory2(double d)
    {
        memory2 = d;
    }
    
     public void setMemory3(double d)
    {
        memory3 = d;
    }
    
     public void setScreenValue(double d)
    {
        screenValue = d;
    }
    
    public double getMemory1()
    {
        return memory1;
    }
    
    public double getMemory2()
    {
        return memory2;
    }
    
    public double getMemory3()
    {
        return memory3;
    }
    
    public double getScreenValue()
    {
        return screenValue;
    }
    
    public double add(double d)
    {
        return screenValue = screenValue + d;     
    }
    
    public double subtract(double d)
    {
        return screenValue = screenValue - d; 
    }
    
     public double multiply(double d)
    {
        return screenValue = screenValue * d;   
    }
    
     public double divide(double d)
    {
        return screenValue = screenValue / d;    
    }
    
    public void clear()
    {
        screenValue = 0;
        memory1 = 0;
        memory2 = 0;
        memory3 = 0;
    }
    
    public boolean store(int location)
    {
        switch(location)
        {
            case 1: memory1 = screenValue;
                    return true;
            
            case 2: memory2 = screenValue;
                    return true;
            
            case 3: memory3 = screenValue;
                    return true;
            default: return false;
            
        }
    }
    
    public boolean retrieve(int location)
    {
        switch(location)
        {
            case 1: screenValue = memory1;
                return true;
                
            case 2: screenValue = memory2;
                return true;
                
            case 3: screenValue = memory3;
                return true;
            default: return false;
        }
    }
    
    public void sequence()
    {
            if(memory1 < memory2 && memory3 != 0)
            {
                while(memory1 < memory2)
                {
                    memory1 = memory1 + memory3; 
                    System.out.print(memory1 + " ");
                }
            }
            else if(memory1 > memory2 && memory3 != 0)
            {
                while(memory1 > memory2)
                {
                    memory1 = memory1 - memory3; 
                    System.out.print(memory1 + " ");
                }
            }
            else
            {
                System.out.print("The increental/decremental value is 0, the sequence is invalid");
            }
        
    }
}