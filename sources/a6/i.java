package A6;

import A6.k;
import C6.l0;
import Q5.I;
import R5.AbstractC1428l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;

/* loaded from: classes5.dex */
public abstract class i {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final a f285a = new a();

        a() {
            super(1);
        }

        public final void a(A6.a aVar) {
            AbstractC3292y.i(aVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A6.a) obj);
            return I.f8786a;
        }
    }

    public static final f a(String serialName, e kind) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(kind, "kind");
        if (!n.T(serialName)) {
            return l0.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String serialName, j kind, f[] typeParameters, Function1 builder) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(kind, "kind");
        AbstractC3292y.i(typeParameters, "typeParameters");
        AbstractC3292y.i(builder, "builder");
        if (!n.T(serialName)) {
            if (!AbstractC3292y.d(kind, k.a.f288a)) {
                A6.a aVar = new A6.a(serialName);
                builder.invoke(aVar);
                return new g(serialName, kind, aVar.f().size(), AbstractC1428l.V0(typeParameters), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ f c(String str, j jVar, f[] fVarArr, Function1 function1, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            function1 = a.f285a;
        }
        return b(str, jVar, fVarArr, function1);
    }
}
