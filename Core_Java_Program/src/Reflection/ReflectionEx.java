package Reflection;

import java.lang.reflect.*;

public class ReflectionEx {
    public static void main(String[] args) throws ClassNotFoundException {
        // Get the class object using reflection
        Class<?> clazz = Class.forName("java.util.ArrayList");

        // Print class name
        System.out.println("Class Name: " + clazz.getName());

        // Print superclass name
        System.out.println("Superclass Name: " + clazz.getSuperclass().getName());

        // Print implemented interfaces
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println("Implemented Interfaces:");
        for (Class<?> iface : interfaces) {
            System.out.println("- " + iface.getName());
        }

        // Print constructors
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println("- " + constructor);
        }

        // Print methods
        Method[] methods = clazz.getMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("- " + method);
        }

        // Print fields
        Field[] fields = clazz.getFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("- " + field);
        }
    }
}
