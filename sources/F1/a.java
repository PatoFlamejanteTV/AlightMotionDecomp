package F1;

import C1.n;
import F1.d;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f2100f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected I1.f f2101a = new I1.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f2102b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2103c;

    /* renamed from: d, reason: collision with root package name */
    private d f2104d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2105e;

    private a(d dVar) {
        this.f2104d = dVar;
    }

    public static a a() {
        return f2100f;
    }

    private void d() {
        if (this.f2103c && this.f2102b != null) {
            Iterator it = c.e().a().iterator();
            while (it.hasNext()) {
                ((n) it.next()).w().l(c());
            }
        }
    }

    public void b(Context context) {
        if (!this.f2103c) {
            this.f2104d.b(context);
            this.f2104d.a(this);
            this.f2104d.i();
            this.f2105e = this.f2104d.g();
            this.f2103c = true;
        }
    }

    public Date c() {
        Date date = this.f2102b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date a9 = this.f2101a.a();
        Date date = this.f2102b;
        if (date == null || a9.after(date)) {
            this.f2102b = a9;
            d();
        }
    }

    @Override // F1.d.a
    public void a(boolean z8) {
        if (!this.f2105e && z8) {
            e();
        }
        this.f2105e = z8;
    }
}
