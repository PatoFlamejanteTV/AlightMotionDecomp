package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class H7 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16316c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16317d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ E7 f16318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(E7 e72, boolean z8, boolean z9) {
        super("log");
        this.f16318e = e72;
        this.f16316c = z8;
        this.f16317d = z9;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        I7 i72;
        I7 i73;
        I7 i74;
        AbstractC2262u2.k("log", 1, list);
        if (list.size() == 1) {
            i74 = this.f16318e.f16291c;
            i74.a(F7.INFO, y22.b((InterfaceC2243s) list.get(0)).A(), Collections.emptyList(), this.f16316c, this.f16317d);
            return InterfaceC2243s.f16971b0;
        }
        F7 a9 = F7.a(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()));
        String A8 = y22.b((InterfaceC2243s) list.get(1)).A();
        if (list.size() == 2) {
            i73 = this.f16318e.f16291c;
            i73.a(a9, A8, Collections.emptyList(), this.f16316c, this.f16317d);
            return InterfaceC2243s.f16971b0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < Math.min(list.size(), 5); i8++) {
            arrayList.add(y22.b((InterfaceC2243s) list.get(i8)).A());
        }
        i72 = this.f16318e.f16291c;
        i72.a(a9, A8, arrayList, this.f16316c, this.f16317d);
        return InterfaceC2243s.f16971b0;
    }
}
