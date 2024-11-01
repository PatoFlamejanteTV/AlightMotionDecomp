package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import p6.EnumC3588a;
import p6.d;
import p6.g;
import p6.v;

/* loaded from: classes.dex */
final class OnBackInstance {
    private final d channel = g.b(-2, EnumC3588a.SUSPEND, null, 4, null);
    private final boolean isPredictiveBack;
    private final InterfaceC3488x0 job;

    public OnBackInstance(M m8, boolean z8, InterfaceC2072n interfaceC2072n) {
        InterfaceC3488x0 d8;
        this.isPredictiveBack = z8;
        d8 = AbstractC3462k.d(m8, null, null, new OnBackInstance$job$1(interfaceC2072n, this, null), 3, null);
        this.job = d8;
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        InterfaceC3488x0.a.a(this.job, null, 1, null);
    }

    public final boolean close() {
        return v.a.a(this.channel, null, 1, null);
    }

    public final d getChannel() {
        return this.channel;
    }

    public final InterfaceC3488x0 getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m77sendJP2dKIU(BackEventCompat backEventCompat) {
        return this.channel.x(backEventCompat);
    }
}
