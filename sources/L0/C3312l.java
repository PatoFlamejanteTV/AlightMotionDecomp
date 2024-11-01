package l0;

import Q.AbstractC1396p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2401n2;
import com.google.android.gms.measurement.internal.S2;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3312l {

    /* renamed from: a, reason: collision with root package name */
    private final a f34611a;

    /* renamed from: l0.l$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C3312l(a aVar) {
        AbstractC1396p.l(aVar);
        this.f34611a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C2401n2 a9 = S2.b(context, null, null).a();
        if (intent == null) {
            a9.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        a9.K().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a9.K().a("Starting wakeful intent.");
            this.f34611a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            a9.L().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
