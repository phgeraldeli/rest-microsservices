package io.quarkus.workshop.superheroes.statistics;

import java.time.Instant;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class FightResult {

    private long id;
    private Instant fightDate;
    private String winnerName;
    private int winnerLevel;
    private String winnerPicture;
    private String loserName;
    private int loserLevel;
    private String loserPicture;
    private String winnerTeam;
    private String loserTeam;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Instant getFightDate() {
		return fightDate;
	}
	public void setFightDate(Instant fightDate) {
		this.fightDate = fightDate;
	}
	public String getWinnerName() {
		return winnerName;
	}
	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}
	public int getWinnerLevel() {
		return winnerLevel;
	}
	public void setWinnerLevel(int winnerLevel) {
		this.winnerLevel = winnerLevel;
	}
	public String getWinnerPicture() {
		return winnerPicture;
	}
	public void setWinnerPicture(String winnerPicture) {
		this.winnerPicture = winnerPicture;
	}
	public String getLoserName() {
		return loserName;
	}
	public void setLoserName(String loserName) {
		this.loserName = loserName;
	}
	public int getLoserLevel() {
		return loserLevel;
	}
	public void setLoserLevel(int loserLevel) {
		this.loserLevel = loserLevel;
	}
	public String getLoserPicture() {
		return loserPicture;
	}
	public void setLoserPicture(String loserPicture) {
		this.loserPicture = loserPicture;
	}
	public String getWinnerTeam() {
		return winnerTeam;
	}
	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}
	public String getLoserTeam() {
		return loserTeam;
	}
	public void setLoserTeam(String loserTeam) {
		this.loserTeam = loserTeam;
	}
}
