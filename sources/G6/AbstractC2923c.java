package g6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2923c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32467a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2923c f32468b = X5.b.f11600a.b();

    /* renamed from: g6.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC2923c implements Serializable {
        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }

        @Override // g6.AbstractC2923c
        public int b() {
            return AbstractC2923c.f32468b.b();
        }

        @Override // g6.AbstractC2923c
        public int c(int i8) {
            return AbstractC2923c.f32468b.c(i8);
        }

        private a() {
        }
    }

    public abstract int b();

    public abstract int c(int i8);
}
