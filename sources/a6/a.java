package A6;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f244a;

    /* renamed from: b, reason: collision with root package name */
    private List f245b;

    /* renamed from: c, reason: collision with root package name */
    private final List f246c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f247d;

    /* renamed from: e, reason: collision with root package name */
    private final List f248e;

    /* renamed from: f, reason: collision with root package name */
    private final List f249f;

    /* renamed from: g, reason: collision with root package name */
    private final List f250g;

    public a(String serialName) {
        AbstractC3292y.i(serialName, "serialName");
        this.f244a = serialName;
        this.f245b = AbstractC1435t.m();
        this.f246c = new ArrayList();
        this.f247d = new HashSet();
        this.f248e = new ArrayList();
        this.f249f = new ArrayList();
        this.f250g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = AbstractC1435t.m();
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        aVar.a(str, fVar, list, z8);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z8) {
        AbstractC3292y.i(elementName, "elementName");
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(annotations, "annotations");
        if (this.f247d.add(elementName)) {
            this.f246c.add(elementName);
            this.f248e.add(descriptor);
            this.f249f.add(annotations);
            this.f250g.add(Boolean.valueOf(z8));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f244a).toString());
    }

    public final List c() {
        return this.f245b;
    }

    public final List d() {
        return this.f249f;
    }

    public final List e() {
        return this.f248e;
    }

    public final List f() {
        return this.f246c;
    }

    public final List g() {
        return this.f250g;
    }

    public final void h(List list) {
        AbstractC3292y.i(list, "<set-?>");
        this.f245b = list;
    }
}
