package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final String f17142a;

    /* renamed from: b, reason: collision with root package name */
    final String f17143b;

    /* renamed from: c, reason: collision with root package name */
    final String f17144c;

    /* renamed from: d, reason: collision with root package name */
    final long f17145d;

    /* renamed from: e, reason: collision with root package name */
    final long f17146e;

    /* renamed from: f, reason: collision with root package name */
    final D f17147f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(S2 s22, String str, String str2, String str3, long j8, long j9, Bundle bundle) {
        D d8;
        AbstractC1396p.f(str2);
        AbstractC1396p.f(str3);
        this.f17142a = str2;
        this.f17143b = str3;
        this.f17144c = TextUtils.isEmpty(str) ? null : str;
        this.f17145d = j8;
        this.f17146e = j9;
        if (j9 != 0 && j9 > j8) {
            s22.a().L().b("Event created with reverse previous/current timestamps. appId", C2401n2.s(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s22.a().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s02 = s22.L().s0(next, bundle2.get(next));
                    if (s02 == null) {
                        s22.a().L().b("Param value can't be null", s22.D().f(next));
                        it.remove();
                    } else {
                        s22.L().O(bundle2, next, s02);
                    }
                }
            }
            d8 = new D(bundle2);
        } else {
            d8 = new D(new Bundle());
        }
        this.f17147f = d8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final B a(S2 s22, long j8) {
        return new B(s22, this.f17144c, this.f17142a, this.f17143b, this.f17145d, j8, this.f17147f);
    }

    public final String toString() {
        return "Event{appId='" + this.f17142a + "', name='" + this.f17143b + "', params=" + String.valueOf(this.f17147f) + "}";
    }

    private B(S2 s22, String str, String str2, String str3, long j8, long j9, D d8) {
        AbstractC1396p.f(str2);
        AbstractC1396p.f(str3);
        AbstractC1396p.l(d8);
        this.f17142a = str2;
        this.f17143b = str3;
        this.f17144c = TextUtils.isEmpty(str) ? null : str;
        this.f17145d = j8;
        this.f17146e = j9;
        if (j9 != 0 && j9 > j8) {
            s22.a().L().c("Event created with reverse previous/current timestamps. appId, name", C2401n2.s(str2), C2401n2.s(str3));
        }
        this.f17147f = d8;
    }
}
