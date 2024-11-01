package h3;

import g3.O;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2938G implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32570b = new a(null);

    /* renamed from: h3.G$a */
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
    public O a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new O(z2.e.l(json, "statement_descriptor"), z2.e.l(json, "android_appId"), z2.e.l(json, "android_nonceStr"), z2.e.l(json, "android_package"), z2.e.l(json, "android_partnerId"), z2.e.l(json, "android_prepayId"), z2.e.l(json, "android_sign"), z2.e.l(json, "android_timeStamp"), z2.e.l(json, "qr_code_url"));
    }
}
