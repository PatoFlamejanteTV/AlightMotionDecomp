package C6;

import B6.c;
import i6.C2979g;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class T extends AbstractC1005a {

    /* renamed from: a, reason: collision with root package name */
    private final y6.b f1025a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.b f1026b;

    public /* synthetic */ T(y6.b bVar, y6.b bVar2, AbstractC3284p abstractC3284p) {
        this(bVar, bVar2);
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
        int i9 = 0;
        while (i8.hasNext()) {
            Map.Entry entry = (Map.Entry) i8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i9 + 1;
            l8.n(a(), i9, r(), key);
            i9 += 2;
            l8.n(a(), i10, s(), value);
        }
        l8.a(a9);
    }

    public final y6.b r() {
        return this.f1025a;
    }

    public final y6.b s() {
        return this.f1026b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(B6.c decoder, Map builder, int i8, int i9) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        if (i9 >= 0) {
            C2979g r8 = i6.m.r(i6.m.s(0, i9 * 2), 2);
            int e8 = r8.e();
            int g8 = r8.g();
            int j8 = r8.j();
            if ((j8 <= 0 || e8 > g8) && (j8 >= 0 || g8 > e8)) {
                return;
            }
            while (true) {
                m(decoder, i8 + e8, builder, false);
                if (e8 != g8) {
                    e8 += j8;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(B6.c decoder, int i8, Map builder, boolean z8) {
        int i9;
        Object c8;
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        Object c9 = c.a.c(decoder, a(), i8, this.f1025a, null, 8, null);
        if (z8) {
            i9 = decoder.y(a());
            if (i9 != i8 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + i9).toString());
            }
        } else {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (builder.containsKey(c9) && !(this.f1026b.a().getKind() instanceof A6.e)) {
            c8 = decoder.p(a(), i10, this.f1026b, R5.Q.i(builder, c9));
        } else {
            c8 = c.a.c(decoder, a(), i10, this.f1026b, null, 8, null);
        }
        builder.put(c9, c8);
    }

    private T(y6.b bVar, y6.b bVar2) {
        super(null);
        this.f1025a = bVar;
        this.f1026b = bVar2;
    }
}
