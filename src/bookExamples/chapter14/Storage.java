package bookExamples.chapter14;

public class Storage<T> {

    Object[] objects = new Object[10];
    int size;

    public void add(T student){
        if(size == objects.length){
            extend();
        }
        objects[size++] = student;
    }

    public T getByIndex(int index){
        return (T) objects[index];
    }

    private void extend(){
        Object[] tmp = new Object[objects.length + 10];
        System.arraycopy(objects, 0, tmp, 0 , size);
        objects = tmp;
    }

    public void print(){
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
