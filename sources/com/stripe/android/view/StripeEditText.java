package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class StripeEditText extends TextInputEditText {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28861a;

    /* renamed from: b, reason: collision with root package name */
    private a f28862b;

    /* renamed from: c, reason: collision with root package name */
    private b f28863c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f28864d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f28865e;

    /* renamed from: f, reason: collision with root package name */
    private int f28866f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f28867g;

    /* renamed from: h, reason: collision with root package name */
    private List f28868h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28869i;

    /* renamed from: j, reason: collision with root package name */
    private String f28870j;

    /* renamed from: k, reason: collision with root package name */
    private c f28871k;

    /* renamed from: l, reason: collision with root package name */
    private final f f28872l;

    /* renamed from: m, reason: collision with root package name */
    private final List f28873m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnFocusChangeListener f28874n;

    /* renamed from: o, reason: collision with root package name */
    private final String f28875o;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str);
    }

    /* loaded from: classes4.dex */
    private static final class d extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final b f28876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InputConnection target, boolean z8, b bVar) {
            super(target, z8);
            AbstractC3292y.i(target, "target");
            this.f28876a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i8, int i9) {
            b bVar;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (bVar = this.f28876a) != null) {
                bVar.a();
            }
            return super.deleteSurroundingText(i8, i9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f28877a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28878b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f28879c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(Parcelable parcelable, String str, boolean z8) {
            this.f28877a = parcelable;
            this.f28878b = str;
            this.f28879c = z8;
        }

        public final String a() {
            return this.f28878b;
        }

        public final boolean b() {
            return this.f28879c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3292y.d(this.f28877a, eVar.f28877a) && AbstractC3292y.d(this.f28878b, eVar.f28878b) && this.f28879c == eVar.f28879c;
        }

        public final Parcelable f() {
            return this.f28877a;
        }

        public int hashCode() {
            Parcelable parcelable = this.f28877a;
            int hashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.f28878b;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f28879c);
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.f28877a + ", errorMessage=" + this.f28878b + ", shouldShowError=" + this.f28879c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f28877a, i8);
            out.writeString(this.f28878b);
            out.writeInt(this.f28879c ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends Q0 {
        f() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            boolean z8;
            StripeEditText stripeEditText = StripeEditText.this;
            if (i10 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            stripeEditText.setLastKeyDelete$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str;
            a aVar = StripeEditText.this.f28862b;
            if (aVar != null) {
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                aVar.a(str);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void d() {
        int i8;
        Context context = getContext();
        if (N0.f28682g.a(this.f28864d.getDefaultColor())) {
            i8 = n2.x.f35456g;
        } else {
            i8 = n2.x.f35455f;
        }
        this.f28866f = ContextCompat.getColor(context, i8);
    }

    private final boolean e(int i8) {
        return i8 == 67;
    }

    private final void g() {
        List list = this.f28868h;
        if (list == null) {
            list = AbstractC1435t.m();
        }
        if (!list.contains(this.f28872l)) {
            addTextChangedListener(this.f28872l);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.O0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
                boolean h8;
                h8 = StripeEditText.h(StripeEditText.this, view, i8, keyEvent);
                return h8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(StripeEditText this$0, View view, int i8, KeyEvent keyEvent) {
        b bVar;
        AbstractC3292y.i(this$0, "this$0");
        if (keyEvent.getAction() == 0) {
            boolean e8 = this$0.e(i8);
            this$0.f28861a = e8;
            if (e8 && this$0.length() == 0 && (bVar = this$0.f28863c) != null) {
                bVar.a();
                return false;
            }
            return false;
        }
        return false;
    }

    private final void i() {
        addTextChangedListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(StripeEditText this$0, View view, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f28873m.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z8);
        }
        View.OnFocusChangeListener onFocusChangeListener = this$0.f28874n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z8);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        List list;
        super.addTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.f28868h) != null) {
            list.add(textWatcher);
        }
    }

    public final boolean f() {
        return this.f28861a;
    }

    protected String getAccessibilityText() {
        return this.f28875o;
    }

    public final ColorStateList getDefaultColorStateList$payments_core_release() {
        return this.f28864d;
    }

    @ColorInt
    public final int getDefaultErrorColorInt() {
        d();
        return this.f28866f;
    }

    public final String getErrorMessage$payments_core_release() {
        return this.f28870j;
    }

    public final String getFieldText$payments_core_release() {
        String str;
        Editable text = getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.f28873m;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f28874n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.f28869i;
    }

    public final void j() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AbstractC3292y.i(outAttrs, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection != null) {
            return new d(onCreateInputConnection, true, this.f28863c);
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        AbstractC3292y.i(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.f28869i);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.f28870j;
        if (!this.f28869i) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        AbstractC3292y.g(parcelable, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f());
        this.f28870j = eVar.a();
        setShouldShowError(eVar.b());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new e(super.onSaveInstanceState(), this.f28870j, this.f28869i);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        List list;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.f28868h) != null) {
            list.remove(textWatcher);
        }
    }

    public final void setAfterTextChangedListener(a aVar) {
        this.f28862b = aVar;
    }

    @VisibleForTesting
    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        AbstractC3292y.i(colorStateList, "<set-?>");
        this.f28864d = colorStateList;
    }

    public final void setDeleteEmptyListener(b bVar) {
        this.f28863c = bVar;
    }

    public final void setErrorColor(@ColorInt int i8) {
        this.f28867g = Integer.valueOf(i8);
    }

    public final void setErrorMessage(String str) {
        this.f28870j = str;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.f28870j = str;
    }

    public final void setErrorMessageListener(c cVar) {
        this.f28871k = cVar;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z8) {
        this.f28861a = z8;
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.P0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                StripeEditText.k(StripeEditText.this, view, z8);
            }
        });
        this.f28874n = onFocusChangeListener;
    }

    public final void setShouldShowError(boolean z8) {
        int i8;
        c cVar;
        String str = this.f28870j;
        if (str != null && (cVar = this.f28871k) != null) {
            if (!z8) {
                str = null;
            }
            cVar.a(str);
        }
        if (this.f28869i != z8) {
            if (z8) {
                Integer num = this.f28867g;
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = this.f28866f;
                }
                super.setTextColor(i8);
            } else {
                ColorStateList colorStateList = this.f28865e;
                if (colorStateList == null) {
                    colorStateList = this.f28864d;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.f28869i = z8;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f28865e = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence charSequence) {
        List list = this.f28868h;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(charSequence);
        List list2 = this.f28868h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i8) {
        setTextColor(ColorStateList.valueOf(i8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28872l = new f();
        this.f28868h = new ArrayList();
        setMaxLines(1);
        i();
        g();
        ColorStateList textColors = getTextColors();
        AbstractC3292y.h(textColors, "getTextColors(...)");
        this.f28864d = textColors;
        d();
        setOnFocusChangeListener(null);
        this.f28873m = new ArrayList();
    }
}
