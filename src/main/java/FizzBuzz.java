
public class FizzBuzz {
    public static String getnum(int i) {

        if (i%3 == 0&&i%5==0)
            return "FizzBuzz";
        else if (i%3==0&&i%7==0)return "FizzKiss";
      else if (i%3 == 0)
            return "Fizz";
      else if (i%5==0)
          return  "Buzz";
      else if (i%7==0)
          return "Kiss";
        else
            return ""+i;
    }
    /*
    String s ="";
    if(i%5!=0 && i%5!=0 && i%7!=0) return i+"";
    if(i%3==0) s ="Fizz";
    if(i%5==0) s += "Buzz";
    if(i%7==0) s += "Kiss";
     */

}
