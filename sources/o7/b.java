package O7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f7910b = M7.b.i(b.class);

    /* renamed from: a, reason: collision with root package name */
    private final Map f7911a = new ConcurrentHashMap();

    public int a() {
        return this.f7911a.size();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject(this.f7911a);
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }
}
