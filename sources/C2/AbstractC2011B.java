package c2;

/* renamed from: c2.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2011B {

    /* renamed from: a, reason: collision with root package name */
    final int f15191a;

    /* renamed from: b, reason: collision with root package name */
    final int f15192b;

    /* renamed from: c, reason: collision with root package name */
    final String f15193c;

    /* renamed from: d, reason: collision with root package name */
    final String f15194d;

    /* renamed from: e, reason: collision with root package name */
    final String f15195e;

    /* renamed from: f, reason: collision with root package name */
    final long f15196f;

    /* renamed from: g, reason: collision with root package name */
    int f15197g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B(int i8, int i9, String str, String str2, String str3, long j8) {
        this.f15191a = i8;
        this.f15192b = i9;
        this.f15193c = str;
        this.f15194d = str2;
        this.f15195e = str3;
        this.f15196f = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        if (this.f15197g == 0) {
            this.f15197g = C2013D.c(this.f15195e);
        }
        return this.f15197g;
    }
}
