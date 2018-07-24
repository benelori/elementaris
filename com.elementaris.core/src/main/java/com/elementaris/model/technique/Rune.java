package com.elementaris.model.technique;

public class Rune {
	private long id;
	private String name;
	private Technique technique;
	private int scrollsToLearn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Technique getTechnique() {
		return technique;
	}

	public void setTechnique(Technique technique) {
		this.technique = technique;
	}

	public int getScrollsToLearn() {
		return scrollsToLearn;
	}

	public void setScrollsToLearn(int scrollsToLearn) {
		this.scrollsToLearn = scrollsToLearn;
	}

}
