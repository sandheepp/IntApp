package com.danh32.fontify;


import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;


public class CheckBox extends android.widget.CheckBox {

	public CheckBox(Context context) {
		super(context);
		setup();
	}

	public CheckBox(Context context, AttributeSet attrs) {
		super(context, attrs);
		setup();
		// return early for eclipse preview mode
		if (isInEditMode()) {
			return;

		}
		FontManager.getInstance().setFont(this, attrs);
	}

	public void setFont(String fontPath) {
		FontManager.getInstance().setFont(this, fontPath);
	}

	public void setFont(int resId) {
		String fontPath = getContext().getString(resId);
		setFont(fontPath);
	}

	private void setup() {
		setPaintFlags(getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.HINTING_ON);
	}
}
