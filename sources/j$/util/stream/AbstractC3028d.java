package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3028d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f33458a;

    /* renamed from: b, reason: collision with root package name */
    protected int f33459b;

    /* renamed from: c, reason: collision with root package name */
    protected int f33460c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f33461d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3028d() {
        this.f33458a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3028d(int i8) {
        if (i8 >= 0) {
            this.f33458a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i8 - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
    }

    public abstract void clear();

    public final long count() {
        int i8 = this.f33460c;
        return i8 == 0 ? this.f33459b : this.f33461d[i8] + this.f33459b;
    }
}
