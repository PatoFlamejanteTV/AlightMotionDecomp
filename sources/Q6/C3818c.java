package q6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3284p;
import p6.EnumC3588a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3818c extends r6.e {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37405f = AtomicIntegerFieldUpdater.newUpdater(C3818c.class, "consumed");
    private volatile int consumed;

    /* renamed from: d, reason: collision with root package name */
    private final p6.u f37406d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37407e;

    public /* synthetic */ C3818c(p6.u uVar, boolean z8, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, AbstractC3284p abstractC3284p) {
        this(uVar, z8, (i9 & 4) != 0 ? U5.h.f10149a : gVar, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? EnumC3588a.SUSPEND : enumC3588a);
    }

    private final void n() {
        if (this.f37407e && f37405f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // r6.e, q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        if (this.f38794b == -3) {
            n();
            Object d8 = AbstractC3825j.d(interfaceC3822g, this.f37406d, this.f37407e, dVar);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return Q5.I.f8786a;
        }
        Object collect = super.collect(interfaceC3822g, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }

    @Override // r6.e
    protected String e() {
        return "channel=" + this.f37406d;
    }

    @Override // r6.e
    protected Object h(p6.s sVar, U5.d dVar) {
        Object d8 = AbstractC3825j.d(new r6.w(sVar), this.f37406d, this.f37407e, dVar);
        if (d8 == V5.b.e()) {
            return d8;
        }
        return Q5.I.f8786a;
    }

    @Override // r6.e
    protected r6.e i(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return new C3818c(this.f37406d, this.f37407e, gVar, i8, enumC3588a);
    }

    @Override // r6.e
    public InterfaceC3821f j() {
        return new C3818c(this.f37406d, this.f37407e, null, 0, null, 28, null);
    }

    @Override // r6.e
    public p6.u m(n6.M m8) {
        n();
        if (this.f38794b == -3) {
            return this.f37406d;
        }
        return super.m(m8);
    }

    public C3818c(p6.u uVar, boolean z8, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(gVar, i8, enumC3588a);
        this.f37406d = uVar;
        this.f37407e = z8;
        this.consumed = 0;
    }
}
