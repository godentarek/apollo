package org.apollo.game.model.sector;

import org.apollo.game.model.Entity;

/**
 * A class that should be extended by listeners that execute actions when an entity is added or removed from the sector.
 * 
 * @author Major
 */
public abstract class SectorListener {

	/**
	 * Executes the action for this listener.
	 * 
	 * @param The sector that was updated.
	 * @param entity The affected entity.
	 */
	public abstract void execute(Sector sector, Entity entity);

}