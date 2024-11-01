package U5;

import Q5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i implements d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f10150b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10151c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final d f10152a;
    private volatile Object result;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public i(d delegate, Object obj) {
        AbstractC3292y.i(delegate, "delegate");
        this.f10152a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        V5.a aVar = V5.a.f10656b;
        if (obj == aVar) {
            if (androidx.concurrent.futures.a.a(f10151c, this, aVar, V5.b.e())) {
                return V5.b.e();
            }
            obj = this.result;
        }
        if (obj == V5.a.f10657c) {
            return V5.b.e();
        }
        if (!(obj instanceof s.b)) {
            return obj;
        }
        throw ((s.b) obj).f8812a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d dVar = this.f10152a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // U5.d
    public g getContext() {
        return this.f10152a.getContext();
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            V5.a aVar = V5.a.f10656b;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.a.a(f10151c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 == V5.b.e()) {
                if (androidx.concurrent.futures.a.a(f10151c, this, V5.b.e(), V5.a.f10657c)) {
                    this.f10152a.resumeWith(obj);
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f10152a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d delegate) {
        this(delegate, V5.a.f10656b);
        AbstractC3292y.i(delegate, "delegate");
    }
}
