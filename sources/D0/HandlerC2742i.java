package d0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2742i extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31285a;

    public HandlerC2742i(Looper looper) {
        super(looper);
        this.f31285a = Looper.getMainLooper();
    }

    public HandlerC2742i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31285a = Looper.getMainLooper();
    }
}
