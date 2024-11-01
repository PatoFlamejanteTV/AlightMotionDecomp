package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends C1050h {

    /* renamed from: c, reason: collision with root package name */
    private final D6.a f2076c;

    /* renamed from: d, reason: collision with root package name */
    private int f2077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC1063v writer, D6.a json) {
        super(writer);
        AbstractC3292y.i(writer, "writer");
        AbstractC3292y.i(json, "json");
        this.f2076c = json;
    }

    @Override // E6.C1050h
    public void b() {
        n(true);
        this.f2077d++;
    }

    @Override // E6.C1050h
    public void c() {
        n(false);
        j("\n");
        int i8 = this.f2077d;
        for (int i9 = 0; i9 < i8; i9++) {
            j(this.f2076c.d().l());
        }
    }

    @Override // E6.C1050h
    public void o() {
        e(' ');
    }

    @Override // E6.C1050h
    public void p() {
        this.f2077d--;
    }
}
