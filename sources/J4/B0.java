package j4;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class B0 implements r4.H {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f33721a = AbstractC3815N.a(Integer.valueOf(g4.n.f32441z0));

    /* renamed from: b, reason: collision with root package name */
    private final q6.w f33722b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f33723c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f33724d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f33725e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f33726f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f33727g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f33728h;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33729a = new a();

        a() {
            super(1);
        }

        public final String a(boolean z8) {
            return String.valueOf(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33730a = new b();

        b() {
            super(2);
        }

        public final C4156a a(boolean z8, String str) {
            return new C4156a(str, z8);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public B0(boolean z8) {
        q6.w a9 = AbstractC3815N.a(Boolean.valueOf(z8));
        this.f33722b = a9;
        this.f33723c = a9;
        this.f33724d = A4.g.m(a9, a.f33729a);
        this.f33725e = j();
        this.f33726f = A4.g.n(null);
        this.f33727g = A4.g.n(Boolean.TRUE);
        this.f33728h = A4.g.d(t(), v(), b.f33730a);
    }

    public InterfaceC3813L b() {
        return this.f33721a;
    }

    @Override // r4.m0
    public InterfaceC3813L getError() {
        return this.f33726f;
    }

    public InterfaceC3813L j() {
        return this.f33724d;
    }

    @Override // r4.H
    public InterfaceC3813L l() {
        return this.f33728h;
    }

    @Override // r4.H
    public void q(String rawValue) {
        boolean z8;
        AbstractC3292y.i(rawValue, "rawValue");
        Boolean L02 = l6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    @Override // r4.H
    public InterfaceC3813L t() {
        return this.f33727g;
    }

    public InterfaceC3813L v() {
        return this.f33725e;
    }

    public final InterfaceC3813L w() {
        return this.f33723c;
    }

    public final void x(boolean z8) {
        this.f33722b.setValue(Boolean.valueOf(z8));
    }
}
