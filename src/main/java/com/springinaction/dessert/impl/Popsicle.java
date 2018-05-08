/**
 * Author:   shitian
 * Date:     2018/5/8 16:01
 * Description: 棒冰，验证多重bean歧义
 */
package com.springinaction.dessert.impl;

import com.springinaction.dessert.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 〈棒冰，验证多重bean歧义〉
 *
 * @author shitian
 * @create 2018/5/8
 * @since 1.0.0
 */
@Component
@Qualifier("cold")
public class Popsicle implements Dessert {

    @Override
    public void makeDessert() {
        System.out.println("Make Popsicle.....");
    }
}
