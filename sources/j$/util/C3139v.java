package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3139v extends C3010p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C3010p(this.f33211b);
    }

    @Override // j$.util.C3010p, java.util.List
    public final java.util.List subList(int i8, int i9) {
        return new C3010p(this.f33211b.subList(i8, i9));
    }
}
