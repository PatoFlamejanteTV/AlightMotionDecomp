package h3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32602b = new a(null);

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
    public g3.x a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new g3.x(z2.e.l(json, "client_secret"), z2.e.l(json, "id"));
    }
}
