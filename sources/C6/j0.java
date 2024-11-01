package C6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class j0 extends AbstractC1026p {

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(y6.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC3292y.i(primitiveSerializer, "primitiveSerializer");
        this.f1070b = new i0(primitiveSerializer.a());
    }

    @Override // C6.AbstractC1026p, y6.b, y6.i, y6.InterfaceC4248a
    public final A6.f a() {
        return this.f1070b;
    }

    @Override // C6.AbstractC1005a, y6.InterfaceC4248a
    public final Object d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return k(decoder, null);
    }

    @Override // C6.AbstractC1026p, y6.i
    public final void e(B6.f encoder, Object obj) {
        AbstractC3292y.i(encoder, "encoder");
        int j8 = j(obj);
        A6.f fVar = this.f1070b;
        B6.d l8 = encoder.l(fVar, j8);
        z(l8, obj, j8);
        l8.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    public final Iterator i(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final h0 f() {
        return (h0) p(w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(h0 h0Var) {
        AbstractC3292y.i(h0Var, "<this>");
        return h0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(h0 h0Var, int i8) {
        AbstractC3292y.i(h0Var, "<this>");
        h0Var.b(i8);
    }

    protected abstract Object w();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(h0 h0Var, int i8, Object obj) {
        AbstractC3292y.i(h0Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Object q(h0 h0Var) {
        AbstractC3292y.i(h0Var, "<this>");
        return h0Var.a();
    }

    protected abstract void z(B6.d dVar, Object obj, int i8);
}
