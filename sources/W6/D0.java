package W6;

/* loaded from: classes5.dex */
public class D0 {

    /* renamed from: a, reason: collision with root package name */
    private String f10795a;

    /* renamed from: b, reason: collision with root package name */
    private int f10796b = 0;

    public D0(String str) {
        this.f10795a = str;
    }

    public boolean a() {
        if (this.f10796b != -1) {
            return true;
        }
        return false;
    }

    public String b() {
        int i8 = this.f10796b;
        if (i8 == -1) {
            return null;
        }
        int indexOf = this.f10795a.indexOf(46, i8);
        if (indexOf == -1) {
            String substring = this.f10795a.substring(this.f10796b);
            this.f10796b = -1;
            return substring;
        }
        String substring2 = this.f10795a.substring(this.f10796b, indexOf);
        this.f10796b = indexOf + 1;
        return substring2;
    }
}
