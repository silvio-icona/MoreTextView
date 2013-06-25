package com.example.moretextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.TextView;

public class ReflectedTextView extends TextView {

	public ReflectedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public ReflectedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public ReflectedTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
	    int width = getWidth();
	    int height = getHeight();

	    canvas.save(Canvas.MATRIX_SAVE_FLAG);
	    Matrix matrix = new Matrix();
	    matrix.postTranslate(width, 0);
	    matrix.postScale(-1, 1);
	    matrix.postRotate(180, width / 2, height / 2);
	    canvas.concat(matrix);

	    super.onDraw(canvas);

//	    canvas.restore();
	}
}
