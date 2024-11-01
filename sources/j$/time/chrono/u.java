package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u implements n {
    public static final u BCE;
    public static final u CE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ u[] f32870a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.u] */
    static {
        ?? r22 = new Enum("BCE", 0);
        BCE = r22;
        ?? r32 = new Enum("CE", 1);
        CE = r32;
        f32870a = new u[]{r22, r32};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f32870a.clone();
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
