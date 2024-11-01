package Y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i implements V0.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11763a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11764b = false;

    /* renamed from: c, reason: collision with root package name */
    private V0.c f11765c;

    /* renamed from: d, reason: collision with root package name */
    private final f f11766d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f11766d = fVar;
    }

    private void a() {
        if (!this.f11763a) {
            this.f11763a = true;
            return;
        }
        throw new V0.b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(V0.c cVar, boolean z8) {
        this.f11763a = false;
        this.f11765c = cVar;
        this.f11764b = z8;
    }

    @Override // V0.g
    public V0.g f(String str) {
        a();
        this.f11766d.i(this.f11765c, str, this.f11764b);
        return this;
    }

    @Override // V0.g
    public V0.g g(boolean z8) {
        a();
        this.f11766d.o(this.f11765c, z8, this.f11764b);
        return this;
    }
}
