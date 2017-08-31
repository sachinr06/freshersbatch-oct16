package collectionpackage;

 class GenericWrapper<T> {       
	private T t;   
	public void set(T t)
	{ 
		this.t = t;
	}   
	public T get() 
     { 
		return t; 
		}
	} 

	 

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericWrapper<Integer> wrap= new GenericWrapper<Integer>(); 
		wrap.set(12); 
		int x = wrap.get(); 
		System.out.println("x: "+x);
		 
	}

}
