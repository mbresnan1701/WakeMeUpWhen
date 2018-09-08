package com.reddogsoftware.mbresnan.wakemeupwhen;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.util.Log;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver {
    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        //
        Log.d("WAKEUP", "CALL RECEIVED FROM NUMBER: " + number);
//        MediaPlayer player = MediaPlayer.create(ctx, Settings.System.DEFAULT_RINGTONE_URI);
//        player.setLooping(true);
//        player.start();
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        //
        Log.d("WAKEUP", "CALL ANSWERED FROM NUMBER: " + number);

    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
        Log.d("WAKEUP", "CALL ENDED FROM NUMBER: " + number);
        MediaPlayer player = MediaPlayer.create(ctx, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();

    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        //
        Log.d("WAKEUP", "CALL GOING TO NUMBER: " + number);

    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        //
        Log.d("WAKEUP", "CALL MISSED FROM NUMBER: " + number);
        MediaPlayer player = MediaPlayer.create(ctx, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
    }
}
