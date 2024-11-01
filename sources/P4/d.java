package P4;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f8093c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8094a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8095b = System.currentTimeMillis();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(d dVar, d newEvent) {
            AbstractC3292y.i(newEvent, "newEvent");
            if (dVar == null || dVar.a() != newEvent.a() || newEvent.b() - dVar.b() >= 600) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public d(int i8) {
        this.f8094a = i8;
    }

    public final int a() {
        return this.f8094a;
    }

    public final long b() {
        return this.f8095b;
    }
}
