package T2;

import g3.C2916o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final C2916o f9967a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9968b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9969c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9970d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9971e;

    /* renamed from: f, reason: collision with root package name */
    private final a f9972f;

    public b(C2916o consumerSession) {
        boolean z8;
        a aVar;
        AbstractC3292y.i(consumerSession, "consumerSession");
        this.f9967a = consumerSession;
        this.f9968b = consumerSession.f();
        this.f9969c = consumerSession.d();
        this.f9970d = consumerSession.b();
        if (!b(consumerSession) && !f(consumerSession)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f9971e = z8;
        if (z8) {
            aVar = a.f9960a;
        } else if (a(consumerSession)) {
            aVar = a.f9962c;
        } else {
            aVar = a.f9961b;
        }
        this.f9972f = aVar;
    }

    private final boolean a(C2916o c2916o) {
        Object obj;
        Iterator it = c2916o.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C2916o.d dVar = (C2916o.d) obj;
                if (dVar.f() == C2916o.d.e.f32205f && dVar.b() == C2916o.d.EnumC0743d.f32193d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean b(C2916o c2916o) {
        Object obj;
        Iterator it = c2916o.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C2916o.d dVar = (C2916o.d) obj;
                if (dVar.f() == C2916o.d.e.f32205f && dVar.b() == C2916o.d.EnumC0743d.f32195f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean f(C2916o c2916o) {
        Object obj;
        Iterator it = c2916o.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C2916o.d dVar = (C2916o.d) obj;
                if (dVar.f() == C2916o.d.e.f32203d && dVar.b() == C2916o.d.EnumC0743d.f32193d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final a c() {
        return this.f9972f;
    }

    public final String d() {
        return this.f9969c;
    }

    public final String e() {
        return this.f9970d;
    }
}
