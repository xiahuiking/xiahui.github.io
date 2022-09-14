/**
 * 注解的使用
 *  1.jdk的内置注解
 *      实例：
 *      @Override注解
 *      @Deprecated注解：标记过时的方法
 *      @SuppressWarnings注解：压制警告注解
 *  2.如何自定义注解（参考@SuppressWarnings注解）
 *      1.注解声明为@interface。
 *      2.内部定义成员，通常使用value。
 *      3.如果注解体中无任何属性，其本质就是标记注解。
 *      一般会有@Target @Retention 俩个元注解。
 *  3.元注解：元注解就是用来描述注解的注解
 *      @Target 指定被修饰的注解的作用范围
 *      @Retention 指定了被修饰的注解的生命周期
 *      @Documented 指定了被修饰的注解是可以Javadoc等工具文档化
 *      @Inherited 指定了被修饰的注解修饰程序元素的时候是可以被子类继承的
 *
 * @author
 * @date 2022年08月31日 9:33
 */
public class AnnotationTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int num = 10;
    }
}
// 使用自定义注解时需要为其参数赋值。
// 如果使用default关键字给属性默认初始化值，就不需要为其参数赋值，
// 如果赋值的话，就把默认初始化的值覆盖掉了。
@MyAnnotation(value = "hello")
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}

class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}

interface Info{
    void show();
}