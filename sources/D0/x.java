package D0;

import c1.InterfaceC2009b;

/* loaded from: classes3.dex */
public class x implements InterfaceC2009b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1211c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f1212a = f1211c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC2009b f1213b;

    public x(InterfaceC2009b interfaceC2009b) {
        this.f1213b = interfaceC2009b;
    }

    @Override // c1.InterfaceC2009b
    public Object get() {
        Object obj = this.f1212a;
        Object obj2 = f1211c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1212a;
                    if (obj == obj2) {
                        obj = this.f1213b.get();
                        this.f1212a = obj;
                        this.f1213b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
