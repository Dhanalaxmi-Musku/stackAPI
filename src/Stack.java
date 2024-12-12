public class Stack <T>{
	private LinkedList<T> list;
    public Stack() {
        list = new LinkedList<>();
    }
    public void push(T item) {
        list.add(item);  
    }
    public int size() {
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
