/**
 * Author:   shitian
 * Date:     2018/5/8 15:48
 * Description:
 */
package com.springinaction.dessert;

import com.springinaction.bean.DessertFactoryBean;
import com.springinaction.knight.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/5/8
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dessert/Dessert.xml"})
public class DessertTest {
    @Autowired
    DessertFactoryBean factoryBean;

    @Test
    public void DessertTest(){
        factoryBean.makeDessert();
    }
}
