package u5;

import Q5.p;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: u5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4087g implements m2.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f40304a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40305b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40306c;

    /* renamed from: d, reason: collision with root package name */
    private final a f40307d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: u5.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40308a = new a("ALL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f40309b = new a("TOP_LEFT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f40310c = new a("TOP_RIGHT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f40311d = new a("BOTTOM_LEFT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f40312e = new a("BOTTOM_RIGHT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f40313f = new a("TOP", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final a f40314g = new a("BOTTOM", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final a f40315h = new a("LEFT", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final a f40316i = new a("RIGHT", 8);

        /* renamed from: j, reason: collision with root package name */
        public static final a f40317j = new a("OTHER_TOP_LEFT", 9);

        /* renamed from: k, reason: collision with root package name */
        public static final a f40318k = new a("OTHER_TOP_RIGHT", 10);

        /* renamed from: l, reason: collision with root package name */
        public static final a f40319l = new a("OTHER_BOTTOM_LEFT", 11);

        /* renamed from: m, reason: collision with root package name */
        public static final a f40320m = new a("OTHER_BOTTOM_RIGHT", 12);

        /* renamed from: n, reason: collision with root package name */
        public static final a f40321n = new a("DIAGONAL_FROM_TOP_LEFT", 13);

        /* renamed from: o, reason: collision with root package name */
        public static final a f40322o = new a("DIAGONAL_FROM_TOP_RIGHT", 14);

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a[] f40323p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ W5.a f40324q;

        static {
            a[] a9 = a();
            f40323p = a9;
            f40324q = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f40308a, f40309b, f40310c, f40311d, f40312e, f40313f, f40314g, f40315h, f40316i, f40317j, f40318k, f40319l, f40320m, f40321n, f40322o};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40323p.clone();
        }
    }

    /* renamed from: u5.g$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40325a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f40308a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f40309b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f40310c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f40311d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f40312e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f40313f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f40314g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f40315h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.f40316i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.f40317j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.f40318k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.f40319l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.f40320m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.f40321n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.f40322o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f40325a = iArr;
        }
    }

    public C4087g(int i8, a cornerType) {
        AbstractC3292y.i(cornerType, "cornerType");
        this.f40304a = i8;
        this.f40305b = i8 * 2;
        this.f40307d = cornerType;
    }

    private final void b(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f40306c, f9 - this.f40305b, r1 + r3, f9);
        int i8 = this.f40304a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f40306c;
        canvas.drawRect(new RectF(i9, i9, i9 + this.f40305b, f9 - this.f40304a), paint);
        canvas.drawRect(new RectF(this.f40304a + r1, this.f40306c, f8, f9), paint);
    }

    private final void c(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40305b;
        RectF rectF = new RectF(f8 - i8, f9 - i8, f8, f9);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f40306c;
        canvas.drawRect(new RectF(i10, i10, f8 - this.f40304a, f9), paint);
        int i11 = this.f40304a;
        canvas.drawRect(new RectF(f8 - i11, this.f40306c, f8, f9 - i11), paint);
    }

    private final void d(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f40306c, f9 - this.f40305b, f8, f9);
        int i8 = this.f40304a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f40306c;
        canvas.drawRect(new RectF(i9, i9, f8, f9 - this.f40304a), paint);
    }

    private final void e(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        int i9 = this.f40305b;
        RectF rectF = new RectF(i8, i8, i8 + i9, i8 + i9);
        int i10 = this.f40304a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f40305b;
        RectF rectF2 = new RectF(f8 - i11, f9 - i11, f8, f9);
        int i12 = this.f40304a;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        canvas.drawRect(new RectF(this.f40306c, r1 + r3, f8 - this.f40304a, f9), paint);
        canvas.drawRect(new RectF(r1 + r2, this.f40306c, f8, f9 - this.f40304a), paint);
    }

    private final void f(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40305b;
        RectF rectF = new RectF(f8 - i8, this.f40306c, f8, r3 + i8);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(this.f40306c, f9 - this.f40305b, r1 + r3, f9);
        int i10 = this.f40304a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        int i11 = this.f40306c;
        int i12 = this.f40304a;
        canvas.drawRect(new RectF(i11, i11, f8 - i12, f9 - i12), paint);
        int i13 = this.f40306c;
        int i14 = this.f40304a;
        canvas.drawRect(new RectF(i13 + i14, i13 + i14, f8, f9), paint);
    }

    private final void g(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        RectF rectF = new RectF(i8, i8, i8 + this.f40305b, f9);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        canvas.drawRect(new RectF(this.f40304a + r1, this.f40306c, f8, f9), paint);
    }

    private final void h(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f40305b);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(f8 - this.f40305b, this.f40306c, f8, f9);
        int i10 = this.f40304a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        canvas.drawRect(new RectF(this.f40306c, r1 + r3, f8 - this.f40304a, f9), paint);
    }

    private final void i(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f40305b);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f40306c;
        RectF rectF2 = new RectF(i10, i10, i10 + this.f40305b, f9);
        int i11 = this.f40304a;
        canvas.drawRoundRect(rectF2, i11, i11, paint);
        int i12 = this.f40306c;
        int i13 = this.f40304a;
        canvas.drawRect(new RectF(i12 + i13, i12 + i13, f8, f9), paint);
    }

    private final void j(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f40306c, f9 - this.f40305b, f8, f9);
        int i8 = this.f40304a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        RectF rectF2 = new RectF(f8 - this.f40305b, this.f40306c, f8, f9);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF2, i9, i9, paint);
        int i10 = this.f40306c;
        int i11 = this.f40304a;
        canvas.drawRect(new RectF(i10, i10, f8 - i11, f9 - i11), paint);
    }

    private final void k(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        RectF rectF = new RectF(i8, i8, i8 + this.f40305b, f9);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(this.f40306c, f9 - this.f40305b, f8, f9);
        int i10 = this.f40304a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        canvas.drawRect(new RectF(r1 + r2, this.f40306c, f8, f9 - this.f40304a), paint);
    }

    private final void l(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(f8 - this.f40305b, this.f40306c, f8, f9);
        int i8 = this.f40304a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f40306c;
        canvas.drawRect(new RectF(i9, i9, f8 - this.f40304a, f9), paint);
    }

    private final void m(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        float f10 = f8 - i8;
        float f11 = f9 - i8;
        switch (b.f40325a[this.f40307d.ordinal()]) {
            case 1:
                int i9 = this.f40306c;
                RectF rectF = new RectF(i9, i9, f10, f11);
                int i10 = this.f40304a;
                canvas.drawRoundRect(rectF, i10, i10, paint);
                return;
            case 2:
                n(canvas, paint, f10, f11);
                return;
            case 3:
                o(canvas, paint, f10, f11);
                return;
            case 4:
                b(canvas, paint, f10, f11);
                return;
            case 5:
                c(canvas, paint, f10, f11);
                return;
            case 6:
                p(canvas, paint, f10, f11);
                return;
            case 7:
                d(canvas, paint, f10, f11);
                return;
            case 8:
                g(canvas, paint, f10, f11);
                return;
            case 9:
                l(canvas, paint, f10, f11);
                return;
            case 10:
                j(canvas, paint, f10, f11);
                return;
            case 11:
                k(canvas, paint, f10, f11);
                return;
            case 12:
                h(canvas, paint, f10, f11);
                return;
            case 13:
                i(canvas, paint, f10, f11);
                return;
            case 14:
                e(canvas, paint, f10, f11);
                return;
            case 15:
                f(canvas, paint, f10, f11);
                return;
            default:
                throw new p();
        }
    }

    private final void n(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        int i9 = this.f40305b;
        RectF rectF = new RectF(i8, i8, i8 + i9, i8 + i9);
        int i10 = this.f40304a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f40306c;
        int i12 = this.f40304a;
        canvas.drawRect(new RectF(i11, i11 + i12, i11 + i12, f9), paint);
        canvas.drawRect(new RectF(this.f40304a + r1, this.f40306c, f8, f9), paint);
    }

    private final void o(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40305b;
        RectF rectF = new RectF(f8 - i8, this.f40306c, f8, r3 + i8);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f40306c;
        canvas.drawRect(new RectF(i10, i10, f8 - this.f40304a, f9), paint);
        canvas.drawRect(new RectF(f8 - this.f40304a, this.f40306c + r1, f8, f9), paint);
    }

    private final void p(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f40306c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f40305b);
        int i9 = this.f40304a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        canvas.drawRect(new RectF(this.f40306c, r1 + this.f40304a, f8, f9), paint);
    }

    @Override // m2.e
    public Bitmap a(Bitmap source) {
        AbstractC3292y.i(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        AbstractC3292y.h(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        m(canvas, paint, width, height);
        source.recycle();
        return createBitmap;
    }

    @Override // m2.e
    public String key() {
        return "RoundedTransformation(radius=" + this.f40304a + ", margin=" + this.f40306c + ", diameter=" + this.f40305b + ", cornerType=" + this.f40307d.name() + ')';
    }

    public /* synthetic */ C4087g(int i8, a aVar, int i9, AbstractC3284p abstractC3284p) {
        this(i8, (i9 & 2) != 0 ? a.f40308a : aVar);
    }
}
