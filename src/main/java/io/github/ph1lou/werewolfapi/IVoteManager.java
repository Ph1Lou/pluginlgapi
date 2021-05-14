package io.github.ph1lou.werewolfapi;

import io.github.ph1lou.werewolfapi.enums.VoteStatus;

import java.util.Map;

public interface IVoteManager {

    /**
     * allows to set a vote for a specified playerWW
     * @param voterWW the player you want to set a vote
     * @param voteWW the player voted
     */
    void setUnVote(IPlayerWW voterWW, IPlayerWW voteWW);

    /**
     * reset votes, voters and the vote status
     */
    void resetVote();

    /**
     * allows to show votes to a specified playerWW
     * @param playerWW the specified playerWW
     */
    void seeVote(IPlayerWW playerWW);

    /**
     * allows to know how many votes have a playerWW
     * @return a map containing the amount of votes (value) depending of the playerWW (key)
     */
    Map<IPlayerWW,Integer> getVotes();

    /**
     * allows to know the playerWW voted by a specified player
     * @return a map containing the voted playerWW (value) depending of the playerWW (key)
     */
    Map<IPlayerWW, IPlayerWW> getPlayerVotes();

    /**
     * allows to know which playerWW has been voted the most
     * @return the instance of the specified playerWW
     */
    IPlayerWW getResult();

    /**
     * send to all playersWW the specified playerWW as the result of the vote and remove him 5 max hearts that he will
     * recover in max 6200 ticks
     * @param playerVoteWW the specified player
     */
    void showResultVote(IPlayerWW playerVoteWW);

    /**
     * return true if the current vote status match the specified
     * @param status the specified status
     * @return boolean
     */
    boolean isStatus(VoteStatus status);

    /**
     * change the current vote status with the specified
     * @param status the specified status
     */
    void setStatus (VoteStatus status);

}
