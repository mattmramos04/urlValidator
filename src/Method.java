import java.util.Scanner;

public class Method
{
    public static void main(String[] args)
    {
        //set up instance variables
        String myURL = "";
        Scanner urlScan;
        Scanner keyboard = new Scanner (System.in);

        //get input from user
        System.out.println("Enter a URL to dissect: ");
        myURL = keyboard.nextLine();

        //Test Scanner
    //    System.out.println("You entered " + myURL);
        urlScan = new Scanner(myURL);



        //Loop through the URL pieces
      while(urlScan.hasNext())
      {
          urlScan.useDelimiter("/");
          System.out.println("\t" + urlScan.next());
      }
    }

}
