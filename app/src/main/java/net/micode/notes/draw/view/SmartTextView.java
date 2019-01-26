package net.micode.notes.draw.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;
//import android.widget.TextView;

/**
 * Created by Joker on 2016/1/3.
 */
//@SuppressLint("AppCompatCustomView")
public class SmartTextView extends AppCompatTextView {

  public SmartTextView(Context context) {
    this(context, null);
  }

  public SmartTextView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public SmartTextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    if (!isInEditMode()) {
      SmartTextView.this.init(context);
    }
  }

  private void init(Context context) {
    Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Lobster-Regular.ttf");
    this.setTypeface(typeface);
  }
}
