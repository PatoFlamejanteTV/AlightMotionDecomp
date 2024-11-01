package C6;

import B6.c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1026p extends AbstractC1005a {

    /* renamed from: a, reason: collision with root package name */
    private final y6.b f1086a;

    public /* synthetic */ AbstractC1026p(y6.b bVar, AbstractC3284p abstractC3284p) {
        this(bVar);
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public abstract A6.f a();

    @Override // y6.i
    public void e(B6.f encoder, Object obj) {
        AbstractC3292y.i(encoder, "encoder");
        int j8 = j(obj);
        A6.f a9 = a();
        B6.d l8 = encoder.l(a9, j8);
        Iterator i8 = i(obj);
        for (int i9 = 0; i9 < j8; i9++) {
            l8.n(a(), i9, this.f1086a, i8.next());
        }
        l8.a(a9);
    }

    @Override // C6.AbstractC1005a
    protected final void l(B6.c decoder, Object obj, int i8, int i9) {
        AbstractC3292y.i(decoder, "decoder");
        if (i9 >= 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(decoder, i8 + i10, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // C6.AbstractC1005a
    protected void m(B6.c decoder, int i8, Object obj, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        s(obj, i8, c.a.c(decoder, a(), i8, this.f1086a, null, 8, null));
    }

    protected abstract void s(Object obj, int i8, Object obj2);

    private AbstractC1026p(y6.b bVar) {
        super(null);
        this.f1086a = bVar;
    }
}
