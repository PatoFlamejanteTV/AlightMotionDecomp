package d7;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2774c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f31519a;

    public AbstractC2774c(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f31519a;
    }
}
