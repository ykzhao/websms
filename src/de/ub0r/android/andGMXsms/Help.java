package de.ub0r.android.andGMXsms;

import android.app.Activity;
import android.os.Bundle;

/**
 * Simple Activity to open "help".
 * 
 * @author flx
 */
public class Help extends Activity {
	/**
	 * called on create.
	 * 
	 * @param savedInstanceState
	 *            default param
	 */
	@Override
	public final void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.help);
	}
}
