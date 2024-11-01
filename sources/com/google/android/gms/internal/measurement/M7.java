package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class M7 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private final V4 f16400c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f16401d;

    public M7(V4 v42) {
        super("require");
        this.f16401d = new HashMap();
        this.f16400c = v42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        AbstractC2262u2.g("require", 1, list);
        String A8 = y22.b((InterfaceC2243s) list.get(0)).A();
        if (this.f16401d.containsKey(A8)) {
            return (InterfaceC2243s) this.f16401d.get(A8);
        }
        InterfaceC2243s a9 = this.f16400c.a(A8);
        if (a9 instanceof AbstractC2204n) {
            this.f16401d.put(A8, (AbstractC2204n) a9);
        }
        return a9;
    }
}
