package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class E implements n {
    public static final E BEFORE_ROC;
    public static final E ROC;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ E[] f32825a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.E] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.E] */
    static {
        ?? r22 = new Enum("BEFORE_ROC", 0);
        BEFORE_ROC = r22;
        ?? r32 = new Enum("ROC", 1);
        ROC = r32;
        f32825a = new E[]{r22, r32};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f32825a.clone();
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
