
public class GenericsDemo<T> {
	
	
	T value;   //T represents any class , not primitive data types
	
	public void show()
	{
		System.out.print(value.getClass().getName());
	}
	
	public static void main(String[] args)
	{
		
		GenericsDemo<Integer> obj = new GenericsDemo<>();
		obj.value=9;
		obj.show();
		GenericsDemo<String> obj2 = new GenericsDemo<>();
		obj2.value="ruchir";
		obj2.show();
		
	}

}
