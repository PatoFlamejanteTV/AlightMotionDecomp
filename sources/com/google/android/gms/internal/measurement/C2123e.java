package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2123e {

    /* renamed from: d, reason: collision with root package name */
    private static final x0.r f16688d = x0.r.v("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f16689a;

    /* renamed from: b, reason: collision with root package name */
    private long f16690b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16691c;

    public C2123e(String str, long j8, Map map) {
        this.f16689a = str;
        this.f16690b = j8;
        HashMap hashMap = new HashMap();
        this.f16691c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (f16688d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
            return obj2;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (obj instanceof String) {
            return obj2.toString();
        }
        return obj2;
    }

    public final long a() {
        return this.f16690b;
    }

    public final Object b(String str) {
        if (this.f16691c.containsKey(str)) {
            return this.f16691c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C2123e(this.f16689a, this.f16690b, new HashMap(this.f16691c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f16691c.remove(str);
        } else {
            this.f16691c.put(str, c(str, this.f16691c.get(str), obj));
        }
    }

    public final String e() {
        return this.f16689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2123e)) {
            return false;
        }
        C2123e c2123e = (C2123e) obj;
        if (this.f16690b != c2123e.f16690b || !this.f16689a.equals(c2123e.f16689a)) {
            return false;
        }
        return this.f16691c.equals(c2123e.f16691c);
    }

    public final void f(String str) {
        this.f16689a = str;
    }

    public final Map g() {
        return this.f16691c;
    }

    public final int hashCode() {
        int hashCode = this.f16689a.hashCode() * 31;
        long j8 = this.f16690b;
        return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f16691c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f16689a + "', timestamp=" + this.f16690b + ", params=" + String.valueOf(this.f16691c) + "}";
    }
}
