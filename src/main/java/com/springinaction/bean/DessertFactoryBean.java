/**
 * Author:   shitian
 * Date:     2018/5/8 15:49
 * Description:
 */
package com.springinaction.bean;

import com.springinaction.annotation.Cream;
import com.springinaction.dessert.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/5/8
 * @since 1.0.0
 */
@Component
public class DessertFactoryBean {

    @Autowired
    @Qualifier("cold")     //指定具体的bean，避免ioc有歧义
    @Cream                 //cold有歧义，再次对bean细分
    Dessert dessert;

    public void makeDessert(){
        dessert.makeDessert();
    }
}
