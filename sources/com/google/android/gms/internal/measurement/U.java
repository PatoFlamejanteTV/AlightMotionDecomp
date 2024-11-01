package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        if (str != null && !str.isEmpty() && y22.g(str)) {
            InterfaceC2243s c8 = y22.c(str);
            if (c8 instanceof AbstractC2204n) {
                return ((AbstractC2204n) c8).a(y22, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
