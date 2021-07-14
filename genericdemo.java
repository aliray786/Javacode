/*class Mygen<T>
{
	 T obj;
	 void add(T obj)
	 {
		 this.obj=obj;
		 
	 }
	 T get()
	 {
		return obj;
	 }

}*/
public class genericdemo {
	public static <E> void print(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inta= {10,20,34,743,28};
		Character[] chara= {'b','a','s','i','k'};
		System.out.println( "Printing Integer Array" );  
        print( inta  );   
       System.out.println( "Printing Character Array" );  
        print( chara );  		

	    

	}

}
