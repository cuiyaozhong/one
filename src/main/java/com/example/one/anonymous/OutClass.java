package com.example.one.anonymous;

/**
 * @author 崔耀中
 * @since 2020-12-19
 */
public class OutClass {

    public InnerClass getInnerClass(final int age,final String name){
        return new InnerClass() {
            int age_ ;
            String name_;
            //构造代码块完成初始化工作
            {
                if(0 < age && age < 200){
                    age_ = age;
                    name_ = name;
                }
            }
            public String getName() {
                return name_;
            }

            public int getAge() {
                return age_;
            }
        };
    }

    public static void main(String[] args) {
        OutClass out = new OutClass();

        InnerClass inner_1 = out.getInnerClass(201, "qinshihuang");
        System.out.println(inner_1.getName());

        InnerClass inner_2 = out.getInnerClass(23, "xiaoqinshihuang");
        System.out.println(inner_2.getName());
    }

}
