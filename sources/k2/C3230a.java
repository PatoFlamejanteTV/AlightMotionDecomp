package k2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3230a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f34379a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f34380b;

    public C3230a(Function0 onNetworkAvailable, Function0 onNetworkUnavailable) {
        AbstractC3292y.i(onNetworkAvailable, "onNetworkAvailable");
        AbstractC3292y.i(onNetworkUnavailable, "onNetworkUnavailable");
        this.f34379a = onNetworkAvailable;
        this.f34380b = onNetworkUnavailable;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean b9;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(intent, "intent");
        b9 = AbstractC3234e.b(context);
        if (b9) {
            this.f34379a.invoke();
        } else {
            this.f34380b.invoke();
        }
    }
}
