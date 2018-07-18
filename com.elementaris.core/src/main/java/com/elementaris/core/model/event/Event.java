package com.elementaris.core.model.event;

import java.util.List;

import game.core.model.AbstractPersistentObject;

public abstract class Event extends AbstractPersistentObject {
	private Reward reward;
	private List<Challenge> challenges;

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
