package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2271v3 implements InterfaceC2091a3 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f17044g = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17045a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f17046b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f17047c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f17048d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map f17049e;

    /* renamed from: f, reason: collision with root package name */
    private final List f17050f;

    private C2271v3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.u3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                C2271v3.this.e(sharedPreferences2, str);
            }
        };
        this.f17047c = onSharedPreferenceChangeListener;
        this.f17048d = new Object();
        this.f17050f = new ArrayList();
        this.f17045a = sharedPreferences;
        this.f17046b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (R2.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences a9 = AbstractC2300z0.a(context, str.substring(12), 0, AbstractC2268v0.f17032a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a9;
            }
            SharedPreferences a10 = AbstractC2300z0.a(context, str, 0, AbstractC2268v0.f17032a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a10;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2271v3 b(Context context, String str, Runnable runnable) {
        boolean z8;
        C2271v3 c2271v3;
        if (R2.a() && !str.startsWith("direct_boot:")) {
            z8 = R2.c(context);
        } else {
            z8 = true;
        }
        if (!z8) {
            return null;
        }
        synchronized (C2271v3.class) {
            try {
                Map map = f17044g;
                c2271v3 = (C2271v3) map.get(str);
                if (c2271v3 == null) {
                    c2271v3 = new C2271v3(a(context, str), runnable);
                    map.put(str, c2271v3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2271v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (C2271v3.class) {
            try {
                for (C2271v3 c2271v3 : f17044g.values()) {
                    c2271v3.f17045a.unregisterOnSharedPreferenceChangeListener(c2271v3.f17047c);
                }
                f17044g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2091a3
    public final Object c(String str) {
        Map<String, ?> map = this.f17049e;
        if (map == null) {
            synchronized (this.f17048d) {
                try {
                    map = this.f17049e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f17045a.getAll();
                            this.f17049e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f17048d) {
            this.f17049e = null;
            this.f17046b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f17050f.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
