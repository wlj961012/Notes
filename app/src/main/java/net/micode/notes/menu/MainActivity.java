package net.micode.notes.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import net.micode.notes.R;

import net.micode.notes.calendar.TestMonthWeekActivity;
import net.micode.notes.data.Notes;
import net.micode.notes.draw.DrawingActivity;
import net.micode.notes.jnote.JNote_MainActivity;
import net.micode.notes.me.MeActivity;
import net.micode.notes.ui.NoteEditActivity;
import net.micode.notes.ui.NotesListActivity;

public class MainActivity extends AppCompatActivity {

    private int[] aroundCircleTitleEn = {R.string.topTitleEn, R.string.topRightTitleEn, R.string.topLeftTitleEn, R.string.rightTitleEn, R.string.leftTitleEn, R.string.bottomRightTitleEn};
    private int[] aroundCircleTitleCn = {R.string.topTitleCn, R.string.topRightTitleCn, R.string.topLeftTitleCn, R.string.rightTitleCn, R.string.leftTitleCn, R.string.bottomRightTitleCn};


    private int[] circleIcon = {R.drawable.bt1, R.drawable.bt2, R.drawable.bt33, R.drawable.bt4, R.drawable.bt5, R.drawable.bt66};
    private int[] circleCompleteStatusList = {AttrEntity.DEF,
            AttrEntity.DEF,
            AttrEntity.DEF,
            AttrEntity.DEF,
            AttrEntity.DEF,
            AttrEntity.DEF};

    private int aroundCircleCount = 6;
    private final static int REQUEST_CODE_OPEN_NODE = 102;
    private final static int REQUEST_CODE_NEW_NODE  = 103;
    private long mCurrentFolderId;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_activity_main);

        final CircleLayout circleLayout = (CircleLayout) findViewById(R.id.circle_layout);
        circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
        circleLayout.setProgressNum(3);
        circleLayout.initView();

        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
        LayoutAnimationController lac = new LayoutAnimationController(animation);
        lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
        lac.setDelay(0.3f);
        circleLayout.setLayoutAnimation(lac);
        circleLayout.startAnim(360f * 0 / 6);

        circleLayout.setOnClickListener(new CircleLayout.circleClickListener() {
            @Override
            public void click(int tag) {

                if(tag==1){

                    circleCompleteStatusList[0]=AttrEntity.DOING;
                    circleCompleteStatusList[1]=AttrEntity.DEF;
                    circleCompleteStatusList[2]=AttrEntity.DEF;
                    circleCompleteStatusList[3]=AttrEntity.DEF;
                    circleCompleteStatusList[4]=AttrEntity.DEF;
                    circleCompleteStatusList[5]=AttrEntity.DEF;


                    //circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 0 / 6);

                    Intent intent = new Intent(MainActivity.this, NoteEditActivity.class);
                    intent.setAction(Intent.ACTION_INSERT_OR_EDIT);
                    intent.putExtra(Notes.INTENT_EXTRA_FOLDER_ID, mCurrentFolderId);
                    startActivityForResult(intent, REQUEST_CODE_NEW_NODE);
                }
                else if(tag==4){

                    circleCompleteStatusList[0]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[1]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[2]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[3]=AttrEntity.DOING;
                    circleCompleteStatusList[4]=AttrEntity.DEF;
                    circleCompleteStatusList[5]=AttrEntity.DEF;


                   // circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 3 / 6);

                    Intent intent=new Intent(MainActivity.this,TestMonthWeekActivity.class);
                    startActivity(intent);
                }
                else if(tag==3){

                    circleCompleteStatusList[0]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[1]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[2]=AttrEntity.DOING;
                    circleCompleteStatusList[3]=AttrEntity.DEF;
                    circleCompleteStatusList[4]=AttrEntity.DEF;
                    circleCompleteStatusList[5]=AttrEntity.DEF;


                    //circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 2 / 6);

                    Intent intent=new Intent(MainActivity.this,NotesListActivity.class);
                    startActivity(intent);

                }
                else if(tag==2){

                    circleCompleteStatusList[0]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[1]=AttrEntity.DOING;
                    circleCompleteStatusList[2]=AttrEntity.DEF;
                    circleCompleteStatusList[3]=AttrEntity.DEF;
                    circleCompleteStatusList[4]=AttrEntity.DEF;
                    circleCompleteStatusList[5]=AttrEntity.DEF;


                    //circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 1 / 6);

                    Intent intent=new Intent(MainActivity.this, JNote_MainActivity.class);
                    startActivity(intent);
                }
                else if(tag==5){
                    circleCompleteStatusList[0]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[1]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[2]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[3]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[4]=AttrEntity.DOING;
                    circleCompleteStatusList[5]=AttrEntity.DEF;


                    //circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 4 / 6);

                    Intent intent=new Intent(MainActivity.this,DrawingActivity.class);
                    startActivity(intent);
                }
                else if(tag==6){
                    circleCompleteStatusList[0]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[1]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[2]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[3]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[4]=AttrEntity.COMPLETE;
                    circleCompleteStatusList[5]=AttrEntity.DOING;


                    //circleLayout.setView(aroundCircleTitleEn, aroundCircleTitleCn, circleIcon, aroundCircleCount, circleCompleteStatusList);
                    circleLayout.setProgressNum(3);
                    circleLayout.initView();

                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.viewtoshowanim);
                    LayoutAnimationController lac = new LayoutAnimationController(animation);
                    lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
                    //lac.setDelay(0.3f);
                    circleLayout.setLayoutAnimation(lac);
                    circleLayout.startAnim(360f * 6 / 6);

                    Intent intent=new Intent(MainActivity.this,MeActivity.class);
                    startActivity(intent);
                }
                else{
                    startActivity(TagActivity.getInstance(MainActivity.this, tag));
                }
            }
        });

    }

}
