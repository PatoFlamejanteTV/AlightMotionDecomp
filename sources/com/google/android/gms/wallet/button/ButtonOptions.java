package com.google.android.gms.wallet.button;

import Q.AbstractC1394n;
import Q.AbstractC1396p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s0.AbstractC3939a;

/* loaded from: classes3.dex */
public final class ButtonOptions extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new com.google.android.gms.wallet.button.a();

    /* renamed from: a, reason: collision with root package name */
    int f18198a;

    /* renamed from: b, reason: collision with root package name */
    int f18199b;

    /* renamed from: c, reason: collision with root package name */
    int f18200c;

    /* renamed from: d, reason: collision with root package name */
    String f18201d;

    /* renamed from: e, reason: collision with root package name */
    boolean f18202e = false;

    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(AbstractC3939a abstractC3939a) {
        }

        public ButtonOptions a() {
            return ButtonOptions.this;
        }

        public a b(String str) {
            ButtonOptions.this.f18201d = str;
            return this;
        }

        public a c(int i8) {
            ButtonOptions.this.f18199b = i8;
            return this;
        }

        public a d(int i8) {
            ButtonOptions.this.f18198a = i8;
            return this;
        }

        public a e(int i8) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f18200c = i8;
            buttonOptions.f18202e = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    public static a z() {
        return new a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (AbstractC1394n.a(Integer.valueOf(this.f18198a), Integer.valueOf(buttonOptions.f18198a)) && AbstractC1394n.a(Integer.valueOf(this.f18199b), Integer.valueOf(buttonOptions.f18199b)) && AbstractC1394n.a(Integer.valueOf(this.f18200c), Integer.valueOf(buttonOptions.f18200c)) && AbstractC1394n.a(this.f18201d, buttonOptions.f18201d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1394n.b(Integer.valueOf(this.f18198a));
    }

    public String s() {
        return this.f18201d;
    }

    public int u() {
        return this.f18199b;
    }

    public int v() {
        return this.f18198a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.k(parcel, 1, v());
        c.k(parcel, 2, u());
        c.k(parcel, 3, y());
        c.q(parcel, 4, s(), false);
        c.b(parcel, a9);
    }

    public int y() {
        return this.f18200c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ButtonOptions(int i8, int i9, int i10, String str) {
        this.f18198a = ((Integer) AbstractC1396p.l(Integer.valueOf(i8))).intValue();
        this.f18199b = ((Integer) AbstractC1396p.l(Integer.valueOf(i9))).intValue();
        this.f18200c = ((Integer) AbstractC1396p.l(Integer.valueOf(i10))).intValue();
        this.f18201d = (String) AbstractC1396p.l(str);
    }
}
