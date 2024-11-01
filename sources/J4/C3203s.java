package j4;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import w4.C4156a;

/* renamed from: j4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3203s extends r4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f34258b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.H f34259c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34260d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f34261e;

    /* renamed from: j4.s$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4156a entry) {
            AbstractC3292y.i(entry, "entry");
            return AbstractC1435t.e(Q5.x.a(C3203s.this.a(), entry));
        }
    }

    public /* synthetic */ C3203s(r4.G g8, r4.H h8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? r4.G.Companion.e() : g8, (i8 & 2) != 0 ? new r4.s0(new r(), false, null, 6, null) : h8);
    }

    @Override // r4.o0, r4.k0
    public r4.G a() {
        return this.f34258b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f34261e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f34260d;
    }

    @Override // r4.o0, r4.k0
    public InterfaceC3813L d() {
        return A4.g.m(i().l(), new a());
    }

    @Override // r4.o0
    public r4.H i() {
        return this.f34259c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203s(r4.G identifier, r4.H controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f34258b = identifier;
        this.f34259c = controller;
        this.f34260d = true;
    }
}
