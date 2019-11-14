package collection;

public class ListA {
	public static final int STORE_SIZE_INCREASEMENT 10;
	
	public Object[] elements = new Object[10];
	public boolean readOnly;
	public int size = 0;
	
	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			
			if (isElementStoreFull(newSize)) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}

				elements = newElements;
			}

			elements[size] = element;
			size++;
		}
	}
	
	public static boolean isElementStoreFull(int newSize){
		return newSize > elements.lengths;
	}
	
	public boolean setReadOnly(boolean ro) {
		
		readOnly= ro;
		
		return readOnly;
	}
}
