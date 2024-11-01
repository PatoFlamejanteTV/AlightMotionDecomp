package x0;

import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class I extends AbstractC4192o {

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC4192o f40826e = new I(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f40827c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f40828d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(Object[] objArr, int i8) {
        this.f40827c = objArr;
        this.f40828d = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4192o, x0.AbstractC4191n
    public int c(Object[] objArr, int i8) {
        System.arraycopy(this.f40827c, 0, objArr, i8, this.f40828d);
        return i8 + this.f40828d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4191n
    public Object[] d() {
        return this.f40827c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4191n
    public int e() {
        return this.f40828d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4191n
    public int g() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i8) {
        w0.h.g(i8, this.f40828d);
        Object obj = this.f40827c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4191n
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40828d;
    }
}
