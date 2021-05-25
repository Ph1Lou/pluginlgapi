package io.github.ph1lou.werewolfapi;

import fr.ph1lou.gameapi.IConfiguration;

/**
 * @author Ph1Lou
 */

@SuppressWarnings("unused")

public interface IConfigurationWereWolf extends IConfiguration {

     int getPlayerRequiredVoteEnd();

     void setPlayerRequiredVoteEnd(int player_required_before_voting_ends);

     int getUseOfFlair() ;

     void setUseOfFlair(int useOfFlair);

     int getGoldenAppleParticles() ;

     void setGoldenAppleParticles(int goldenAppleParticles);

     int getDistanceBearTrainer();

     void setDistanceBearTrainer(int distanceBearTrainer);

     int getDistanceFox();

     void setDistanceFox(int distanceFox);

     int getDistanceSuccubus();

     void setDistanceSuccubus(int distanceSuccubus) ;

     int getDistanceAmnesiacLovers();

     void setDistanceAmnesiacLovers(int distanceAmnesiacLovers);

     int getDistanceFlutePlayer();

     void setDistanceFlutePlayer(int distanceAmnesiacLovers);

     int getLoverCount(String key);

     void setLoverCount(String key,int value);

     void addOneLover(String key);

     void removeOneLover(String key);

     int getWereWolfChatMaxMessage();

     void setWereWolfChatMaxMessage(int nbMessage);

     int getDistanceSister();

     void setDistanceSister(int distance);

     int getDistancePriestess();

     void setDistancePriestess(int distance);

     int getDistanceAvengerWerewolf();

     void setDistanceAvengerWerewolf(int distance);

     boolean isTrollLover();

     void setTrollLover(boolean troll);
     
     void setWitchAutoResurrection(boolean autoRez);

     boolean isWitchAutoResurrection();

     void setSeerEveryOtherDay(boolean everyOtherDay);

     boolean isSeerEveryOtherDay();

     void setDetectiveEveryOtherDay(boolean everyOtherDay);

     boolean isDetectiveEveryOtherDay();

     void setOracleEveryOtherDay(boolean everyOtherDay);

     boolean isOracleEveryOtherDay();

     void setSweetAngel(boolean sweet);

     boolean isSweetAngel();

}
