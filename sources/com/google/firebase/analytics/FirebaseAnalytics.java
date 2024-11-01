package com.google.firebase.analytics;

import Q.AbstractC1396p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.C2125e1;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.z;
import q0.AbstractC3628n;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f18400b;

    /* renamed from: a, reason: collision with root package name */
    private final C2125e1 f18401a;

    private FirebaseAnalytics(C2125e1 c2125e1) {
        AbstractC1396p.l(c2125e1);
        this.f18401a = c2125e1;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f18400b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f18400b == null) {
                        f18400b = new FirebaseAnalytics(C2125e1.e(context));
                    }
                } finally {
                }
            }
        }
        return f18400b;
    }

    @Nullable
    @Keep
    public static z getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C2125e1 f8 = C2125e1.f(context, null, null, null, bundle);
        if (f8 == null) {
            return null;
        }
        return new a(f8);
    }

    public final void a(String str, Bundle bundle) {
        this.f18401a.q(str, bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) AbstractC3628n.b(c.p().getId(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f18401a.j(activity, str, str2);
    }
}
