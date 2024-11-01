package k6;

import c6.InterfaceC2072n;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3259k {

    /* renamed from: k6.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3255g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f34535a;

        public a(InterfaceC2072n interfaceC2072n) {
            this.f34535a = interfaceC2072n;
        }

        @Override // k6.InterfaceC3255g
        public Iterator iterator() {
            return AbstractC3258j.a(this.f34535a);
        }
    }

    public static Iterator a(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        C3256h c3256h = new C3256h();
        c3256h.j(V5.b.a(block, c3256h, c3256h));
        return c3256h;
    }

    public static InterfaceC3255g b(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        return new a(block);
    }
}
