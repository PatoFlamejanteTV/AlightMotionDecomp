package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class B3 implements Y4 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(Iterable iterable, List list) {
        C3.g(iterable, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e(InterfaceC2210n5 interfaceC2210n5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(int i8);

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            AbstractC2092a4 D8 = AbstractC2092a4.D(bArr);
            a(D8);
            D8.E();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
