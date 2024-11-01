package Q5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements InterfaceC1416k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f8818a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f8819b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8820c;

    public v(Function0 initializer, Object obj) {
        AbstractC3292y.i(initializer, "initializer");
        this.f8818a = initializer;
        this.f8819b = E.f8780a;
        this.f8820c = obj == null ? this : obj;
    }

    @Override // Q5.InterfaceC1416k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f8819b;
        E e8 = E.f8780a;
        if (obj2 != e8) {
            return obj2;
        }
        synchronized (this.f8820c) {
            obj = this.f8819b;
            if (obj == e8) {
                Function0 function0 = this.f8818a;
                AbstractC3292y.f(function0);
                obj = function0.invoke();
                this.f8819b = obj;
                this.f8818a = null;
            }
        }
        return obj;
    }

    @Override // Q5.InterfaceC1416k
    public boolean isInitialized() {
        if (this.f8819b != E.f8780a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ v(Function0 function0, Object obj, int i8, AbstractC3284p abstractC3284p) {
        this(function0, (i8 & 2) != 0 ? null : obj);
    }
}
