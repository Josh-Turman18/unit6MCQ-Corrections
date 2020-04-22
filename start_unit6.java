/**
 * Runs each of the questions missed for question 6
 *
 * @ Josh Turman
 * @ 1.0
 */
public class start_unit6
{
    /**
     * Constructor for objects of class Start
     */
    public start_unit6()
    {
        
    }
    
    public static void main(String [] args)
    {
        System.out.print('\u000C');
        begin();
    }
    
    public void begin()
    {
       System.out.println("Unit 6 Corrections: ");
        
       Question6 question6_solution = new Question6();
       
       question6_solution.go();
    }    
}
