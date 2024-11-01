package f4;

import Q5.x;
import R5.AbstractC1435t;
import R5.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import d4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: f4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2858j extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final a f31885h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31886a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f31887b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f31888c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31889d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31890e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31891f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31892g;

    /* renamed from: f4.j$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: f4.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31893a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(b.a it) {
            AbstractC3292y.i(it, "it");
            return it.a();
        }
    }

    public /* synthetic */ C2858j(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? false : z8);
    }

    public final CompoundButton a(b.a option, Y3.b bVar, boolean z8) {
        CompoundButton materialCheckBox;
        AbstractC3292y.i(option, "option");
        if (this.f31886a) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (bVar != null) {
            String f8 = bVar.f();
            if (f8 != null && !l6.n.T(f8)) {
                CompoundButtonCompat.setButtonTintList(materialCheckBox, ColorStateList.valueOf(Color.parseColor(bVar.f())));
            }
            String p8 = bVar.p();
            if (p8 != null && !l6.n.T(p8)) {
                materialCheckBox.setTextColor(Color.parseColor(bVar.p()));
            }
        }
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.b());
        materialCheckBox.setPadding(this.f31890e, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.f31892g);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!z8) {
            layoutParams.bottomMargin = this.f31889d;
        }
        layoutParams.leftMargin = this.f31891f;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final void b(int i8) {
        View childAt = this.f31888c.getChildAt(i8);
        AbstractC3292y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void c(List list, Y3.b bVar) {
        if (list != null) {
            int size = list.size();
            Iterator it = i6.m.s(0, size).iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                b.a aVar = (b.a) list.get(nextInt);
                boolean z8 = true;
                if (nextInt != size - 1) {
                    z8 = false;
                }
                this.f31888c.addView(a(aVar, bVar, z8));
            }
        }
    }

    public final void d(String str, Y3.d dVar) {
        if (str != null && !l6.n.T(str)) {
            this.f31887b.a(str, dVar);
        } else {
            this.f31887b.setVisibility(8);
        }
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.f31886a) {
            return null;
        }
        i6.i s8 = i6.m.s(0, this.f31888c.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            View childAt = this.f31888c.getChildAt(((N) it).nextInt());
            AbstractC3292y.g(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.f31887b;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.f31888c;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        int size;
        Integer num;
        i6.i s8 = i6.m.s(0, this.f31888c.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            View childAt = this.f31888c.getChildAt(nextInt);
            AbstractC3292y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            if (((CompoundButton) childAt).isChecked()) {
                num = Integer.valueOf(nextInt);
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (this.f31886a) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        return AbstractC1435t.Q0(arrayList, size);
    }

    public final List<b.a> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.f31888c.getChildAt(((Number) it.next()).intValue()).getTag();
            AbstractC3292y.g(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((b.a) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return AbstractC1435t.w0(getSelectedOptions(), ",", null, null, 0, null, b.f31893a, 30, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3292y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, "state_super", Parcelable.class));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    AbstractC3292y.f(num);
                    b(num.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(x.a("state_super", super.onSaveInstanceState()), x.a("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2858j(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f31886a = z8;
        if (getId() == -1) {
            setId(U3.d.f10118x);
        }
        this.f31889d = context.getResources().getDimensionPixelSize(U3.b.f10082d);
        this.f31890e = context.getResources().getDimensionPixelSize(U3.b.f10079a);
        this.f31891f = context.getResources().getDimensionPixelSize(U3.b.f10081c);
        this.f31892g = context.getResources().getDimensionPixelSize(U3.b.f10080b);
        if (z8) {
            V3.f c8 = V3.f.c(LayoutInflater.from(context), this, true);
            AbstractC3292y.h(c8, "inflate(...)");
            ThreeDS2TextView label = c8.f10563b;
            AbstractC3292y.h(label, "label");
            this.f31887b = label;
            RadioGroup selectGroup = c8.f10564c;
            AbstractC3292y.h(selectGroup, "selectGroup");
            this.f31888c = selectGroup;
            return;
        }
        V3.e c9 = V3.e.c(LayoutInflater.from(context), this, true);
        AbstractC3292y.h(c9, "inflate(...)");
        ThreeDS2TextView label2 = c9.f10560b;
        AbstractC3292y.h(label2, "label");
        this.f31887b = label2;
        LinearLayout selectGroup2 = c9.f10561c;
        AbstractC3292y.h(selectGroup2, "selectGroup");
        this.f31888c = selectGroup2;
    }
}
