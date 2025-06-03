package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class;
//        Class clazz1 = new String().getClass();
//        Class claszz2= Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
