/**
 * Author:   shitian
 * Date:     2018/5/3 13:50
 * Description:
 */
package com.springinaction.knight;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/5/3
 * @since 1.0.0
 */
public class BraveKnightTest {

    @Test
    public void KnigthQuestTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight/SpringKnight.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }

    public static void main(String[] args){
        String temp = "com.rocky.shtiian.test";
        temp = temp.replaceAll("\\.", "/");
        System.out.println(temp);
    }
}
