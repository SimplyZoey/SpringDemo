/**
 * Author:   shitian
 * Date:     2018/5/8 15:41
 * Description:
 */
package com.springinaction.dessert.impl;

import com.springinaction.annotation.Cream;
import com.springinaction.dessert.Dessert;
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
@Qualifier("cold")
@Cream
public class IceCream implements Dessert {
    @Override
    public void makeDessert() {
        System.out.println("Make IceCream.....");
    }
}
