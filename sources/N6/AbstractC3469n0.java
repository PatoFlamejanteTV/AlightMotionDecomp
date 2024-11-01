package n6;

import U5.g;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: n6.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3469n0 extends I implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35738a = new a(null);

    /* renamed from: n6.n0$a */
    /* loaded from: classes5.dex */
    public static final class a extends U5.b {

        /* renamed from: n6.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0813a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0813a f35739a = new C0813a();

            C0813a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3469n0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC3469n0) {
                    return (AbstractC3469n0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }

        private a() {
            super(I.Key, C0813a.f35739a);
        }
    }
}
