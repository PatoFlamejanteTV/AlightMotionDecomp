package h3;

import g3.C2903b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32603b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2903b a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        Map k8 = z2.e.f41477a.k(json, "parsed_bank_status");
        if (k8 == null || k8.isEmpty()) {
            k8 = null;
        }
        if (k8 != null) {
            return new C2903b(k8);
        }
        return new C2903b(null, 1, null);
    }
}
