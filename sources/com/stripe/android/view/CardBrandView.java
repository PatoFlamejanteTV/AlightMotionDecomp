package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.stripe.android.model.p;
import g3.C2893C;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardBrandView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final L2.i f28438a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f28439b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f28440c;

    /* renamed from: d, reason: collision with root package name */
    private final ListPopupWindow f28441d;

    /* renamed from: e, reason: collision with root package name */
    private q6.w f28442e;

    /* loaded from: classes4.dex */
    public static final class a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0682a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f28443a;

        /* renamed from: b, reason: collision with root package name */
        private final b f28444b;

        /* renamed from: com.stripe.android.view.CardBrandView$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0682a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readParcelable(a.class.getClassLoader()), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable, b state) {
            super(parcelable);
            AbstractC3292y.i(state, "state");
            this.f28443a = parcelable;
            this.f28444b = state;
        }

        public final b a() {
            return this.f28444b;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f28443a, aVar.f28443a) && AbstractC3292y.d(this.f28444b, aVar.f28444b);
        }

        public int hashCode() {
            Parcelable parcelable = this.f28443a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.f28444b.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f28443a + ", state=" + this.f28444b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f28443a, i8);
            this.f28444b.writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final C2893C c() {
        C2893C c2893c;
        String f8;
        EnumC2906e brand = getBrand();
        if (brand == EnumC2906e.f32125w) {
            brand = null;
        }
        if (brand != null && (f8 = brand.f()) != null) {
            c2893c = new C2893C(f8);
        } else {
            c2893c = null;
        }
        if (!j() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return c2893c;
    }

    private final p.c.C0520c d() {
        if (getBrand() == EnumC2906e.f32125w) {
            return null;
        }
        p.c.C0520c c0520c = new p.c.C0520c(getBrand().f());
        if (!j() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return c0520c;
    }

    private final void f() {
        EnumC2906e f8;
        if (getState().i().size() > 1) {
            f8 = AbstractC2678w.a(getState().u(), getState().i(), getState().h());
        } else {
            f8 = getState().f();
        }
        if (getBrand() != f8) {
            setBrand(f8);
        }
        m();
    }

    private final b getState() {
        return (b) this.f28442e.getValue();
    }

    private final void h() {
        Context context = getContext();
        AbstractC3292y.h(context, "getContext(...)");
        C2677v c2677v = new C2677v(context, getPossibleBrands(), getBrand());
        this.f28441d.setAdapter(c2677v);
        this.f28441d.setModal(true);
        this.f28441d.setWidth(k(c2677v));
        this.f28441d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.y
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                CardBrandView.i(CardBrandView.this, adapterView, view, i8, j8);
            }
        });
        this.f28441d.setAnchorView(this.f28439b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardBrandView this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3292y.i(this$0, "this$0");
        EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.p0(this$0.getPossibleBrands(), i8 - 1);
        if (enumC2906e != null) {
            this$0.g(enumC2906e);
        }
        this$0.f28441d.dismiss();
    }

    private final int k(C2677v c2677v) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c2677v.getCount();
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            View view = c2677v.getView(i9, null, this);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = i6.m.d(i8, view.getMeasuredWidth());
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:            if (getState().f() == g3.EnumC2906e.f32125w) goto L17;     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.f28439b
            boolean r1 = r4.getShouldShowErrorIcon()
            if (r1 == 0) goto L15
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            g3.e r1 = r1.f()
            int r1 = r1.j()
            goto L34
        L15:
            boolean r1 = r4.getShouldShowCvc()
            if (r1 == 0) goto L28
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            g3.e r1 = r1.f()
            int r1 = r1.g()
            goto L34
        L28:
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            g3.e r1 = r1.f()
            int r1 = r1.k()
        L34:
            r0.setBackgroundResource(r1)
            boolean r0 = r4.getShouldShowErrorIcon()
            r1 = 0
            if (r0 == 0) goto L40
        L3e:
            r0 = r1
            goto L63
        L40:
            boolean r0 = r4.getShouldShowCvc()
            if (r0 == 0) goto L4f
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L63
        L4f:
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.stripe.android.view.CardBrandView$b r2 = r4.getState()
            g3.e r2 = r2.f()
            g3.e r3 = g3.EnumC2906e.f32125w
            if (r2 != r3) goto L3e
        L63:
            android.widget.ImageView r2 = r4.f28439b
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.LIGHTEN
            r1.<init>(r0, r3)
        L72:
            r2.setColorFilter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardBrandView.m():void");
    }

    private final void n() {
        if (j() && getPossibleBrands().size() > 1 && !getShouldShowCvc() && !getShouldShowErrorIcon()) {
            h();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.o(CardBrandView.this, view);
                }
            });
            this.f28440c.setVisibility(0);
        } else {
            setOnClickListener(null);
            this.f28440c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CardBrandView this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.f28441d.isShowing()) {
            this$0.f28441d.dismiss();
        } else {
            this$0.f28441d.show();
        }
    }

    private final void setState(b bVar) {
        this.f28442e.setValue(bVar);
    }

    public final C2893C e() {
        String f8;
        C2893C c8 = c();
        if (c8 != null) {
            return c8;
        }
        EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.o0(getMerchantPreferredNetworks());
        if (enumC2906e == null) {
            return null;
        }
        if (enumC2906e == EnumC2906e.f32125w) {
            enumC2906e = null;
        }
        if (enumC2906e == null || (f8 = enumC2906e.f()) == null) {
            return null;
        }
        return new C2893C(f8);
    }

    public final void g(EnumC2906e enumC2906e) {
        Object value;
        if (enumC2906e != null) {
            q6.w wVar = this.f28442e;
            do {
                value = wVar.getValue();
            } while (!wVar.a(value, b.b((b) value, false, false, null, enumC2906e, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
            f();
        }
    }

    public final EnumC2906e getBrand() {
        return getState().f();
    }

    public final List<EnumC2906e> getMerchantPreferredNetworks() {
        return getState().h();
    }

    public final List<EnumC2906e> getPossibleBrands() {
        return getState().i();
    }

    public final boolean getShouldShowCvc() {
        return getState().l();
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().p();
    }

    public final int getTintColorInt$payments_core_release() {
        return getState().s();
    }

    public final boolean j() {
        return getState().v();
    }

    public final p.c.C0520c l() {
        String f8;
        p.c.C0520c d8 = d();
        if (d8 != null) {
            return d8;
        }
        EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.o0(getMerchantPreferredNetworks());
        if (enumC2906e != null && (f8 = enumC2906e.f()) != null) {
            return new p.c.C0520c(f8);
        }
        return null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        a aVar;
        b bVar;
        Parcelable superState;
        if (parcelable instanceof a) {
            aVar = (a) parcelable;
        } else {
            aVar = null;
        }
        if (aVar == null || (bVar = aVar.a()) == null) {
            bVar = new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        setState(bVar);
        f();
        n();
        if (aVar != null && (superState = aVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new a(super.onSaveInstanceState(), getState());
    }

    public final void setBrand(EnumC2906e value) {
        Object value2;
        AbstractC3292y.i(value, "value");
        q6.w wVar = this.f28442e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.a(value2, b.b((b) value2, false, false, value, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        f();
        n();
    }

    public final void setCbcEligible(boolean z8) {
        Object value;
        q6.w wVar = this.f28442e;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, b.b((b) value, z8, false, null, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        n();
    }

    public final void setMerchantPreferredNetworks(List<? extends EnumC2906e> value) {
        Object value2;
        AbstractC3292y.i(value, "value");
        q6.w wVar = this.f28442e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.a(value2, b.b((b) value2, false, false, null, null, null, value, false, false, 0, 479, null)));
        f();
    }

    public final void setPossibleBrands(List<? extends EnumC2906e> value) {
        Object value2;
        AbstractC3292y.i(value, "value");
        q6.w wVar = this.f28442e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.a(value2, b.b((b) value2, false, false, null, null, value, null, false, false, 0, 495, null)));
        f();
        n();
    }

    public final void setShouldShowCvc(boolean z8) {
        Object value;
        q6.w wVar = this.f28442e;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, b.b((b) value, false, false, null, null, null, null, z8, false, 0, 447, null)));
        m();
    }

    public final void setShouldShowErrorIcon(boolean z8) {
        Object value;
        q6.w wVar = this.f28442e;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, b.b((b) value, false, false, null, null, null, null, false, z8, 0, 383, null)));
        m();
    }

    public final void setTintColorInt$payments_core_release(int i8) {
        Object value;
        q6.w wVar = this.f28442e;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, b.b((b) value, false, false, null, null, null, null, false, false, i8, 255, null)));
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        L2.i b9 = L2.i.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        this.f28438a = b9;
        ImageView icon = b9.f5324c;
        AbstractC3292y.h(icon, "icon");
        this.f28439b = icon;
        ImageView chevron = b9.f5323b;
        AbstractC3292y.h(chevron, "chevron");
        this.f28440c = chevron;
        this.f28441d = new ListPopupWindow(context);
        this.f28442e = AbstractC3815N.a(new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null));
        setClickable(false);
        setFocusable(false);
        f();
        n();
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28445a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28446b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC2906e f28447c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC2906e f28448d;

        /* renamed from: e, reason: collision with root package name */
        private final List f28449e;

        /* renamed from: f, reason: collision with root package name */
        private final List f28450f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f28451g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f28452h;

        /* renamed from: i, reason: collision with root package name */
        private final int f28453i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                EnumC2906e valueOf = EnumC2906e.valueOf(parcel.readString());
                EnumC2906e valueOf2 = parcel.readInt() == 0 ? null : EnumC2906e.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2906e.valueOf(parcel.readString()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i9 = 0; i9 != readInt2; i9++) {
                    arrayList2.add(EnumC2906e.valueOf(parcel.readString()));
                }
                return new b(z8, z9, valueOf, valueOf2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(boolean z8, boolean z9, EnumC2906e brand, EnumC2906e enumC2906e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3292y.i(brand, "brand");
            AbstractC3292y.i(possibleBrands, "possibleBrands");
            AbstractC3292y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.f28445a = z8;
            this.f28446b = z9;
            this.f28447c = brand;
            this.f28448d = enumC2906e;
            this.f28449e = possibleBrands;
            this.f28450f = merchantPreferredNetworks;
            this.f28451g = z10;
            this.f28452h = z11;
            this.f28453i = i8;
        }

        public static /* synthetic */ b b(b bVar, boolean z8, boolean z9, EnumC2906e enumC2906e, EnumC2906e enumC2906e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, Object obj) {
            boolean z12;
            boolean z13;
            EnumC2906e enumC2906e3;
            EnumC2906e enumC2906e4;
            List list3;
            List list4;
            boolean z14;
            boolean z15;
            int i10;
            if ((i9 & 1) != 0) {
                z12 = bVar.f28445a;
            } else {
                z12 = z8;
            }
            if ((i9 & 2) != 0) {
                z13 = bVar.f28446b;
            } else {
                z13 = z9;
            }
            if ((i9 & 4) != 0) {
                enumC2906e3 = bVar.f28447c;
            } else {
                enumC2906e3 = enumC2906e;
            }
            if ((i9 & 8) != 0) {
                enumC2906e4 = bVar.f28448d;
            } else {
                enumC2906e4 = enumC2906e2;
            }
            if ((i9 & 16) != 0) {
                list3 = bVar.f28449e;
            } else {
                list3 = list;
            }
            if ((i9 & 32) != 0) {
                list4 = bVar.f28450f;
            } else {
                list4 = list2;
            }
            if ((i9 & 64) != 0) {
                z14 = bVar.f28451g;
            } else {
                z14 = z10;
            }
            if ((i9 & 128) != 0) {
                z15 = bVar.f28452h;
            } else {
                z15 = z11;
            }
            if ((i9 & 256) != 0) {
                i10 = bVar.f28453i;
            } else {
                i10 = i8;
            }
            return bVar.a(z12, z13, enumC2906e3, enumC2906e4, list3, list4, z14, z15, i10);
        }

        public final b a(boolean z8, boolean z9, EnumC2906e brand, EnumC2906e enumC2906e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3292y.i(brand, "brand");
            AbstractC3292y.i(possibleBrands, "possibleBrands");
            AbstractC3292y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new b(z8, z9, brand, enumC2906e, possibleBrands, merchantPreferredNetworks, z10, z11, i8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28445a == bVar.f28445a && this.f28446b == bVar.f28446b && this.f28447c == bVar.f28447c && this.f28448d == bVar.f28448d && AbstractC3292y.d(this.f28449e, bVar.f28449e) && AbstractC3292y.d(this.f28450f, bVar.f28450f) && this.f28451g == bVar.f28451g && this.f28452h == bVar.f28452h && this.f28453i == bVar.f28453i;
        }

        public final EnumC2906e f() {
            return this.f28447c;
        }

        public final List h() {
            return this.f28450f;
        }

        public int hashCode() {
            int a9 = ((((androidx.compose.foundation.a.a(this.f28445a) * 31) + androidx.compose.foundation.a.a(this.f28446b)) * 31) + this.f28447c.hashCode()) * 31;
            EnumC2906e enumC2906e = this.f28448d;
            return ((((((((((a9 + (enumC2906e == null ? 0 : enumC2906e.hashCode())) * 31) + this.f28449e.hashCode()) * 31) + this.f28450f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f28451g)) * 31) + androidx.compose.foundation.a.a(this.f28452h)) * 31) + this.f28453i;
        }

        public final List i() {
            return this.f28449e;
        }

        public final boolean l() {
            return this.f28451g;
        }

        public final boolean p() {
            return this.f28452h;
        }

        public final int s() {
            return this.f28453i;
        }

        public String toString() {
            return "State(isCbcEligible=" + this.f28445a + ", isLoading=" + this.f28446b + ", brand=" + this.f28447c + ", userSelectedBrand=" + this.f28448d + ", possibleBrands=" + this.f28449e + ", merchantPreferredNetworks=" + this.f28450f + ", shouldShowCvc=" + this.f28451g + ", shouldShowErrorIcon=" + this.f28452h + ", tintColor=" + this.f28453i + ")";
        }

        public final EnumC2906e u() {
            return this.f28448d;
        }

        public final boolean v() {
            return this.f28445a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f28445a ? 1 : 0);
            out.writeInt(this.f28446b ? 1 : 0);
            out.writeString(this.f28447c.name());
            EnumC2906e enumC2906e = this.f28448d;
            if (enumC2906e == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC2906e.name());
            }
            List list = this.f28449e;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2906e) it.next()).name());
            }
            List list2 = this.f28450f;
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeString(((EnumC2906e) it2.next()).name());
            }
            out.writeInt(this.f28451g ? 1 : 0);
            out.writeInt(this.f28452h ? 1 : 0);
            out.writeInt(this.f28453i);
        }

        public /* synthetic */ b(boolean z8, boolean z9, EnumC2906e enumC2906e, EnumC2906e enumC2906e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, AbstractC3284p abstractC3284p) {
            this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? EnumC2906e.f32125w : enumC2906e, (i9 & 8) != 0 ? null : enumC2906e2, (i9 & 16) != 0 ? AbstractC1435t.m() : list, (i9 & 32) != 0 ? AbstractC1435t.m() : list2, (i9 & 64) != 0 ? false : z10, (i9 & 128) != 0 ? false : z11, (i9 & 256) == 0 ? i8 : 0);
        }
    }
}
