package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.Comparator;

public class BlackjackComparator implements Comparator<Hand<Card>> {


  @Override
  public int compare(Hand<Card> hand1, Hand<Card> hand2) {
    return 0; //TODO (consider helped method that computes value for a hand then compare 2 hands)
    // Rules:
    // BJ vs BJ ties & bust vs bust ties
    // 2 card 21 beats more than 2 card 21
    // over 21 looses
    // zero cards beats a bust
    // ace can be 1 or 11 (only one ace can be 1)
  }
}
