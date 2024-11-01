package R2;

import P2.b;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f9172a;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9173a;

        static {
            int[] iArr = new int[b.a.EnumC0155b.values().length];
            try {
                iArr[b.a.EnumC0155b.f8007a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC0155b.f8008b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9173a = iArr;
        }
    }

    public c(e linkEventsReporter) {
        AbstractC3292y.i(linkEventsReporter, "linkEventsReporter");
        this.f9172a = linkEventsReporter;
    }

    public final void a() {
        this.f9172a.g();
    }

    public final void b() {
        this.f9172a.d();
    }

    public final void c(P2.b linkActivityResult) {
        AbstractC3292y.i(linkActivityResult, "linkActivityResult");
        if (linkActivityResult instanceof b.a) {
            int i8 = a.f9173a[((b.a) linkActivityResult).a().ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f9172a.l();
                    return;
                }
                return;
            }
            this.f9172a.c();
            return;
        }
        if (linkActivityResult instanceof b.C0156b) {
            this.f9172a.k();
        } else if (linkActivityResult instanceof b.c) {
            this.f9172a.e(((b.c) linkActivityResult).a());
        }
    }
}
