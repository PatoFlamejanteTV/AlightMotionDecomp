package Z1;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static int f13180c;

    /* renamed from: a, reason: collision with root package name */
    private int f13181a;

    /* renamed from: b, reason: collision with root package name */
    private d f13182b;

    static {
        int i8;
        if (System.getProperty("JSON_SMART_SIMPLE") != null) {
            i8 = 4032;
        } else {
            i8 = -1;
        }
        f13180c = i8;
    }

    public a(int i8) {
        this.f13181a = i8;
    }

    private d a() {
        if (this.f13182b == null) {
            this.f13182b = new d(this.f13181a);
        }
        return this.f13182b;
    }

    public Object b(String str) {
        return a().x(str);
    }
}
