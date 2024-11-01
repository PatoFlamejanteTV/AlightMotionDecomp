package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractC2204n f16337a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Y2 f16338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(AbstractC2204n abstractC2204n, Y2 y22) {
        this.f16337a = abstractC2204n;
        this.f16338b = y22;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2243s interfaceC2243s = (InterfaceC2243s) obj;
        InterfaceC2243s interfaceC2243s2 = (InterfaceC2243s) obj2;
        AbstractC2204n abstractC2204n = this.f16337a;
        Y2 y22 = this.f16338b;
        if (interfaceC2243s instanceof C2299z) {
            if (interfaceC2243s2 instanceof C2299z) {
                return 0;
            }
            return 1;
        }
        if (interfaceC2243s2 instanceof C2299z) {
            return -1;
        }
        if (abstractC2204n == null) {
            return interfaceC2243s.A().compareTo(interfaceC2243s2.A());
        }
        return (int) AbstractC2262u2.a(abstractC2204n.a(y22, Arrays.asList(interfaceC2243s, interfaceC2243s2)).z().doubleValue());
    }
}
