package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class K implements n {
    public static final K BE;
    public static final K BEFORE_BE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ K[] f32832a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.K] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.K] */
    static {
        ?? r22 = new Enum("BEFORE_BE", 0);
        BEFORE_BE = r22;
        ?? r32 = new Enum("BE", 1);
        BE = r32;
        f32832a = new K[]{r22, r32};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f32832a.clone();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC2991i.i(this, rVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return AbstractC2991i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
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
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
