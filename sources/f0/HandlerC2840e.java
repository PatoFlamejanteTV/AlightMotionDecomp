package f0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC2840e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f31817a;

    public HandlerC2840e(Looper looper) {
        super(looper);
        this.f31817a = Looper.getMainLooper();
    }

    public HandlerC2840e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f31817a = Looper.getMainLooper();
    }
}
