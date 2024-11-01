package x0;

import java.util.NoSuchElementException;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4179b extends S {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0929b f40860a = EnumC0929b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f40861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40862a;

        static {
            int[] iArr = new int[EnumC0929b.values().length];
            f40862a = iArr;
            try {
                iArr[EnumC0929b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40862a[EnumC0929b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0929b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f40860a = EnumC0929b.FAILED;
        this.f40861b = a();
        if (this.f40860a != EnumC0929b.DONE) {
            this.f40860a = EnumC0929b.READY;
            return true;
        }
        return false;
    }

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b() {
        this.f40860a = EnumC0929b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z8;
        if (this.f40860a != EnumC0929b.FAILED) {
            z8 = true;
        } else {
            z8 = false;
        }
        w0.h.n(z8);
        int i8 = a.f40862a[this.f40860a.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f40860a = EnumC0929b.NOT_READY;
            Object a9 = AbstractC4176E.a(this.f40861b);
            this.f40861b = null;
            return a9;
        }
        throw new NoSuchElementException();
    }
}
