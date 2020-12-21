package com.example.one.anonymous;

/**
 * @author 崔耀中
 * @since 2020-12-19
 */

public class Test {

    public void test(Dog dog){
        System.out.println(dog.getName() + "能吃" + dog.eat() + "斤");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test(new Dog() {
            public String getName(){
                return "哈士奇";
            }
            public int eat(){
                return 3;
            }
        });
    }
}
