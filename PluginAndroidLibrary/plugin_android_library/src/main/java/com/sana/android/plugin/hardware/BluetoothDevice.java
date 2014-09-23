package com.sana.android.plugin.hardware;

import android.content.ContentResolver;
import android.media.MediaRecorder;

import com.sana.android.plugin.application.CommManager;
import com.sana.android.plugin.data.BinaryDataWithPollingEvent;
import com.sana.android.plugin.data.DataWithEvent;

import java.io.InputStream;

/**
 * Created by hanlin on 9/14/14.
 */
public class BluetoothDevice implements GeneralDevice {
    private ContentResolver contentResolver;

    @Override
    //prepare is to store location of recorded audio?
    public DataWithEvent prepare() {
        //CommManager cm = CommManager.getInstance();
        //InputStream is =
        //BinaryDataWithPollingEvent pollingData = new BinaryDataWithPollingEvent(Feature.BLUETOOTH, CommManager.getInstance().getMimeType(), cm.getUri(), this, int uri_size);
        return null;
    }

    @Override
    public void begin() {
    }

    public MediaRecorder getMediaRecorder(){
        return new MediaRecorder();
    }

    @Override
    public void stop() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setCaptureSetting(CaptureSetting setting) {

    }
}
