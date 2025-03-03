/*
 * Copyright (c) 2017
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
 */

package jsettlers.main.android.core.controls;

import jsettlers.common.player.IInGamePlayer;
import jsettlers.graphics.map.MapContent;
import jsettlers.main.android.core.GameManager;

import android.app.Activity;

/**
 * Created by tompr on 13/01/2017.
 */
public class ControlsResolver {
	private final ControlsAdapter controlsAdapter;

	public ControlsResolver(Activity activity) {
		this.controlsAdapter = ((GameManager) activity.getApplication()).getControlsAdapter();
	}

	public ActionControls getActionControls() {
		return controlsAdapter;
	}

	public DrawControls getDrawControls() {
		return controlsAdapter;
	}

	public SelectionControls getSelectionControls() {
		return controlsAdapter;
	}

	public TaskControls getTaskControls() {
		return controlsAdapter;
	}

	public MapContent getMapContent() {
		return controlsAdapter.getMapContent();
	}

	public GameMenu getGameMenu() {
		return controlsAdapter.getGameMenu();
	}

    public PositionControls getPositionControls() {
        return controlsAdapter;
    }

    public IInGamePlayer getPlayer() {
		return controlsAdapter.getInGamePlayer();
	}
}
