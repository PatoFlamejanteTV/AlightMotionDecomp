package r4;

import kotlin.jvm.internal.AbstractC3284p;
import o4.AbstractC3533g;

/* loaded from: classes4.dex */
public abstract class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f38772a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f38773b;

    /* loaded from: classes4.dex */
    public static final class a extends z0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f38774c = new a();

        private a() {
            super(AbstractC3533g.f35981y, null, 2, 0 == true ? 1 : 0);
        }

        @Override // r4.y0
        public boolean b() {
            return true;
        }

        @Override // r4.y0
        public boolean c(boolean z8) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f38775c;

        public b(int i8) {
            super(i8, null, 2, 0 == true ? 1 : 0);
            this.f38775c = i8;
        }

        @Override // r4.y0
        public boolean b() {
            return false;
        }

        @Override // r4.y0
        public boolean c(boolean z8) {
            return !z8;
        }

        @Override // r4.z0
        protected int e() {
            return this.f38775c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f38776c;

        /* renamed from: d, reason: collision with root package name */
        private final Object[] f38777d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f38778e;

        public /* synthetic */ c(int i8, Object[] objArr, boolean z8, int i9, AbstractC3284p abstractC3284p) {
            this(i8, (i9 & 2) != 0 ? null : objArr, (i9 & 4) != 0 ? false : z8);
        }

        @Override // r4.y0
        public boolean b() {
            return false;
        }

        @Override // r4.y0
        public boolean c(boolean z8) {
            return true;
        }

        @Override // r4.z0, r4.y0
        public boolean d() {
            return this.f38778e;
        }

        @Override // r4.z0
        protected int e() {
            return this.f38776c;
        }

        @Override // r4.z0
        protected Object[] f() {
            return this.f38777d;
        }

        public c(int i8, Object[] objArr, boolean z8) {
            super(i8, objArr, null);
            this.f38776c = i8;
            this.f38777d = objArr;
            this.f38778e = z8;
        }
    }

    public /* synthetic */ z0(int i8, Object[] objArr, AbstractC3284p abstractC3284p) {
        this(i8, objArr);
    }

    @Override // r4.y0
    public boolean a() {
        return false;
    }

    @Override // r4.y0
    public boolean d() {
        return false;
    }

    protected int e() {
        return this.f38772a;
    }

    protected Object[] f() {
        return this.f38773b;
    }

    @Override // r4.y0
    public C getError() {
        return new C(e(), f());
    }

    private z0(int i8, Object[] objArr) {
        this.f38772a = i8;
        this.f38773b = objArr;
    }

    public /* synthetic */ z0(int i8, Object[] objArr, int i9, AbstractC3284p abstractC3284p) {
        this(i8, (i9 & 2) != 0 ? null : objArr, null);
    }
}
