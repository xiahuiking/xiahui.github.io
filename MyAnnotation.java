import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//属性的返回值类型必须是以下几种：
//        基本数据类型
//        String类型
//        枚举类型
//        注解
//        以上类型的数组
//        在这里不能有void的无返回值类型和以上类型以外的类型
//@Retention
//        RetentionPolicy.SOURCE：
//        注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
//        RetentionPolicy.CLASS：
//        注解只被保留到编译进行时的class文件，
//        但 JVM 加载class文件时候被遗弃，
//        也就是在这个阶段不会读取到该class文件。
//        RetentionPolicy.RUNTIME（常用：
//        注解可以保留到程序运行的时候，
//        它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
//        CONSTRUCTOR:用于描述构造器
//@Target
//        FIELD（常用:用于描述属性
//        LOCAL_VARIABLE:用于描述局部变量
//        METHOD（常用）:用于描述方法
//        PACKAGE:用于描述包
//        PARAMETER:用于描述参数
//        TYPE（常用）:用于描述类、接口(包括注解类型) 或enum声明
//        ANNOTATION_TYPE:用于描述注解类型
//        TYPE_USE:用于描述使用类型

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String value() default "hi";
}
