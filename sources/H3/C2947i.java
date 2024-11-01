package h3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2947i implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32580b = new a(null);

    /* renamed from: h3.i$a */
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
    public g3.p a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new g3.p(z2.e.f41477a.f(json, "exists"), new C2946h().a(json), z2.e.l(json, "error_message"), (String) null, 8, (AbstractC3284p) null);
    }
}
