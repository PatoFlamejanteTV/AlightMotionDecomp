package G1;

import C1.n;
import G1.a;
import I1.e;
import I1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f2760a;

    public c(a aVar) {
        this.f2760a = aVar;
    }

    @Override // G1.a
    public JSONObject a(View view) {
        JSONObject c8 = I1.c.c(0, 0, 0, 0);
        I1.c.e(c8, e.a());
        return c8;
    }

    ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        F1.c e8 = F1.c.e();
        if (e8 != null) {
            Collection a9 = e8.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a9.size() * 2) + 3);
            Iterator it = a9.iterator();
            while (it.hasNext()) {
                View o8 = ((n) it.next()).o();
                if (o8 != null && h.e(o8) && (rootView = o8.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c8 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c((View) arrayList.get(size - 1)) > c8) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // G1.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0041a interfaceC0041a, boolean z8, boolean z9) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            interfaceC0041a.a((View) it.next(), this.f2760a, jSONObject, z9);
        }
    }
}
