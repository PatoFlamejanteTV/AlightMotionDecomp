package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2176j7;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2443t3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f18052a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f18053b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f18054c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2443t3(X2 x22, M5 m52, Bundle bundle) {
        this.f18052a = m52;
        this.f18053b = bundle;
        this.f18054c = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f18054c.f17618a;
        h52.z0();
        h53 = this.f18054c.f17618a;
        M5 m52 = this.f18052a;
        Bundle bundle = this.f18053b;
        h53.f().k();
        if (C2176j7.a() && h53.i0().F(m52.f17457a, G.f17247I0) && m52.f17457a != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i8 = 0; i8 < intArray.length; i8++) {
                            C2377k l02 = h53.l0();
                            String str = m52.f17457a;
                            int i9 = intArray[i8];
                            long j8 = longArray[i8];
                            AbstractC1396p.f(str);
                            l02.k();
                            l02.r();
                            try {
                                int delete = l02.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i9), String.valueOf(j8)});
                                l02.a().K().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i9), Long.valueOf(j8));
                            } catch (SQLiteException e8) {
                                l02.a().G().c("Error pruning trigger URIs. appId", C2401n2.s(str), e8);
                            }
                        }
                    } else {
                        h53.a().G().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return h53.l0().X0(m52.f17457a);
        }
        return new ArrayList();
    }
}
