/*******************************************************************************
 * Copyright (c) 2015 - 2018
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.mapcreator.data.objects;

import jsettlers.common.buildings.EBuildingType;
import jsettlers.common.material.EMaterialType;
import jsettlers.common.movable.EDirection;
import jsettlers.common.movable.EMovableAction;
import jsettlers.common.movable.EMovableType;
import jsettlers.common.movable.IMovable;
import jsettlers.common.player.IPlayer;
import jsettlers.common.position.RelativePoint;
import jsettlers.common.position.ShortPoint2D;
import jsettlers.common.selectable.ESelectionType;
import jsettlers.logic.map.loading.data.objects.MapDataObject;
import jsettlers.logic.map.loading.data.objects.MovableObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovableObjectContainer implements ObjectContainer, IMovable {

	private final MovableObject movableObject;
	private final ShortPoint2D position;
	private final IPlayer.DummyPlayer player;

	public MovableObjectContainer(MovableObject movableObject, int x, int y) {
		this.movableObject = movableObject;
		this.position = new ShortPoint2D(x, y);
		this.player = new IPlayer.DummyPlayer(movableObject.getPlayerId());
	}

	@Override
	public MapDataObject getMapObject() {
		return movableObject;
	}

	@Override
	public IPlayer getPlayer() {
		return player;
	}

	@Override
	public boolean isSelected() {
		return false;
	}

	@Override
	public void setSelected(boolean selected) {
	}

	@Override
	public void stopOrStartWorking(boolean stop) {
	}

	@Override
	public List<IMovable> getPassengers() {
		return Collections.emptyList();
	}

	@Override
	public int getNumberOfCargoStacks() {
		return 0;
	}

	@Override
	public EMaterialType getCargoType(int stack) {
		return null;
	}

	@Override
	public int getCargoCount(int stack) {
		return 0;
	}

	@Override
	public EBuildingType getGarrisonedBuildingType() {
		return null;
	}

	@Override
	public EMovableType getMovableType() {
		return movableObject.getType();
	}

	@Override
	public EMovableAction getAction() {
		return EMovableAction.NO_ACTION;
	}

	@Override
	public EDirection getDirection() {
		return EDirection.SOUTH_WEST;
	}

	@Override
	public float getMoveProgress() {
		return 0;
	}

	@Override
	public EMaterialType getMaterial() {
		return EMaterialType.NO_MATERIAL;
	}

	@Override
	public float getHealth() {
		return 1;
	}

	@Override
	public boolean isAlive() {
		return true;
	}

	@Override
	public boolean isRightstep() {
		return false;
	}

	@Override
	public RelativePoint[] getProtectedArea() {
		return new RelativePoint[] { new RelativePoint(0, 0) };
	}

	@Override
	public void setSoundPlayed() {
	}

	@Override
	public boolean isSoundPlayed() {
		return true;
	}

	@Override
	public ESelectionType getSelectionType() {
		return ESelectionType.PEOPLE;
	}

	@Override
	public int getID() {
		return 0;
	}

	@Override
	public ShortPoint2D getPosition() {
		return position;
	}
}
