package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;
import l0.EnumC3297C;

/* loaded from: classes3.dex */
final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private String f17415a;

    /* renamed from: b, reason: collision with root package name */
    private Map f17416b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3297C f17417c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I5(String str, EnumC3297C enumC3297C) {
        this.f17415a = str;
        this.f17417c = enumC3297C;
    }

    public final EnumC3297C a() {
        return this.f17417c;
    }

    public final String b() {
        return this.f17415a;
    }

    public final Map c() {
        Map map = this.f17416b;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I5(String str, Map map, EnumC3297C enumC3297C) {
        this.f17415a = str;
        this.f17416b = map;
        this.f17417c = enumC3297C;
    }
}
