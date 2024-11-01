package x4;

import R5.AbstractC1435t;
import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4221d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f40984c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4221d f40985d = new EnumC4221d("PNG", 0, AbstractC1435t.e("png"), Bitmap.CompressFormat.PNG);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4221d f40986e = new EnumC4221d("WEBP", 1, AbstractC1435t.e("webp"), Bitmap.CompressFormat.WEBP);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC4221d f40987f = new EnumC4221d("JPEG", 2, AbstractC1435t.p("jpeg", "jpg"), Bitmap.CompressFormat.JPEG);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC4221d[] f40988g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ W5.a f40989h;

    /* renamed from: a, reason: collision with root package name */
    private final List f40990a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap.CompressFormat f40991b;

    /* renamed from: x4.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC4221d a(String url) {
            Object obj;
            AbstractC3292y.i(url, "url");
            Iterator<E> it = EnumC4221d.c().iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    List d8 = ((EnumC4221d) obj).d();
                    if (!(d8 instanceof Collection) || !d8.isEmpty()) {
                        Iterator it2 = d8.iterator();
                        while (it2.hasNext()) {
                            if (n.q(url, (String) it2.next(), true)) {
                                break loop0;
                            }
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (EnumC4221d) obj;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        EnumC4221d[] a9 = a();
        f40988g = a9;
        f40989h = W5.b.a(a9);
        f40984c = new a(null);
    }

    private EnumC4221d(String str, int i8, List list, Bitmap.CompressFormat compressFormat) {
        this.f40990a = list;
        this.f40991b = compressFormat;
    }

    private static final /* synthetic */ EnumC4221d[] a() {
        return new EnumC4221d[]{f40985d, f40986e, f40987f};
    }

    public static W5.a c() {
        return f40989h;
    }

    public static EnumC4221d valueOf(String str) {
        return (EnumC4221d) Enum.valueOf(EnumC4221d.class, str);
    }

    public static EnumC4221d[] values() {
        return (EnumC4221d[]) f40988g.clone();
    }

    public final Bitmap.CompressFormat b() {
        return this.f40991b;
    }

    public final List d() {
        return this.f40990a;
    }
}
