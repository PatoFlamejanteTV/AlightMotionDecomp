package j4;

import h4.InterfaceC2949a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;

/* renamed from: j4.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3165H implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33811a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2949a f33812b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.G f33813c;

    /* renamed from: d, reason: collision with root package name */
    private final C3164G f33814d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33815e;

    /* renamed from: f, reason: collision with root package name */
    private final C2.c f33816f;

    public C3165H(InterfaceC3560b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2949a cbcEligibility, r4.G identifier, C3164G controller) {
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(initialValues, "initialValues");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f33811a = z8;
        this.f33812b = cbcEligibility;
        this.f33813c = identifier;
        this.f33814d = controller;
        this.f33815e = true;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f33813c;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f33816f;
    }

    @Override // r4.D
    public boolean c() {
        return this.f33815e;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return f().v().d();
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return f().v().e();
    }

    public C3164G f() {
        return this.f33814d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3165H(p2.InterfaceC3560b.a r8, java.util.Map r9, boolean r10, h4.InterfaceC2949a r11, r4.G r12, j4.C3164G r13, int r14, kotlin.jvm.internal.AbstractC3284p r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto L7
            r10 = 0
            r3 = 0
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r14 & 8
            if (r10 == 0) goto Le
            h4.a$c r11 = h4.InterfaceC2949a.c.f32646a
        Le:
            r4 = r11
            r10 = r14 & 32
            if (r10 == 0) goto L18
            j4.G r13 = new j4.G
            r13.<init>(r8, r9, r3, r4)
        L18:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C3165H.<init>(p2.b$a, java.util.Map, boolean, h4.a, r4.G, j4.G, int, kotlin.jvm.internal.p):void");
    }
}
