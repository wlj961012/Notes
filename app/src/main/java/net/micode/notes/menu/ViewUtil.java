package net.micode.notes.menu;

import android.content.Context;

/**
 * Created by Stew on 2016/5/23.
 * TODO
 */
public class ViewUtil {

    /**
     * dp转px
     * @param context
     * @param dpValue
     * @return
     */
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


}