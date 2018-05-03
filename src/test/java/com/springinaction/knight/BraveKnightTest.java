/**
 * Author:   shitian
 * Date:     2018/5/3 13:50
 * Description:
 */
package com.springinaction.knight;

import com.springinaction.knight.impl.BraveKnight;
import com.springinaction.quest.Quest;
import com.springinaction.quest.impl.SlayDragonQuest;
import org.junit.Test;

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
        Quest quest = new SlayDragonQuest();
        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
    }
}
