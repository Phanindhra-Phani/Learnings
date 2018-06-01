
public class IObjectImpl implements IObjectTest {

	@Override
	public boolean test(Object o) {
		
		if (o instanceof Integer) {
			Integer intValue = (Integer) o;
			
			if(intValue%6 == 0){
				return true;
			}
		}
		return false;
	}

}
