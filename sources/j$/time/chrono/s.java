package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ s[] f32868a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.chrono.s] */
    static {
        ?? r12 = new Enum("AH", 0);
        AH = r12;
        f32868a = new s[]{r12};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f32868a.clone();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC2991i.i(this, rVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return AbstractC2991i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.ERA ? j$.time.temporal.w.j(1L, 1L) : j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long r(j$.time.temporal.r rVar) {
        return AbstractC2991i.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return AbstractC2991i.m(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }
}
