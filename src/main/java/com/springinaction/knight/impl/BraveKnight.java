/**
 * Author:   shitian
 * Date:     2018/5/3 13:45
 * Description:
 */
package com.springinaction.knight.impl;

import com.springinaction.knight.Knight;
import com.springinaction.quest.Quest;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/5/3
 * @since 1.0.0
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
