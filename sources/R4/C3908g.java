package r4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: r4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3908g extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f38411b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38412c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f38413d;

    /* renamed from: e, reason: collision with root package name */
    private final C3907f f38414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3908g(G identifier, v0 config, Function0 function0) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(config, "config");
        this.f38411b = identifier;
        this.f38412c = true;
        this.f38414e = new C3907f(config, function0, null, 4, null);
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38411b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38413d;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38412c;
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3907f i() {
        return this.f38414e;
    }
}
