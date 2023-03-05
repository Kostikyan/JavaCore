package bookExamples.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {

    @ExampleAnnotation(val = "value", a = 12121)
    public void myMethod() {
        System.out.println("hello");
    }

    @ExampleAnnotation(val = "value", a = 1221212)
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMain annotationMain = new AnnotationMain();
        Method[] methods = annotationMain.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method name is: " + method.getName());
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation instanceof ExampleAnnotation){
                    System.out.println("our ExampleAnnotation is present");
                }
            }
        }
    }
}
