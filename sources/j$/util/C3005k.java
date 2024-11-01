package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3005k extends C3003i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C3003i(this.f33184c);
    }

    @Override // j$.util.C3003i, java.util.List
    public final java.util.List subList(int i8, int i9) {
        C3003i c3003i;
        synchronized (this.f33180b) {
            c3003i = new C3003i(this.f33184c.subList(i8, i9), this.f33180b);
        }
        return c3003i;
    }
}
