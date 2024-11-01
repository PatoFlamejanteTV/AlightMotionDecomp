package Z1;

/* loaded from: classes4.dex */
public class e extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private int f13211a;

    /* renamed from: b, reason: collision with root package name */
    private Object f13212b;

    /* renamed from: c, reason: collision with root package name */
    private int f13213c;

    public e(int i8, int i9, Object obj) {
        super(a(i8, i9, obj));
        this.f13213c = i8;
        this.f13211a = i9;
        this.f13212b = obj;
    }

    private static String a(int i8, int i9, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (i9 == 0) {
            sb.append("Unexpected character (");
            sb.append(obj);
            sb.append(") at position ");
            sb.append(i8);
            sb.append(".");
        } else if (i9 == 1) {
            sb.append("Unexpected token ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i8);
            sb.append(".");
        } else if (i9 == 2) {
            sb.append("Unexpected exception ");
            sb.append(obj);
            sb.append(" occur at position ");
            sb.append(i8);
            sb.append(".");
        } else if (i9 == 3) {
            sb.append("Unexpected End Of File position ");
            sb.append(i8);
            sb.append(": ");
            sb.append(obj);
        } else if (i9 == 4) {
            sb.append("Unexpected unicode escape sequence ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i8);
            sb.append(".");
        } else if (i9 == 5) {
            sb.append("Unexpected duplicate key:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i8);
            sb.append(".");
        } else if (i9 == 6) {
            sb.append("Unexpected leading 0 in digit for token:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i8);
            sb.append(".");
        } else {
            sb.append("Unkown error at position ");
            sb.append(i8);
            sb.append(".");
        }
        return sb.toString();
    }

    public e(int i8, Throwable th) {
        super(a(i8, 2, th), th);
        this.f13213c = i8;
        this.f13211a = 2;
        this.f13212b = th;
    }
}
