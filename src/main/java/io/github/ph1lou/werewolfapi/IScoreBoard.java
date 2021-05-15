package io.github.ph1lou.werewolfapi;

public interface IScoreBoard {

    /**
     * get the amount of roles
     * @return an int
     */
    int getRole();

    /**
     * Set the amount of roles
     * @param role the new amount of roles
     */
    void setRole(int role);

    /**
     * post-increment the timer
     */
    void addTimer();

    /**
     * get the amount of players
     * @return an int
     */
    int getPlayerSize();

    /**
     * decrement the player size
     */
    void removePlayerSize();

    /**
     * post-increment the player size
     */
    void addPlayerSize();

    /**
     * get the group size
     * @return an int
     */
    int getGroup();

    /**
     * set the group size
     * @param group the new group size
     */
    void setGroup(int group);

    /**
     * generate kill scoreboard
     */
    void getKillCounter();

    /**
     * get the timer value
     * @return an int
     */
    int getTimer();

    /**
     * update the scoreboard for all playersWW
     */
    void updateBoard();

}
