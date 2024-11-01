package N7;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f6898a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f6899b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6900c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6901d;

    public j(String str) {
        this(str, null, 1);
    }

    public int a() {
        return this.f6901d;
    }

    public JSONObject b() {
        return this.f6899b;
    }

    public String c() {
        return this.f6898a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Packet(");
        if (this.f6899b != null) {
            sb.append("type=POST, data=");
            sb.append(this.f6899b);
        } else {
            sb.append("type=GET, data=");
            sb.append(this.f6898a);
        }
        sb.append(")");
        return sb.toString();
    }

    public j(String str, JSONObject jSONObject, int i8) {
        this.f6898a = str;
        this.f6899b = jSONObject;
        this.f6901d = i8;
        this.f6900c = System.currentTimeMillis();
    }
}
