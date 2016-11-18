
public class Tester {

	public static void main(String[] args) {
		int []aa=new int[]{1,4,4,2,1,9,2,0,3,5};
		ArrayMethods things=new ArrayMethods(aa);
		//things.swapFirstAndLast();
		//things.shiftRight();
		//things.replaceC();
		//things.methodD();
		//things.removal();
		things.duplicateElement();		
		for (int z=0;z<aa.length;z++)
		{
			System.out.print(aa[z]+" ");
		}

	}

}
