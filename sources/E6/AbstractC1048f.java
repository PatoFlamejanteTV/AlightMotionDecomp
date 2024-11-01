package E6;

import R5.C1427k;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1048f {

    /* renamed from: a, reason: collision with root package name */
    private final C1427k f2067a = new C1427k();

    /* renamed from: b, reason: collision with root package name */
    private int f2068b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(char[] array) {
        int i8;
        AbstractC3292y.i(array, "array");
        synchronized (this) {
            try {
                int length = this.f2068b + array.length;
                i8 = AbstractC1046d.f2065a;
                if (length < i8) {
                    this.f2068b += array.length;
                    this.f2067a.e(array);
                }
                Q5.I i9 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final char[] b(int i8) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f2067a.B();
            if (cArr != null) {
                this.f2068b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i8];
        }
        return cArr;
    }
}
