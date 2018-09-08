package com.reddogsoftware.mbresnan.wakemeupwhen;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver {
    private Vibrator mVibrator;

    CallReceiver() {
        Context appContext = ApplicationContextProvider.getContext();
        mVibrator = (Vibrator) appContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        Log.d("WAKEUP", "CALL RECEIVED FROM NUMBER: " + number);
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start) {}

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {}

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {}

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {}

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        //
        Log.d("WAKEUP", "CALL MISSED FROM NUMBER: " + number);
        if (number.equals("4153495750") || number.equals("4000000000")) {
            MediaPlayer player = MediaPlayer.create(ctx, Settings.System.DEFAULT_RINGTONE_URI);
            player.setLooping(true);
            player.start();
            if (mVibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mVibrator.vibrate(VibrationEffect.createOneShot(Integer.MAX_VALUE, 255));
                } else {
                    mVibrator.vibrate(Integer.MAX_VALUE);
                }
            }
        }
    }
}
