
public class ArrayMethods {
	private int [] values;

public ArrayMethods(int [] intitial)
{
	values=intitial;   
}
public void swapFirstAndLast()
{
	int jj[]=values;
	int len=values.length;
	values[0]=values[len-1];
	values[len-1]=jj[0];
}
public int [] shiftRight()
{
	int nel=values.length;
	for (int m=0; m<values.length;m++)
	{
		if (m==nel-1)
		{
			values[0]=values[m];
			break;
		}
		else
		{
			values[m+1]=values[m];
			continue;
		}
	}
	return values;
}

public void replaceC()
{
	for (int n=0;n<values.length;n++)
	{
		if(values[n]%2==0)
		{
		values[n]=0;
		}
		else
		{
			continue;
		}
	}		
}	
public void methodD()
{
	for(int j=1;j<values.length-1;j++)
	{
		if (values[j-1]>values[j+1])
		{
			values[j]=values[j-1];
		}
		else if (values[j+1]>values[j-1])
		{
			values[j]=values[j+1];
		}
		else
		{
			break;
		}
	}
}
public void removal()
{
	int len1=values.length;
	if ((len1)%2==0)
	{
		values[(len1-1)/2]=0;
		values[(len1-1)/2 + 1]=0;
	}
	else 
	{
		values[((len1-1)/2)+1]=0;
	}

}
public void moveEvens()
{
	int []abcd=values;
	for (int xyz=0;xyz<abcd.length;xyz++)
	{
		if (abcd[xyz]%2==0)
		{
			values[0+xyz]=abcd[xyz];
			continue;
		}
		else 
		{
			continue;
		}
	}
}
public int secondLargestValue()
{
	int a=0;
	int b=0;
	/*int vv[]=values;
	for (int p=0;p<vv.length;p++)
	{
		if (vv[p]>vv[p+1])
		{
			 a=vv[p];
			 continue;
		}
		else
		{
			b=vv[p+1];
			continue;
		}
	}*/
	
	for (int w=0;w<values.length-1;w++)
	{
		if (values[w]>values[w+1])
		{
			a=values[w];
		}
		else {b=values[w+1];}
		
	}
	if (a>b)
	{
		return b;
	}
	else if(b>a)
	{
		return a;
	}

}
public boolean increasingOrder(int aaa[])
{
	aaa=values;
	boolean zzz=false;
	for (int i=0;i<aaa.length;i++)
	{
		if (aaa[i]<aaa[i+1])
		{
			zzz=true;
		}
		else
		{
			zzz=false;
		}
	}
	return zzz;
}


public boolean adjacentDuplicate(int yyy[])
{
	yyy=values;
	boolean aaa=false;
	for (int k=0; k<yyy.length;k++)
	{
		if (yyy[k]==yyy[k+1])
		{
			aaa=true;
			break;
		}
		else
		{
			continue;
		}
	}
	return aaa;
}



public boolean duplicateElement()//int zzz[]
{
	//zzz=values;
	boolean bbb=false;
	for (int m=0;m<values.length;m++)
	{
		for (int n=0;n<values.length;n++)
		{
			if(values[m]==values[n])
			{
				bbb=true;
				
			}
			else
			{
				continue;
			}
		}
	}
	return bbb;
}



}




