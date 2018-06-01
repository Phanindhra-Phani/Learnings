import java.util.Iterator;


public class FilteringIterator<E> implements Iterator<E> {

	Iterator<E> myIterator;
	IObjectTest myTest;
	E  obj;
	
	public FilteringIterator(Iterator<E> iteratorTest, IObjectTest iObjectTest) {
		super();
		this.myIterator = iteratorTest;
		this.myTest = iObjectTest;
	}

	@Override
	public boolean hasNext() {
		boolean flag = false;
		while(myIterator.hasNext()){
			flag = false;
			obj = myIterator.next();
			if(myTest.test(obj)){
				flag=true;
				break;
			}
		}
		return flag;
	}

	@Override
	public E next() {
		return obj;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
