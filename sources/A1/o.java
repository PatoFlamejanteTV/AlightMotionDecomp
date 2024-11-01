package A1;

import java.util.HashMap;
import java.util.Map;
import y1.C4236a;

/* loaded from: classes4.dex */
public class o implements c {

    /* renamed from: b, reason: collision with root package name */
    public static int f144b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static int f145c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static String f146d = "uspv1";

    /* renamed from: a, reason: collision with root package name */
    protected Map f147a;

    public o() {
        e();
    }

    private void e() {
        HashMap hashMap = new HashMap();
        this.f147a = hashMap;
        hashMap.put(z1.j.f41458a, Integer.valueOf(f145c));
        this.f147a.put(z1.j.f41459b, "-");
        this.f147a.put(z1.j.f41460c, "-");
        this.f147a.put(z1.j.f41461d, "-");
    }

    @Override // A1.c
    public void a(String str, Object obj) {
        if (this.f147a.containsKey(str)) {
            this.f147a.put(str, obj);
            return;
        }
        throw new y1.c(str + " not found");
    }

    @Override // A1.c
    public String b() {
        return ((("" + c(z1.j.f41458a)) + c(z1.j.f41459b)) + c(z1.j.f41460c)) + c(z1.j.f41461d);
    }

    @Override // A1.c
    public Object c(String str) {
        if (this.f147a.containsKey(str)) {
            return this.f147a.get(str);
        }
        return null;
    }

    public void d(String str) {
        try {
            a(z1.j.f41458a, Integer.valueOf(Integer.parseInt(String.valueOf(str.charAt(0)))));
            a(z1.j.f41459b, String.valueOf(str.charAt(1)));
            a(z1.j.f41460c, String.valueOf(str.charAt(2)));
            a(z1.j.f41461d, String.valueOf(str.charAt(3)));
        } catch (y1.c e8) {
            throw new C4236a(e8);
        }
    }

    @Override // A1.c
    public int getId() {
        return f144b;
    }

    public o(String str) {
        e();
        if (str == null || str.length() <= 0) {
            return;
        }
        d(str);
    }
}
