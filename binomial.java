import java.io.*;
public class Binomial_expansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = inputInt("Input the number of rows for Pascal's Triangle");
		int x=0;
		if a<5
		{
			for()
			{
				if x=!a
						Math.pow(11, x)
				else 
					output ("that is all")
			x++
			}
		}
		
	}
static void output (String info){
   System.out.println(info);
}
static void output (char info){
   System.out.println(info);
}
static void output (int info){
   System.out.println(info);
}
static void output (double info){

   System.out.println(info);

}
static char inputChar(String prompt){
   char result = (char)0;
   try{
       result = input (prompt).charAt(0);
   }
   catch (Exception e){
       result = 0;
   }
   return result;
}
static String input (String prompt){
   String iput = null;
   System.out.print(prompt + ": ");
   try{
       BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
       iput = is.readLine();
       if (iput.length() == 0) return null;
   }
   catch (IOException e){
       System.out.println("IO Exception: " + e);
   }
   return iput.toLowerCase();
}
static double inputDouble(String prompt){
   double result = 0;
   try{
       result=Double.parseDouble (input(prompt));
   }
   catch (Exception e){
       result = 0;
   }
   return result;
}
static int inputInt(String prompt){
   int result = 0;
   try{
       result = Integer.parseInt(input(prompt));
   }
   catch (Exception e){
       result = 0;
   }
   return result;
}
}

