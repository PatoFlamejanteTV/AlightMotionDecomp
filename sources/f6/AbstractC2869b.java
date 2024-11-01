package f6;

import j6.i;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2869b implements InterfaceC2872e {

    /* renamed from: a, reason: collision with root package name */
    private Object f31919a;

    public AbstractC2869b(Object obj) {
        this.f31919a = obj;
    }

    protected abstract void a(i iVar, Object obj, Object obj2);

    protected boolean b(i property, Object obj, Object obj2) {
        AbstractC3292y.i(property, "property");
        return true;
    }

    @Override // f6.InterfaceC2872e, f6.InterfaceC2871d
    public Object getValue(Object obj, i property) {
        AbstractC3292y.i(property, "property");
        return this.f31919a;
    }

    @Override // f6.InterfaceC2872e
    public void setValue(Object obj, i property, Object obj2) {
        AbstractC3292y.i(property, "property");
        Object obj3 = this.f31919a;
        if (!b(property, obj3, obj2)) {
            return;
        }
        this.f31919a = obj2;
        a(property, obj3, obj2);
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f31919a + ')';
    }
}
