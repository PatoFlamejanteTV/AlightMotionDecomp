package b2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1966d extends AbstractC1968f {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1966d(C1967e c1967e) {
        super(c1967e);
    }

    @Override // b2.AbstractC1968f
    public void a(Object obj, Object obj2) {
        ((X1.a) obj).add(obj2);
    }

    @Override // b2.AbstractC1968f
    public Object c() {
        return new X1.a();
    }

    @Override // b2.AbstractC1968f
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // b2.AbstractC1968f
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // b2.AbstractC1968f
    public AbstractC1968f f(String str) {
        return this.f14913a.f14911c;
    }

    @Override // b2.AbstractC1968f
    public AbstractC1968f g(String str) {
        return this.f14913a.f14911c;
    }
}
