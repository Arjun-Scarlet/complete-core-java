package c_argumentPassing;

public class CmdLineArgs {

	public static void main(String[] args) {
        for(String str:args){
            System.out.println(str);
        }
        //Parsing
        int intSum = 0;
		double doubleSum = 0;
        for(int i=0; i<args.length; i++){
            intSum+=Integer.parseInt(args[i]);
			doubleSum+=Double.parseDouble(args[i]);
        }
        System.out.println("Sum =>"+intSum+" "+doubleSum);
    }   

}
