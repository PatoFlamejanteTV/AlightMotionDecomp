package h3;

import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32639b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32640b = new a(null);

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
        public u.e a(JSONObject json) {
            com.stripe.android.model.o oVar;
            AbstractC3292y.i(json, "json");
            String l8 = z2.e.l(json, "code");
            String l9 = z2.e.l(json, "decline_code");
            String l10 = z2.e.l(json, "doc_url");
            String l11 = z2.e.l(json, "message");
            String l12 = z2.e.l(json, "param");
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            if (optJSONObject != null) {
                oVar = new v().a(optJSONObject);
            } else {
                oVar = null;
            }
            return new u.e(l8, l9, l10, l11, l12, oVar, u.e.c.f25950b.a(z2.e.l(json, "type")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:16:0x0059->B:18:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[LOOP:1: B:21:0x008f->B:23:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.stripe.android.model.u a(org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.x.a(org.json.JSONObject):com.stripe.android.model.u");
    }
}
