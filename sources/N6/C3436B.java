package n6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3436B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35620a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3466m f35621b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f35622c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35623d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f35624e;

    public C3436B(Object obj, AbstractC3466m abstractC3466m, Function1 function1, Object obj2, Throwable th) {
        this.f35620a = obj;
        this.f35621b = abstractC3466m;
        this.f35622c = function1;
        this.f35623d = obj2;
        this.f35624e = th;
    }

    public static /* synthetic */ C3436B b(C3436B c3436b, Object obj, AbstractC3466m abstractC3466m, Function1 function1, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = c3436b.f35620a;
        }
        if ((i8 & 2) != 0) {
            abstractC3466m = c3436b.f35621b;
        }
        AbstractC3466m abstractC3466m2 = abstractC3466m;
        if ((i8 & 4) != 0) {
            function1 = c3436b.f35622c;
        }
        Function1 function12 = function1;
        if ((i8 & 8) != 0) {
            obj2 = c3436b.f35623d;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = c3436b.f35624e;
        }
        return c3436b.a(obj, abstractC3466m2, function12, obj4, th);
    }

    public final C3436B a(Object obj, AbstractC3466m abstractC3466m, Function1 function1, Object obj2, Throwable th) {
        return new C3436B(obj, abstractC3466m, function1, obj2, th);
    }

    public final boolean c() {
        if (this.f35624e != null) {
            return true;
        }
        return false;
    }

    public final void d(C3472p c3472p, Throwable th) {
        AbstractC3466m abstractC3466m = this.f35621b;
        if (abstractC3466m != null) {
            c3472p.l(abstractC3466m, th);
        }
        Function1 function1 = this.f35622c;
        if (function1 != null) {
            c3472p.p(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3436B)) {
            return false;
        }
        C3436B c3436b = (C3436B) obj;
        if (AbstractC3292y.d(this.f35620a, c3436b.f35620a) && AbstractC3292y.d(this.f35621b, c3436b.f35621b) && AbstractC3292y.d(this.f35622c, c3436b.f35622c) && AbstractC3292y.d(this.f35623d, c3436b.f35623d) && AbstractC3292y.d(this.f35624e, c3436b.f35624e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f35620a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        AbstractC3466m abstractC3466m = this.f35621b;
        if (abstractC3466m == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC3466m.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Function1 function1 = this.f35622c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Object obj2 = this.f35623d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Throwable th = this.f35624e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f35620a + ", cancelHandler=" + this.f35621b + ", onCancellation=" + this.f35622c + ", idempotentResume=" + this.f35623d + ", cancelCause=" + this.f35624e + ')';
    }

    public /* synthetic */ C3436B(Object obj, AbstractC3466m abstractC3466m, Function1 function1, Object obj2, Throwable th, int i8, AbstractC3284p abstractC3284p) {
        this(obj, (i8 & 2) != 0 ? null : abstractC3466m, (i8 & 4) != 0 ? null : function1, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
