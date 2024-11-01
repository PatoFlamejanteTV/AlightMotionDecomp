package b;

import Q5.I;
import c6.InterfaceC2072n;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public Object f14868a;

    /* renamed from: b, reason: collision with root package name */
    public int f14869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1957l f14870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1955j(C1957l c1957l, U5.d dVar) {
        super(2, dVar);
        this.f14870c = c1957l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C1955j(this.f14870c, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new C1955j(this.f14870c, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:            if (r12 == false) goto L102;     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.C1955j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
