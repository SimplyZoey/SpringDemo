/**
 * Author:   shitian
 * Date:     2018/5/8 15:42
 * Description:
 */
package com.springinaction.dessert.impl;

import com.springinaction.dessert.Dessert;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/5/8
 * @since 1.0.0
 */
@Component
public class Cookies implements Dessert {

    @Override
    public void makeDessert() {
        System.out.println("Make Cookies.....");
    }
}
