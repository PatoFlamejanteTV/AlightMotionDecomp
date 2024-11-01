package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T2 implements InterfaceC2091a3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f16453h = new ArrayMap();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f16454i = {LeanbackPreferenceDialogFragment.ARG_KEY, "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f16455a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f16456b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f16457c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f16458d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f16459e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f16460f;

    /* renamed from: g, reason: collision with root package name */
    private final List f16461g;

    private T2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        V2 v22 = new V2(this, null);
        this.f16458d = v22;
        this.f16459e = new Object();
        this.f16461g = new ArrayList();
        w0.h.i(contentResolver);
        w0.h.i(uri);
        this.f16455a = contentResolver;
        this.f16456b = uri;
        this.f16457c = runnable;
        contentResolver.registerContentObserver(uri, false, v22);
    }

    public static T2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        T2 t22;
        synchronized (T2.class) {
            Map map = f16453h;
            t22 = (T2) map.get(uri);
            if (t22 == null) {
                try {
                    T2 t23 = new T2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, t23);
                    } catch (SecurityException unused) {
                    }
                    t22 = t23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return t22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        synchronized (T2.class) {
            try {
                for (T2 t22 : f16453h.values()) {
                    t22.f16455a.unregisterContentObserver(t22.f16458d);
                }
                f16453h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) Z2.a(new InterfaceC2109c3() { // from class: com.google.android.gms.internal.measurement.W2
                    @Override // com.google.android.gms.internal.measurement.InterfaceC2109c3
                    public final Object w() {
                        return T2.this.d();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException e8) {
                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e8);
                return Collections.emptyMap();
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final Map b() {
        Map map = this.f16460f;
        if (map == null) {
            synchronized (this.f16459e) {
                try {
                    map = this.f16460f;
                    if (map == null) {
                        map = g();
                        this.f16460f = map;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2091a3
    public final /* synthetic */ Object c(String str) {
        return (String) b().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Map hashMap;
        ContentProviderClient acquireUnstableContentProviderClient = this.f16455a.acquireUnstableContentProviderClient(this.f16456b);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor query = acquireUnstableContentProviderClient.query(this.f16456b, f16454i, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map emptyMap2 = Collections.emptyMap();
                    query.close();
                    return emptyMap2;
                }
                if (count <= 256) {
                    hashMap = new ArrayMap(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map emptyMap3 = Collections.emptyMap();
                    query.close();
                    return emptyMap3;
                }
                query.close();
                return hashMap;
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException e8) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e8);
            return Collections.emptyMap();
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public final void f() {
        synchronized (this.f16459e) {
            this.f16460f = null;
            this.f16457c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f16461g.iterator();
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
