package r0;

import Q.AbstractC1382b;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import q0.C3626l;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3863a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f37682a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b, reason: collision with root package name */
    static final long f37683b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, C3626l c3626l) {
        if (status.I()) {
            c3626l.c(obj);
        } else {
            c3626l.b(AbstractC1382b.a(status));
        }
    }
}
