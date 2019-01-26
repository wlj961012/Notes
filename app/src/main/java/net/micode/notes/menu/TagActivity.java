package net.micode.notes.menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import net.micode.notes.R;

/**
 * Created by stew on 17/1/16.
 * mail: stewforani@gmail.com
 */
public class TagActivity extends Activity {
    //private static final android.R.attr R = ;
    private int tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity_tag);

        TextView tag = (TextView) findViewById(R.id.tvTag);

        String str = "tag : " + getIntent().getIntExtra("tag", 0);

        tag.setText(str);

    }

    public static Intent getInstance(Context context, int tag) {
        Intent intent = new Intent(context, TagActivity.class);
        intent.putExtra("tag", tag);
        return intent;
    }
}
