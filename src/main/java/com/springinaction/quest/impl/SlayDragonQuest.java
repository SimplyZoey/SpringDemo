/**
 * Author:   shitian
 * Date:     2018/5/3 13:47
 * Description: 屠龙任务
 */
package com.springinaction.quest.impl;

import com.springinaction.quest.Quest;

/**
 * 〈屠龙任务〉
 *
 * @author shitian
 * @create 2018/5/3
 * @since 1.0.0
 */
public class SlayDragonQuest implements Quest{

    @Override
    public void embark() {
        System.out.println("开始执行屠龙任务......");
    }
}
