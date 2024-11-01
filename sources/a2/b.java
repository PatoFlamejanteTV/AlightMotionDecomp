package A2;

import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import org.json.JSONObject;
import v2.f;
import z2.e;

/* loaded from: classes4.dex */
public final class b implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f150b = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0001b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0001b(JSONObject jSONObject) {
            super(1);
            this.f151a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(String str) {
            return x.a(str, this.f151a.get(str).toString());
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(JSONObject json) {
        Object b9;
        Map map;
        AbstractC3292y.i(json, "json");
        try {
            s.a aVar = s.f8810b;
            JSONObject jSONObject = json.getJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
            String l8 = e.l(jSONObject, "charge");
            String l9 = e.l(jSONObject, "code");
            String l10 = e.l(jSONObject, "decline_code");
            String l11 = e.l(jSONObject, "message");
            String l12 = e.l(jSONObject, "param");
            String l13 = e.l(jSONObject, "type");
            String l14 = e.l(jSONObject, "doc_url");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra_fields");
            if (optJSONObject != null) {
                AbstractC3292y.f(optJSONObject);
                Iterator<String> keys = optJSONObject.keys();
                AbstractC3292y.h(keys, "keys(...)");
                map = Q.x(AbstractC3258j.y(AbstractC3258j.c(keys), new C0001b(optJSONObject)));
            } else {
                map = null;
            }
            b9 = s.b(new f(l13, l11, l9, l12, l10, l8, l14, map));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        f fVar = new f(null, "An improperly formatted error response was found.", null, null, null, null, null, null, 253, null);
        if (s.g(b9)) {
            b9 = fVar;
        }
        return (f) b9;
    }
}
