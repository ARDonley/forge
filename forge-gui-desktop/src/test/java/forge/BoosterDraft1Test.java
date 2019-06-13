package forge;

import forge.deck.CardPool;
import forge.limited.BoosterDraft;
import forge.limited.LimitedPoolType;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
@Test(groups = { "UnitTest" }, timeOut = 1000, enabled = false)
public class BoosterDraft1Test {

    /**
     * Booster draft_1 test1.
     *
     */
    @Test(groups = { "UnitTest", "fast" }, timeOut = 1000, enabled = false)
    public void boosterDraft1Test1() {
        final BoosterDraft draft = BoosterDraft.createDraft(LimitedPoolType.Full);
        if (draft == null) { return; }

        while (draft.hasNextChoice()) {
            final CardPool list = draft.nextChoice();
            System.out.println(list.countAll());
            draft.setChoice(list.toFlatList().get(0));
        }
    }
}
