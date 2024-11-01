package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2997a extends p {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f33109i;

    /* renamed from: j, reason: collision with root package name */
    l f33110j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2997a(l[] lVarArr, int i8, int i9, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, 0, i9);
        this.f33109i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f33130b != null;
    }

    public final boolean hasNext() {
        return this.f33130b != null;
    }

    public final void remove() {
        l lVar = this.f33110j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f33110j = null;
        this.f33109i.g(lVar.f33122b, null, null);
    }
}
