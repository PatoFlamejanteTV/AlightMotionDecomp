package k1;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3227d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C3227d f34375b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f34376a = new HashSet();

    C3227d() {
    }

    public static C3227d a() {
        C3227d c3227d = f34375b;
        if (c3227d == null) {
            synchronized (C3227d.class) {
                try {
                    c3227d = f34375b;
                    if (c3227d == null) {
                        c3227d = new C3227d();
                        f34375b = c3227d;
                    }
                } finally {
                }
            }
        }
        return c3227d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f34376a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f34376a);
        }
        return unmodifiableSet;
    }
}
