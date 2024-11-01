package q6;

import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3824i {

    /* renamed from: q6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37418a;

        public a(Object obj) {
            this.f37418a = obj;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object emit = interfaceC3822g.emit(this.f37418a, dVar);
            if (emit == V5.b.e()) {
                return emit;
            }
            return Q5.I.f8786a;
        }
    }

    public static final InterfaceC3821f a(InterfaceC2072n interfaceC2072n) {
        return new C3817b(interfaceC2072n, null, 0, null, 14, null);
    }

    public static final InterfaceC3821f b(InterfaceC2072n interfaceC2072n) {
        return new C3819d(interfaceC2072n, null, 0, null, 14, null);
    }

    public static final InterfaceC3821f c(InterfaceC2072n interfaceC2072n) {
        return new z(interfaceC2072n);
    }

    public static final InterfaceC3821f d(Object obj) {
        return new a(obj);
    }
}
