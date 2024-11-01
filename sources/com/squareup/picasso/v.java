package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    private static final long f24602u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f24603a;

    /* renamed from: b, reason: collision with root package name */
    long f24604b;

    /* renamed from: c, reason: collision with root package name */
    int f24605c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f24606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24607e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24608f;

    /* renamed from: g, reason: collision with root package name */
    public final List f24609g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24610h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24611i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24612j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24613k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24614l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24615m;

    /* renamed from: n, reason: collision with root package name */
    public final float f24616n;

    /* renamed from: o, reason: collision with root package name */
    public final float f24617o;

    /* renamed from: p, reason: collision with root package name */
    public final float f24618p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f24619q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f24620r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f24621s;

    /* renamed from: t, reason: collision with root package name */
    public final s.f f24622t;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f24623a;

        /* renamed from: b, reason: collision with root package name */
        private int f24624b;

        /* renamed from: c, reason: collision with root package name */
        private String f24625c;

        /* renamed from: d, reason: collision with root package name */
        private int f24626d;

        /* renamed from: e, reason: collision with root package name */
        private int f24627e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24628f;

        /* renamed from: g, reason: collision with root package name */
        private int f24629g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24630h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24631i;

        /* renamed from: j, reason: collision with root package name */
        private float f24632j;

        /* renamed from: k, reason: collision with root package name */
        private float f24633k;

        /* renamed from: l, reason: collision with root package name */
        private float f24634l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24635m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24636n;

        /* renamed from: o, reason: collision with root package name */
        private List f24637o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f24638p;

        /* renamed from: q, reason: collision with root package name */
        private s.f f24639q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Uri uri, int i8, Bitmap.Config config) {
            this.f24623a = uri;
            this.f24624b = i8;
            this.f24638p = config;
        }

        public v a() {
            boolean z8 = this.f24630h;
            if (z8 && this.f24628f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f24628f && this.f24626d == 0 && this.f24627e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z8 && this.f24626d == 0 && this.f24627e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f24639q == null) {
                this.f24639q = s.f.NORMAL;
            }
            return new v(this.f24623a, this.f24624b, this.f24625c, this.f24637o, this.f24626d, this.f24627e, this.f24628f, this.f24630h, this.f24629g, this.f24631i, this.f24632j, this.f24633k, this.f24634l, this.f24635m, this.f24636n, this.f24638p, this.f24639q);
        }

        public b b(int i8) {
            if (!this.f24630h) {
                this.f24628f = true;
                this.f24629g = i8;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c() {
            if (this.f24623a == null && this.f24624b == 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            if (this.f24639q != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            if (this.f24626d == 0 && this.f24627e == 0) {
                return false;
            }
            return true;
        }

        public b f(s.f fVar) {
            if (fVar != null) {
                if (this.f24639q == null) {
                    this.f24639q = fVar;
                    return this;
                }
                throw new IllegalStateException("Priority already set.");
            }
            throw new IllegalArgumentException("Priority invalid.");
        }

        public b g(int i8, int i9) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    if (i9 == 0 && i8 == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f24626d = i8;
                    this.f24627e = i9;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public b h(m2.e eVar) {
            if (eVar != null) {
                if (eVar.key() != null) {
                    if (this.f24637o == null) {
                        this.f24637o = new ArrayList(2);
                    }
                    this.f24637o.add(eVar);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f24606d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f24607e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.f24609g != null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f24610h == 0 && this.f24611i == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.f24604b;
        if (nanoTime > f24602u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!c() && this.f24616n == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!e() && !b()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f24603a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.f24607e;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.f24606d);
        }
        List list = this.f24609g;
        if (list != null && !list.isEmpty()) {
            for (m2.e eVar : this.f24609g) {
                sb.append(' ');
                sb.append(eVar.key());
            }
        }
        if (this.f24608f != null) {
            sb.append(" stableKey(");
            sb.append(this.f24608f);
            sb.append(')');
        }
        if (this.f24610h > 0) {
            sb.append(" resize(");
            sb.append(this.f24610h);
            sb.append(',');
            sb.append(this.f24611i);
            sb.append(')');
        }
        if (this.f24612j) {
            sb.append(" centerCrop");
        }
        if (this.f24614l) {
            sb.append(" centerInside");
        }
        if (this.f24616n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f24616n);
            if (this.f24619q) {
                sb.append(" @ ");
                sb.append(this.f24617o);
                sb.append(',');
                sb.append(this.f24618p);
            }
            sb.append(')');
        }
        if (this.f24620r) {
            sb.append(" purgeable");
        }
        if (this.f24621s != null) {
            sb.append(' ');
            sb.append(this.f24621s);
        }
        sb.append('}');
        return sb.toString();
    }

    private v(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar) {
        this.f24606d = uri;
        this.f24607e = i8;
        this.f24608f = str;
        if (list == null) {
            this.f24609g = null;
        } else {
            this.f24609g = DesugarCollections.unmodifiableList(list);
        }
        this.f24610h = i9;
        this.f24611i = i10;
        this.f24612j = z8;
        this.f24614l = z9;
        this.f24613k = i11;
        this.f24615m = z10;
        this.f24616n = f8;
        this.f24617o = f9;
        this.f24618p = f10;
        this.f24619q = z11;
        this.f24620r = z12;
        this.f24621s = config;
        this.f24622t = fVar;
    }
}
