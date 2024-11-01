package h3;

import j3.C3153d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r implements A2.a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f32604c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f32605b;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public r(Function0 timestampSupplier) {
        AbstractC3292y.i(timestampSupplier, "timestampSupplier");
        this.f32605b = timestampSupplier;
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3153d a(JSONObject json) {
        String l8;
        String l9;
        AbstractC3292y.i(json, "json");
        String l10 = z2.e.l(json, "guid");
        if (l10 == null || (l8 = z2.e.l(json, "muid")) == null || (l9 = z2.e.l(json, "sid")) == null) {
            return null;
        }
        return new C3153d(l10, l8, l9, ((Number) this.f32605b.invoke()).longValue());
    }
}
