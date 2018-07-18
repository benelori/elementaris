package game.core.model;

public class AbstractPersistentObject implements PersistentObject{
	private long id;
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

}
