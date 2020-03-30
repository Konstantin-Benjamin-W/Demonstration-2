public interface Array extends Container {
	void add(Object element);
	void set(int index, Object object);
	Object get(int index);
	int indexOf(Object object);
	void remove(int index);
	//проверяет наличие элемента в коллекции, тру - если есть, фолз - если нет
	boolean contains(Object element);
}
