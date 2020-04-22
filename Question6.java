/**
 * Runs Question 6 and explains the solutions
 *
 * @Josh Turman
 * @1.0
 */
public class Question6
{

    /**
     * Constructor for objects of class Question6
     */
    public Question6()
    {

    }

    public void go()
    {
        System.out.println("\nQuestion 6: ");
        int i;
        
        String [] fruits = {"apples", "bananas", "cherries", "dates"};
        
        //option 1 - OUT OF BOUNDS ERROR----CORRECT ANSWER
        for (i = 0; i <= fruits.length; i++) // to fix this we would need to change fruits.length to fruit.length - 1
        {
            System.out.println(fruits[i]);
        }
        
        //option 2 - no out of bounds error
        for (i = 0; i <= fruits.length - 1; i++)
        {
            System.out.println(fruits[i]);
        }
        
        //option 3 - no out of bounds error
        for (i = 1; i <= fruits.length; i++)
        {
            System.out.println(fruits[i - 1]);
        }
        
        System.out.println("Since the only option to fail is option one\nthe correct answer is A");
    }
}
