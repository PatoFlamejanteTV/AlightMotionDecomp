package W6;

/* renamed from: W6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1470a extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f10823a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10824b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f10825c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1470a(boolean z8, int i8, byte[] bArr) {
        this.f10823a = z8;
        this.f10824b = i8;
        this.f10825c = J7.a.d(bArr);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        boolean z8 = this.f10823a;
        return ((z8 ? 1 : 0) ^ this.f10824b) ^ J7.a.k(this.f10825c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1470a)) {
            return false;
        }
        AbstractC1470a abstractC1470a = (AbstractC1470a) abstractC1492s;
        if (this.f10823a != abstractC1470a.f10823a || this.f10824b != abstractC1470a.f10824b || !J7.a.a(this.f10825c, abstractC1470a.f10825c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.b(this.f10824b) + E0.a(this.f10825c.length) + this.f10825c.length;
    }

    @Override // W6.AbstractC1492s
    public boolean r() {
        return this.f10823a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (r()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(u()));
        stringBuffer.append("]");
        if (this.f10825c != null) {
            stringBuffer.append(" #");
            str = K7.b.c(this.f10825c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int u() {
        return this.f10824b;
    }
}
