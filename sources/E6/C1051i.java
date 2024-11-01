package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1051i extends C1050h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051i(InterfaceC1063v writer, boolean z8) {
        super(writer);
        AbstractC3292y.i(writer, "writer");
        this.f2074c = z8;
    }

    @Override // E6.C1050h
    public void m(String value) {
        AbstractC3292y.i(value, "value");
        if (this.f2074c) {
            super.m(value);
        } else {
            super.j(value);
        }
    }
}
