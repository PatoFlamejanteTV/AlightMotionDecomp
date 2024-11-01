package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3309i;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2359h2 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f17835b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f17836c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference f17837d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3309i f17838a;

    public C2359h2(InterfaceC3309i interfaceC3309i) {
        this.f17838a = interfaceC3309i;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z8;
        String str2;
        AbstractC1396p.l(strArr);
        AbstractC1396p.l(strArr2);
        AbstractC1396p.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1396p.a(z8);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (Objects.equals(str, strArr[i8])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i8] == null) {
                            strArr3[i8] = strArr2[i8] + "(" + strArr[i8] + ")";
                        }
                        str2 = strArr3[i8];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f17838a.w()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = e(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(E e8) {
        String str = null;
        if (e8 == null) {
            return null;
        }
        if (!this.f17838a.w()) {
            return e8.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(e8.f17194c);
        sb.append(",name=");
        sb.append(c(e8.f17192a));
        sb.append(",params=");
        D d8 = e8.f17193b;
        if (d8 != null) {
            if (!this.f17838a.w()) {
                str = d8.toString();
            } else {
                str = a(d8.y());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17838a.w()) {
            return str;
        }
        return d(str, l0.q.f34624c, l0.q.f34622a, f17835b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17838a.w()) {
            return str;
        }
        return d(str, l0.s.f34629b, l0.s.f34628a, f17836c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17838a.w()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return d(str, l0.r.f34627b, l0.r.f34626a, f17837d);
    }
}
