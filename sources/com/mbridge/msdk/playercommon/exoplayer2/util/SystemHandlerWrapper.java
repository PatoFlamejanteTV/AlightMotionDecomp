package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i8) {
        return this.handler.obtainMessage(i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean postDelayed(Runnable runnable, long j8) {
        return this.handler.postDelayed(runnable, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i8) {
        this.handler.removeMessages(i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i8) {
        return this.handler.sendEmptyMessage(i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i8, long j8) {
        return this.handler.sendEmptyMessageAtTime(i8, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i8, Object obj) {
        return this.handler.obtainMessage(i8, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i8, int i9, int i10) {
        return this.handler.obtainMessage(i8, i9, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i8, int i9, int i10, Object obj) {
        return this.handler.obtainMessage(i8, i9, i10, obj);
    }
}
