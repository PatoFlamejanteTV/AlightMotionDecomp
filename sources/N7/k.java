package N7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6902b = M7.b.i(k.class);

    /* renamed from: a, reason: collision with root package name */
    private final String f6903a;

    public k(String str) {
        this.f6903a = str;
    }

    private j a(g gVar) {
        if (gVar.a().isEmpty()) {
            return null;
        }
        return new j(this.f6903a + gVar);
    }

    private j b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((g) it.next()).a());
            }
            jSONObject.put("requests", jSONArray);
            return new j(this.f6903a, jSONObject, list.size());
        } catch (JSONException e8) {
            V7.a.b(f6902b).i(e8, "Cannot create json object:\n%s", TextUtils.join(", ", list));
            return null;
        }
    }

    public List c(List list) {
        j b9;
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        if (list.size() == 1) {
            j a9 = a((g) list.get(0));
            if (a9 == null) {
                return Collections.emptyList();
            }
            return Collections.singletonList(a9);
        }
        ArrayList arrayList = new ArrayList((int) Math.ceil((list.size() * 1.0d) / 20.0d));
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8 + 20;
            List subList = list.subList(i8, Math.min(i9, list.size()));
            if (subList.size() == 1) {
                b9 = a((g) subList.get(0));
            } else {
                b9 = b(subList);
            }
            if (b9 != null) {
                arrayList.add(b9);
            }
            i8 = i9;
        }
        return arrayList;
    }
}
