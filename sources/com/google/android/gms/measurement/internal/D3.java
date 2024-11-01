package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2107c1;

/* loaded from: classes3.dex */
public final class D3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f17176a;

    /* renamed from: b, reason: collision with root package name */
    String f17177b;

    /* renamed from: c, reason: collision with root package name */
    String f17178c;

    /* renamed from: d, reason: collision with root package name */
    String f17179d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f17180e;

    /* renamed from: f, reason: collision with root package name */
    long f17181f;

    /* renamed from: g, reason: collision with root package name */
    C2107c1 f17182g;

    /* renamed from: h, reason: collision with root package name */
    boolean f17183h;

    /* renamed from: i, reason: collision with root package name */
    Long f17184i;

    /* renamed from: j, reason: collision with root package name */
    String f17185j;

    public D3(Context context, C2107c1 c2107c1, Long l8) {
        this.f17183h = true;
        AbstractC1396p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1396p.l(applicationContext);
        this.f17176a = applicationContext;
        this.f17184i = l8;
        if (c2107c1 != null) {
            this.f17182g = c2107c1;
            this.f17177b = c2107c1.f16612f;
            this.f17178c = c2107c1.f16611e;
            this.f17179d = c2107c1.f16610d;
            this.f17183h = c2107c1.f16609c;
            this.f17181f = c2107c1.f16608b;
            this.f17185j = c2107c1.f16614h;
            Bundle bundle = c2107c1.f16613g;
            if (bundle != null) {
                this.f17180e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
