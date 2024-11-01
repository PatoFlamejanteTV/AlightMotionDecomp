package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import g3.C2895E;
import g3.C2896F;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2672r0 extends PagerAdapter {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f29155j = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2672r0.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2672r0.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f29156k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29157a;

    /* renamed from: b, reason: collision with root package name */
    private final n2.u f29158b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f29159c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f29160d;

    /* renamed from: e, reason: collision with root package name */
    private C2895E f29161e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29162f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29163g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2872e f29164h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2872e f29165i;

    /* renamed from: com.stripe.android.view.r0$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends RecyclerView.ViewHolder {
        public /* synthetic */ a(View view, AbstractC3284p abstractC3284p) {
            this(view);
        }

        /* renamed from: com.stripe.android.view.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0691a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final ShippingInfoWidget f29166a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0691a(L2.r r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    android.widget.ScrollView r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.ShippingInfoWidget r3 = r3.f5362b
                    java.lang.String r0 = "shippingInfoWidget"
                    kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
                    r2.f29166a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2672r0.a.C0691a.<init>(L2.r):void");
            }

            public final void a(n2.u paymentSessionConfig, C2895E c2895e, Set allowedShippingCountryCodes) {
                AbstractC3292y.i(paymentSessionConfig, "paymentSessionConfig");
                AbstractC3292y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.f29166a.setHiddenFields(paymentSessionConfig.b());
                this.f29166a.setOptionalFields(paymentSessionConfig.f());
                this.f29166a.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.f29166a.h(c2895e);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0691a(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    L2.r r3 = L2.r.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2672r0.a.C0691a.<init>(android.view.ViewGroup):void");
            }
        }

        /* renamed from: com.stripe.android.view.r0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final SelectShippingMethodWidget f29167a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public b(L2.s r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.SelectShippingMethodWidget r3 = r3.f5364b
                    java.lang.String r0 = "selectShippingMethodWidget"
                    kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
                    r2.f29167a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2672r0.a.b.<init>(L2.s):void");
            }

            public final void a(List shippingMethods, C2896F c2896f, Function1 onShippingMethodSelectedCallback) {
                AbstractC3292y.i(shippingMethods, "shippingMethods");
                AbstractC3292y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.f29167a.setShippingMethods(shippingMethods);
                this.f29167a.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (c2896f != null) {
                    this.f29167a.setSelectedShippingMethod(c2896f);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public b(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    L2.s r3 = L2.s.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2672r0.a.b.<init>(android.view.ViewGroup):void");
            }
        }

        private a(View view) {
            super(view);
        }
    }

    /* renamed from: com.stripe.android.view.r0$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29168a;

        static {
            int[] iArr = new int[EnumC2671q0.values().length];
            try {
                iArr[EnumC2671q0.f29150b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2671q0.f29151c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29168a = iArr;
        }
    }

    /* renamed from: com.stripe.android.view.r0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2672r0 f29169b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, C2672r0 c2672r0) {
            super(obj);
            this.f29169b = c2672r0;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f29169b.f29163g = !AbstractC3292y.d((List) obj2, (List) obj);
        }
    }

    /* renamed from: com.stripe.android.view.r0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2672r0 f29170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, C2672r0 c2672r0) {
            super(obj);
            this.f29170b = c2672r0;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f29170b.f29163g = !AbstractC3292y.d((C2896F) obj2, (C2896F) obj);
        }
    }

    public C2672r0(Context context, n2.u paymentSessionConfig, Set allowedShippingCountryCodes, Function1 onShippingMethodSelectedCallback) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3292y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3292y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.f29157a = context;
        this.f29158b = paymentSessionConfig;
        this.f29159c = allowedShippingCountryCodes;
        this.f29160d = onShippingMethodSelectedCallback;
        C2868a c2868a = C2868a.f31918a;
        this.f29164h = new c(AbstractC1435t.m(), this);
        this.f29165i = new d(null, this);
    }

    private final List c() {
        EnumC2671q0 enumC2671q0 = EnumC2671q0.f29150b;
        EnumC2671q0 enumC2671q02 = null;
        if (!this.f29158b.p()) {
            enumC2671q0 = null;
        }
        EnumC2671q0 enumC2671q03 = EnumC2671q0.f29151c;
        if (this.f29158b.s() && (!this.f29158b.p() || this.f29162f)) {
            enumC2671q02 = enumC2671q03;
        }
        return AbstractC1435t.r(enumC2671q0, enumC2671q02);
    }

    public final EnumC2671q0 b(int i8) {
        return (EnumC2671q0) AbstractC1435t.p0(c(), i8);
    }

    public final C2896F d() {
        return (C2896F) this.f29165i.getValue(this, f29155j[1]);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup collection, int i8, Object view) {
        AbstractC3292y.i(collection, "collection");
        AbstractC3292y.i(view, "view");
        collection.removeView((View) view);
    }

    public final List e() {
        return (List) this.f29164h.getValue(this, f29155j[0]);
    }

    public final void f(C2896F c2896f) {
        this.f29165i.setValue(this, f29155j[1], c2896f);
    }

    public final void g(boolean z8) {
        this.f29162f = z8;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return c().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        AbstractC3292y.i(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == EnumC2671q0.f29151c && this.f29163g) {
            this.f29163g = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i8) {
        return this.f29157a.getString(((EnumC2671q0) c().get(i8)).b());
    }

    public final void h(C2895E c2895e) {
        this.f29161e = c2895e;
        notifyDataSetChanged();
    }

    public final void i(List list) {
        AbstractC3292y.i(list, "<set-?>");
        this.f29164h.setValue(this, f29155j[0], list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup collection, int i8) {
        RecyclerView.ViewHolder c0691a;
        AbstractC3292y.i(collection, "collection");
        EnumC2671q0 enumC2671q0 = (EnumC2671q0) c().get(i8);
        int i9 = b.f29168a[enumC2671q0.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                c0691a = new a.b(collection);
            } else {
                throw new Q5.p();
            }
        } else {
            c0691a = new a.C0691a(collection);
        }
        if (c0691a instanceof a.C0691a) {
            ((a.C0691a) c0691a).a(this.f29158b, this.f29161e, this.f29159c);
        } else if (c0691a instanceof a.b) {
            ((a.b) c0691a).a(e(), d(), this.f29160d);
        }
        collection.addView(c0691a.itemView);
        c0691a.itemView.setTag(enumC2671q0);
        View itemView = c0691a.itemView;
        AbstractC3292y.h(itemView, "itemView");
        return itemView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object o8) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(o8, "o");
        return view == o8;
    }
}
