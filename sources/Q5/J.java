package Q5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class J implements InterfaceC1416k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f8787a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8788b;

    public J(Function0 initializer) {
        AbstractC3292y.i(initializer, "initializer");
        this.f8787a = initializer;
        this.f8788b = E.f8780a;
    }

    @Override // Q5.InterfaceC1416k
    public Object getValue() {
        if (this.f8788b == E.f8780a) {
            Function0 function0 = this.f8787a;
            AbstractC3292y.f(function0);
            this.f8788b = function0.invoke();
            this.f8787a = null;
        }
        return this.f8788b;
    }

    @Override // Q5.InterfaceC1416k
    public boolean isInitialized() {
        if (this.f8788b != E.f8780a) {
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
}
