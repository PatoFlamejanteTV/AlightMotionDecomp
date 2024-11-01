package l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2176j7;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.S2;
import j$.util.Objects;

/* renamed from: l0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3300F extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f34609a;

    public C3300F(S2 s22) {
        this.f34609a = s22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f34609a.a().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f34609a.a().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f34609a.a().L().a("App receiver called with unknown action");
            return;
        }
        final S2 s22 = this.f34609a;
        if (C2176j7.a() && s22.z().H(null, G.f17249J0)) {
            s22.a().K().a("App receiver notified triggers are available");
            s22.f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.f6
                @Override // java.lang.Runnable
                public final void run() {
                    S2 s23 = S2.this;
                    if (!s23.L().X0()) {
                        s23.a().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final F3 H8 = s23.H();
                    Objects.requireNonNull(H8);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            F3.this.E0();
                        }
                    }).start();
                }
            });
        }
    }
}
