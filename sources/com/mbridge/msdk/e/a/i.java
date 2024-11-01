package com.mbridge.msdk.e.a;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f20045a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20046b;

    public i(String str, String str2) {
        this.f20045a = str;
        this.f20046b = str2;
    }

    public final String a() {
        return this.f20045a;
    }

    public final String b() {
        return this.f20046b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (TextUtils.equals(this.f20045a, iVar.f20045a) && TextUtils.equals(this.f20046b, iVar.f20046b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20045a.hashCode() * 31) + this.f20046b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20045a + ",value=" + this.f20046b + "]";
    }
}
