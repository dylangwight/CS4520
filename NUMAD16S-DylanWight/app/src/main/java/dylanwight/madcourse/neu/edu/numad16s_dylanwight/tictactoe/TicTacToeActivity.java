/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband4 for more book information.
***/
package dylanwight.madcourse.neu.edu.numad16s_dylanwight.tictactoe;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import dylanwight.madcourse.neu.edu.numad16s_dylanwight.R;

public class TicTacToeActivity extends Activity {
   MediaPlayer mMediaPlayer;
   // ...

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(new Bundle());
      setContentView(R.layout.activity_tictactoe);
   }

   @Override
   protected void onResume() {
      super.onResume();
      // music credits to Composer: Jake LaVallee, owner of http://uncopyrightedmusic.net
      mMediaPlayer = MediaPlayer.create(this, R.raw.into_battle_4);
      mMediaPlayer.setVolume(0.5f, 0.5f);
      mMediaPlayer.setLooping(true);
      mMediaPlayer.start();
   }

   @Override
   protected void onPause() {
      super.onPause();
      mMediaPlayer.stop();
      mMediaPlayer.reset();
      mMediaPlayer.release();
   }
}
