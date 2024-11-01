package h3;

import Q5.s;
import R5.AbstractC1435t;
import R5.N;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import g3.C2894D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32637b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final v f32638c = new v();

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
    public C2894D a(JSONObject json) {
        Object b9;
        AbstractC3292y.i(json, "json");
        try {
            s.a aVar = Q5.s.f8810b;
            JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            } else {
                AbstractC3292y.f(optJSONArray);
            }
            i6.i s8 = i6.m.s(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f32638c;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3292y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a9 = vVar.a(optJSONObject);
                if (a9 != null) {
                    arrayList.add(a9);
                }
            }
            b9 = Q5.s.b(arrayList);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        List m8 = AbstractC1435t.m();
        if (Q5.s.g(b9)) {
            b9 = m8;
        }
        return new C2894D((List) b9);
    }
}
