package luhar.sohil.hello;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private final  int NR_OF_SIMULTANEOUS_SOUNDS=1;
    private final  float LEFT_VOLUME=1.0f;
    private final  float RIGHT_VOLUME=1.0f;
    private final  int NO_LOOP=0;
    private final  int PRIORITY=0;
    private final  float NORMAL_PLAY_RATE=1.0f;

private SoundPool mySoundPool;

    private  int mhindiSoundId;
    private  int mtamilSoundId;
    private  int marabicSoundId;
    private  int mrussianSoundId;
    private  int mkoreanSoundId;
    private  int mjapaneseSoundId;
    private  int mfrenchSoundId;
    private  int mchineseSoundId;
    private  int mlatinSoundId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySoundPool= new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        mhindiSoundId=mySoundPool.load(getApplicationContext(),R.raw.hindi,1);
        mtamilSoundId=mySoundPool.load(getApplicationContext(),R.raw.tamil,1);
        marabicSoundId=mySoundPool.load(getApplicationContext(),R.raw.arabic,1);
        mrussianSoundId=mySoundPool.load(getApplicationContext(),R.raw.russian,1);
        mkoreanSoundId=mySoundPool.load(getApplicationContext(),R.raw.korean,1);
        mjapaneseSoundId=mySoundPool.load(getApplicationContext(),R.raw.janapese,1);
        mfrenchSoundId=mySoundPool.load(getApplicationContext(),R.raw.french,1);
        mchineseSoundId=mySoundPool.load(getApplicationContext(),R.raw.chinese,1);
        mlatinSoundId=mySoundPool.load(getApplicationContext(),R.raw.latin,1);

    }


    public void playhindi(View view) {
        mySoundPool.play(mhindiSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playtamil(View view) {
        mySoundPool.play(mtamilSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playarabic(View view) {
        mySoundPool.play(marabicSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playrussian(View view) {
        mySoundPool.play(mrussianSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playkorean(View view) {
        mySoundPool.play(mkoreanSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playjapanese(View view) {
        mySoundPool.play(mjapaneseSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playfrench(View view) {
        mySoundPool.play(mfrenchSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playchinesse(View view) {
        mySoundPool.play(mchineseSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playlatin(View view){
        mySoundPool.play(mlatinSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
}
