package h3;

import androidx.autofill.HintConstants;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32618b = new a(null);

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
        private static final a f32619b = new a(null);

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
        public n.g a(JSONObject json) {
            com.stripe.android.model.o oVar;
            AbstractC3292y.i(json, "json");
            String l8 = z2.e.l(json, "charge");
            String l9 = z2.e.l(json, "code");
            String l10 = z2.e.l(json, "decline_code");
            String l11 = z2.e.l(json, "doc_url");
            String l12 = z2.e.l(json, "message");
            String l13 = z2.e.l(json, "param");
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            if (optJSONObject != null) {
                oVar = new v().a(optJSONObject);
            } else {
                oVar = null;
            }
            return new n.g(l8, l9, l10, l11, l12, l13, oVar, n.g.c.f25612b.a(z2.e.l(json, "type")));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32620b = new a(null);

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
        public n.h a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3292y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject == null || (aVar = new C2940b().a(optJSONObject)) == null) {
                aVar = new com.stripe.android.model.a(null, null, null, null, null, null, 63, null);
            }
            return new n.h(aVar, z2.e.l(json, "carrier"), z2.e.l(json, "name"), z2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE), z2.e.l(json, "tracking_number"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0135 A[LOOP:0: B:28:0x012d->B:30:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0173 A[LOOP:1: B:33:0x016d->B:35:0x0173, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.stripe.android.model.n a(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.u.a(org.json.JSONObject):com.stripe.android.model.n");
    }
}
