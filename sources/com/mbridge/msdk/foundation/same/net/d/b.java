package com.mbridge.msdk.foundation.same.net.d;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f20866a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20867b;

    public b(String str, String str2) {
        this.f20866a = str;
        this.f20867b = str2;
    }

    public final String a() {
        return this.f20866a;
    }

    public final String b() {
        return this.f20867b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f20866a, bVar.f20866a) && TextUtils.equals(this.f20867b, bVar.f20867b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20866a.hashCode() * 31) + this.f20867b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20866a + ",value=" + this.f20867b + "]";
    }
}
