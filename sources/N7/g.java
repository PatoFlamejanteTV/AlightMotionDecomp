package N7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6885c = M7.b.i(g.class);

    /* renamed from: a, reason: collision with root package name */
    private final long f6886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6887b;

    public g(Map map) {
        this(d(map));
    }

    private static String c(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME).replaceAll("\\+", "%20");
        } catch (Exception e8) {
            V7.a.b(f6885c).e(e8, "Cannot encode %s", str);
            return "";
        }
    }

    private static String d(Map map) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('?');
        for (Map.Entry entry : map.entrySet()) {
            sb.append(c((String) entry.getKey()));
            sb.append('=');
            sb.append(c((String) entry.getValue()));
            sb.append('&');
        }
        return sb.substring(0, sb.length() - 1);
    }

    public String a() {
        return this.f6887b;
    }

    public long b() {
        return this.f6886a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f6886a == gVar.f6886a && this.f6887b.equals(gVar.f6887b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f6886a;
        return (((int) (j8 ^ (j8 >>> 32))) * 31) + this.f6887b.hashCode();
    }

    public String toString() {
        return a();
    }

    public g(String str) {
        this(System.currentTimeMillis(), str);
    }

    public g(long j8, String str) {
        this.f6886a = j8;
        this.f6887b = str;
    }
}
