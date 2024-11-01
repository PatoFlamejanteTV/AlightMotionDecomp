package h3;

import g3.C2902a;
import g3.C2904c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2939a implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0751a f32571b = new C0751a(null);

    /* renamed from: h3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0751a {
        private C0751a() {
        }

        public /* synthetic */ C0751a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2902a a(JSONObject json) {
        Object obj;
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "account_range_high");
        String l9 = z2.e.l(json, "account_range_low");
        Integer i8 = z2.e.f41477a.i(json, "pan_length");
        String l10 = z2.e.l(json, "brand");
        Iterator<E> it = C2902a.EnumC0740a.d().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C2902a.EnumC0740a) obj).c(), l10)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2902a.EnumC0740a enumC0740a = (C2902a.EnumC0740a) obj;
        if (l8 == null || l9 == null || i8 == null || enumC0740a == null) {
            return null;
        }
        return new C2902a(new C2904c(l9, l8), i8.intValue(), enumC0740a, z2.e.l(json, "country"));
    }
}
