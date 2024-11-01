package K1;

import K1.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f4561c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f4562d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f4563e;

    public a(b.InterfaceC0080b interfaceC0080b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0080b);
        this.f4561c = new HashSet(hashSet);
        this.f4562d = jSONObject;
        this.f4563e = j8;
    }
}
