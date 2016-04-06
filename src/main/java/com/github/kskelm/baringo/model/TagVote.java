/**
 * voting information about a tag
 */
package com.github.kskelm.baringo.model;

import com.github.kskelm.baringo.util.Utils;
import com.google.gson.annotations.SerializedName;

/**
 * @author kskelm
 *
 */

public class TagVote {

	@Override
	public String toString() {
		return Utils.toString( this );
	}

	
	/**
	 * Returns the tag string
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	
	/**
	 * Returns the userName of the user
	 * that first created the tag
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Returns the total number of up votes for the tag
	 * @return the ups
	 */
	public int getUps() {
		return ups;
	}
	/**
	 * Returns the total number of down votes for the tag
	 * @return the downs
	 */
	public int getDowns() {
		return downs;
	}

	
	// =============================================
	
	@SerializedName("name")
	private String tag;
	@SerializedName("author")
	private String userName;
	private int ups;
	private int downs;

}
