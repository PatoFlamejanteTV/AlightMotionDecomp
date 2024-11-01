package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final List f16219a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC2243s a(String str) {
        if (this.f16219a.contains(AbstractC2262u2.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract InterfaceC2243s b(String str, Y2 y22, List list);
}
