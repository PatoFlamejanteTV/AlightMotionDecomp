package h3;

import R5.N;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import g3.C2902a;
import g3.C2908g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C3559a;

/* renamed from: h3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2943e implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private final C3559a f32575b;

    /* renamed from: c, reason: collision with root package name */
    private final C2939a f32576c;

    public C2943e(C3559a bin) {
        AbstractC3292y.i(bin, "bin");
        this.f32575b = bin;
        this.f32576c = new C2939a();
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2908g a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        i6.i s8 = i6.m.s(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            C2939a c2939a = this.f32576c;
            JSONObject jSONObject = optJSONArray.getJSONObject(nextInt);
            AbstractC3292y.h(jSONObject, "getJSONObject(...)");
            C2902a a9 = c2939a.a(jSONObject);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        return new C2908g(this.f32575b, arrayList);
    }
}
