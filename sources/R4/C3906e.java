package r4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p4.C3577b;
import p4.InterfaceC3576a;

/* renamed from: r4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3906e {

    /* renamed from: a, reason: collision with root package name */
    private final List f38363a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f38364b;

    public C3906e(C3577b schemaRegistry) {
        AbstractC3292y.i(schemaRegistry, "schemaRegistry");
        this.f38363a = p4.h.g(schemaRegistry.b().a(), schemaRegistry.b().b());
        Map a9 = schemaRegistry.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(R5.Q.d(a9.size()));
        for (Map.Entry entry : a9.entrySet()) {
            linkedHashMap.put(entry.getKey(), p4.h.g(((InterfaceC3576a) entry.getValue()).a(), (String) entry.getKey()));
        }
        this.f38364b = linkedHashMap;
    }

    public final List a(String str) {
        if (str != null) {
            return (List) this.f38364b.get(str);
        }
        return this.f38363a;
    }
}
