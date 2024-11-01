package e0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2782f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31523a;

    public HandlerC2782f(Looper looper) {
        super(looper);
        this.f31523a = Looper.getMainLooper();
    }

    public HandlerC2782f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31523a = Looper.getMainLooper();
    }
}
