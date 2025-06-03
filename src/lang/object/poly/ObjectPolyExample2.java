package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};
//        위 코드는 아래와 같은 코드
//        Object[] objects = new Object[3];
//        objects[0] = dog;
//        objects[1] = car;
//        objects[2] = object;

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }

}
