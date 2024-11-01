package A2;

import R5.AbstractC1435t;
import R5.N;
import i6.i;
import i6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.f;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0000a f148a = C0000a.f149a;

    /* renamed from: A2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0000a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0000a f149a = new C0000a();

        private C0000a() {
        }

        public final List a(JSONArray jSONArray) {
            if (jSONArray != null) {
                i s8 = m.s(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.getString(((N) it).nextInt()));
                }
                return arrayList;
            }
            return AbstractC1435t.m();
        }
    }

    f a(JSONObject jSONObject);
}
