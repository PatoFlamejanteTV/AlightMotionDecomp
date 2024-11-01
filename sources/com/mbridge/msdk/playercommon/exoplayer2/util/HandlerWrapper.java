package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
public interface HandlerWrapper {
    Looper getLooper();

    Message obtainMessage(int i8);

    Message obtainMessage(int i8, int i9, int i10);

    Message obtainMessage(int i8, int i9, int i10, Object obj);

    Message obtainMessage(int i8, Object obj);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j8);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i8);

    boolean sendEmptyMessage(int i8);

    boolean sendEmptyMessageAtTime(int i8, long j8);
}
