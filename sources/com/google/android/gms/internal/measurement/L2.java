package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class L2 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16350a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f16351b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f16352c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f16353d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f16354e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f16355f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f16356g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16357h = false;

    /* renamed from: i, reason: collision with root package name */
    private String[] f16358i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    private final O2 f16359j = new M2();

    @Override // com.google.android.gms.internal.measurement.I2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver != null) {
            synchronized (this) {
                try {
                    String str3 = null;
                    if (this.f16351b == null) {
                        this.f16350a.set(false);
                        this.f16351b = new HashMap(16, 1.0f);
                        this.f16356g = new Object();
                        contentResolver.registerContentObserver(G2.f16308a, true, new N2(this, null));
                    } else if (this.f16350a.getAndSet(false)) {
                        this.f16351b.clear();
                        this.f16352c.clear();
                        this.f16353d.clear();
                        this.f16354e.clear();
                        this.f16355f.clear();
                        this.f16356g = new Object();
                        this.f16357h = false;
                    }
                    Object obj = this.f16356g;
                    if (this.f16351b.containsKey(str)) {
                        String str4 = (String) this.f16351b.get(str);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    for (String str5 : this.f16358i) {
                        if (str.startsWith(str5)) {
                            if (!this.f16357h) {
                                try {
                                    HashMap hashMap = (HashMap) this.f16359j.b(contentResolver, this.f16358i, new P2() { // from class: com.google.android.gms.internal.measurement.K2
                                        @Override // com.google.android.gms.internal.measurement.P2
                                        public final Map a(int i8) {
                                            return new HashMap(i8, 1.0f);
                                        }
                                    });
                                    if (!hashMap.isEmpty()) {
                                        Set keySet = hashMap.keySet();
                                        keySet.removeAll(this.f16352c.keySet());
                                        keySet.removeAll(this.f16353d.keySet());
                                        keySet.removeAll(this.f16354e.keySet());
                                        keySet.removeAll(this.f16355f.keySet());
                                    }
                                    if (!hashMap.isEmpty()) {
                                        if (this.f16351b.isEmpty()) {
                                            this.f16351b = hashMap;
                                        } else {
                                            this.f16351b.putAll(hashMap);
                                        }
                                    }
                                    this.f16357h = true;
                                } catch (S2 unused) {
                                }
                                if (this.f16351b.containsKey(str)) {
                                    String str6 = (String) this.f16351b.get(str);
                                    if (str6 != null) {
                                        str3 = str6;
                                    }
                                    return str3;
                                }
                            }
                            return null;
                        }
                    }
                    try {
                        String a9 = this.f16359j.a(contentResolver, str);
                        if (a9 != null && a9.equals(null)) {
                            a9 = null;
                        }
                        synchronized (this) {
                            try {
                                if (obj == this.f16356g) {
                                    this.f16351b.put(str, a9);
                                }
                            } finally {
                            }
                        }
                        if (a9 == null) {
                            return null;
                        }
                        return a9;
                    } catch (S2 unused2) {
                        return null;
                    }
                } finally {
                }
            }
        }
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }
}
