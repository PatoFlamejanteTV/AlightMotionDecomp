package h3;

import R5.AbstractC1435t;
import R5.N;
import R5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import g3.C2899I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2935D implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final b f32562b = new b(null);

    /* renamed from: h3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0750a f32563b = new C0750a(null);

        /* renamed from: h3.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0750a {
            private C0750a() {
            }

            public /* synthetic */ C0750a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2899I.a a(JSONObject json) {
            List list;
            AbstractC3292y.i(json, "json");
            String l8 = z2.e.l(json, "threeDSServerTransID");
            String l9 = z2.e.l(json, "acsChallengeMandated");
            String l10 = z2.e.l(json, "acsSignedContent");
            String string = json.getString("acsTransID");
            String l11 = z2.e.l(json, "acsURL");
            String l12 = z2.e.l(json, "authenticationType");
            String l13 = z2.e.l(json, "cardholderInfo");
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String l14 = z2.e.l(json, "sdkTransID");
            String l15 = z2.e.l(json, "transStatus");
            JSONArray optJSONArray = json.optJSONArray("messageExtension");
            if (optJSONArray != null) {
                list = new c().c(optJSONArray);
            } else {
                list = null;
            }
            return new C2899I.a(l8, l9, l10, string, l11, l12, l13, list, string2, string3, l14, l15);
        }
    }

    /* renamed from: h3.D$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: h3.D$c */
    /* loaded from: classes4.dex */
    public static final class c implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32564b = new a(null);

        /* renamed from: h3.D$c$a */
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
        public C2899I.c a(JSONObject json) {
            Map h8;
            AbstractC3292y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                i6.i s8 = i6.m.s(0, names.length());
                ArrayList<String> arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(names.getString(((N) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(Q.e(Q5.x.a(str, optJSONObject.getString(str))));
                }
                h8 = Q.h();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h8 = Q.q(h8, (Map) it2.next());
                }
            } else {
                h8 = Q.h();
            }
            return new C2899I.c(z2.e.l(json, "name"), json.optBoolean("criticalityIndicator"), z2.e.l(json, "id"), Q.w(h8));
        }

        public final List c(JSONArray jsonArray) {
            AbstractC3292y.i(jsonArray, "jsonArray");
            i6.i s8 = i6.m.s(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jsonArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((JSONObject) it2.next()));
            }
            return arrayList2;
        }
    }

    /* renamed from: h3.D$d */
    /* loaded from: classes4.dex */
    public static final class d implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32565b = new a(null);

        /* renamed from: h3.D$d$a */
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
        public C2899I.d a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new C2899I.d(json.getString("threeDSServerTransID"), z2.e.l(json, "acsTransID"), z2.e.l(json, "dsTransID"), json.getString("errorCode"), json.getString("errorComponent"), json.getString("errorDescription"), json.getString("errorDetail"), z2.e.l(json, "errorMessageType"), json.getString("messageType"), json.getString("messageVersion"), z2.e.l(json, "sdkTransID"));
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2899I a(JSONObject json) {
        C2899I.a aVar;
        AbstractC3292y.i(json, "json");
        String string = json.getString("id");
        long j8 = json.getLong("created");
        boolean z8 = json.getBoolean("livemode");
        String string2 = json.getString("source");
        String optString = json.optString("state");
        JSONObject optJSONObject = json.optJSONObject("ares");
        C2899I.d dVar = null;
        if (optJSONObject != null) {
            aVar = new a().a(optJSONObject);
        } else {
            aVar = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
        if (optJSONObject2 != null) {
            dVar = new d().a(optJSONObject2);
        }
        return new C2899I(string, aVar, Long.valueOf(j8), string2, optString, z8, dVar, z2.e.l(json, "fallback_redirect_url"), z2.e.l(json, "creq"));
    }
}
