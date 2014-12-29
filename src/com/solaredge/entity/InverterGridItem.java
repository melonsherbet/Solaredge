package com.solaredge.entity;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

@Table(name = "table_inverter_grid_item")
public class InverterGridItem {

	@Id
	private int mId;

	@Column(column = "mInverterId")
	private String mInverterId;

	@Column(column = "mRow")
	private int mRow;

	@Column(column = "mCol")
	private int mCol;

	@Column(column = "mAngle")
	private int mAngle;

	@Column(column = "mIsNew")
	private boolean mIsNew; // true: added extra optimizer, false: deleted
							// optimizer

	public String getInverterId() {
		return mInverterId;
	}

	public void setInverterId(String mInverterId) {
		this.mInverterId = mInverterId;
	}

	public int getRow() {
		return mRow;
	}

	public void setRow(int mRow) {
		this.mRow = mRow;
	}

	public int getCol() {
		return mCol;
	}

	public void setCol(int mCol) {
		this.mCol = mCol;
	}

	public int getmAngle() {
		return mAngle;
	}

	public void setmAngle(int mAngle) {
		this.mAngle = mAngle;
	}

	public boolean ismIsNew() {
		return mIsNew;
	}

	public void setmIsNew(boolean mIsNew) {
		this.mIsNew = mIsNew;
	}

}