package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class af {

    /* renamed from: a */
    public volatile JSONObject f21221a;

    /* renamed from: b */
    private final Object f21222b;

    /* renamed from: c */
    private final Object f21223c;

    /* renamed from: d */
    private final Object f21224d;

    /* renamed from: e */
    private final Object f21225e;

    /* renamed from: f */
    private String f21226f;

    /* renamed from: g */
    private volatile ConcurrentHashMap<String, Boolean> f21227g;

    /* renamed from: h */
    private volatile ConcurrentHashMap<String, Integer> f21228h;

    /* renamed from: i */
    private volatile com.mbridge.msdk.c.g f21229i;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private static final af f21230a = new af();

        public static /* synthetic */ af a() {
            return f21230a;
        }
    }

    /* synthetic */ af(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static af a() {
        return a.f21230a;
    }

    private int b(String str, String str2, int i8) {
        if (a(true)) {
            return i8;
        }
        try {
            String optString = this.f21221a.optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return i8;
            }
            String a9 = x.a(optString);
            return TextUtils.isEmpty(a9) ? i8 : new JSONObject(a9).optInt(str2, i8);
        } catch (Exception unused) {
            return i8;
        }
    }

    private ConcurrentHashMap<String, Boolean> c() {
        synchronized (this.f21224d) {
            try {
                if (this.f21227g == null) {
                    this.f21227g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21227g;
    }

    private af() {
        this.f21222b = new Object();
        this.f21223c = new Object();
        this.f21224d = new Object();
        this.f21225e = new Object();
    }

    private static Integer a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int a(String str, int i8) {
        Integer valueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i8;
            }
            ConcurrentHashMap<String, Integer> b9 = b();
            Integer a9 = a(str, b9);
            if (a9 != null) {
                return a9.intValue();
            }
            try {
                valueOf = Integer.valueOf(b(str, i8));
            } catch (Exception unused) {
                valueOf = Integer.valueOf(i8);
            }
            b9.put(str, valueOf);
            return valueOf.intValue();
        } catch (Exception unused2) {
            return i8;
        }
    }

    private int b(String str, int i8) {
        if (a(true)) {
            return i8;
        }
        try {
            return this.f21221a.optInt(str, i8);
        } catch (Exception unused) {
            return i8;
        }
    }

    private ConcurrentHashMap<String, Integer> b() {
        synchronized (this.f21222b) {
            try {
                if (this.f21228h == null) {
                    this.f21228h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21228h;
    }

    public final int a(String str, String str2, int i8) {
        Integer valueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> b9 = b();
                Integer a9 = a(str3, b9);
                if (a9 != null) {
                    return a9.intValue();
                }
                try {
                    valueOf = Integer.valueOf(b(str, str2, i8));
                } catch (Exception unused) {
                    valueOf = Integer.valueOf(i8);
                }
                b9.put(str3, valueOf);
                return valueOf.intValue();
            }
            return a(str2, i8);
        } catch (Exception unused2) {
            return i8;
        }
    }

    private static Boolean b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, boolean z8, boolean z9) {
        if (a(z9)) {
            return z8;
        }
        try {
            return this.f21221a.optInt(str, z8 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8) {
        try {
            return a(str, z8, true);
        } catch (Exception unused) {
            return z8;
        }
    }

    public final boolean a(String str, boolean z8, boolean z9) {
        Boolean valueOf;
        Boolean b9;
        try {
            if (TextUtils.isEmpty(str)) {
                return z8;
            }
            ConcurrentHashMap<String, Boolean> c8 = c();
            if (z9 && (b9 = b(str, c8)) != null) {
                return b9.booleanValue();
            }
            try {
                valueOf = Boolean.valueOf(b(str, z8, z9));
            } catch (Exception unused) {
                valueOf = Boolean.valueOf(z8);
            }
            c8.put(str, valueOf);
            return valueOf.booleanValue();
        } catch (Exception unused2) {
            return z8;
        }
    }

    private boolean a(boolean z8) {
        synchronized (this.f21225e) {
            if (this.f21229i == null || this.f21229i.I() == 1 || !z8) {
                try {
                    if (TextUtils.isEmpty(this.f21226f)) {
                        this.f21226f = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
                    }
                    this.f21229i = com.mbridge.msdk.c.h.a().a(this.f21226f);
                } catch (Exception unused) {
                    this.f21229i = null;
                }
            }
            if (this.f21229i != null) {
                this.f21221a = this.f21229i.al();
            }
        }
        return this.f21229i == null || this.f21221a == null;
    }
}
