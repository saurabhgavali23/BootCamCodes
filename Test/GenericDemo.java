package Test;

public class GenericDemo<A> {
	
		A obj;
	
		GenericDemo (A obj)
		{
			this.obj=obj;
		}
		
		A getObj()
		{
			return this.obj;
		}
		
		public static void main(String[] args) {
			
			GenericDemo <Integer> obj=new GenericDemo <Integer>(16);
			System.out.println(obj.getClass().getName()+" "+obj.getObj());
		}
}
