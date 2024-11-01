package R5;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class X extends AbstractC1419c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f9306a;

    /* renamed from: b, reason: collision with root package name */
    private int f9307b;

    /* renamed from: c, reason: collision with root package name */
    private int f9308c;

    public X(List list) {
        AbstractC3292y.i(list, "list");
        this.f9306a = list;
    }

    public final void c(int i8, int i9) {
        AbstractC1419c.Companion.d(i8, i9, this.f9306a.size());
        this.f9307b = i8;
        this.f9308c = i9 - i8;
    }

    @Override // R5.AbstractC1419c, java.util.List
    public Object get(int i8) {
        AbstractC1419c.Companion.b(i8, this.f9308c);
        return this.f9306a.get(this.f9307b + i8);
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.f9308c;
    }
}
