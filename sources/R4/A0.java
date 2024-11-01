package r4;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes4.dex */
public abstract class A0 implements y0 {

    /* loaded from: classes4.dex */
    public static final class a extends A0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37859a = new a();

        private a() {
            super(null);
        }

        @Override // r4.y0
        public boolean d() {
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends A0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37860a = new b();

        private b() {
            super(null);
        }

        @Override // r4.y0
        public boolean d() {
            return false;
        }
    }

    private A0() {
    }

    @Override // r4.y0
    public boolean a() {
        return true;
    }

    @Override // r4.y0
    public boolean b() {
        return false;
    }

    @Override // r4.y0
    public boolean c(boolean z8) {
        return false;
    }

    @Override // r4.y0
    public C getError() {
        return null;
    }

    public /* synthetic */ A0(AbstractC3284p abstractC3284p) {
        this();
    }
}
