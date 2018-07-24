package com.elementaris.model.event;

import java.util.List;

public abstract class Event {
	private long id;
	private Reward reward;
	private List<Challenge> challenges;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public List<Challenge> getChallenges() {
		return challenges;
	}

	public void setChallenges(List<Challenge> challenges) {
		this.challenges = challenges;
	}

}
