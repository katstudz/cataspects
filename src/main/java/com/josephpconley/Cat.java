package com.josephpconley;

/**
 * @author katarzyna
 * @date 17.07.19
 */
public class Cat {
    void meow(){
        privateMeow("koko");
    }

    @HelloAnnotation
    private void privateMeow(String meow){
        System.out.println(meow);
    }
}
