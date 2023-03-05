package bookExamples.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface ExampleAnnotation {
    String val();
    int a();
}
