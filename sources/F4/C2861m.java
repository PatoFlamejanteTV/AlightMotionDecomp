package f4;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import e4.C2817a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2861m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31897b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f31898a;

    /* renamed from: f4.m$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final void a(AppCompatActivity activity, Y3.p toolbarCustomization) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.a() != null) {
                C2817a.f31704a.e(activity, Color.parseColor(toolbarCustomization.a()));
            } else if (toolbarCustomization.f() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.f());
                C2817a c2817a = C2817a.f31704a;
                c2817a.e(activity, c2817a.c(parseColor));
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2861m(FragmentActivity activity) {
        AbstractC3292y.i(activity, "activity");
        this.f31898a = activity;
    }

    public final ThreeDS2Button a(Y3.p pVar, Y3.b bVar) {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        String string;
        FragmentActivity fragmentActivity = this.f31898a;
        ThreeDS2Button threeDS2Button = null;
        if (fragmentActivity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) fragmentActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            threeDS2Button = new ThreeDS2Button(new ContextThemeWrapper(this.f31898a, U3.g.f10140a), null, 0, 6, null);
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(bVar);
            supportActionBar.setCustomView(threeDS2Button, new ActionBar.LayoutParams(-2, -2, 8388629));
            supportActionBar.setDisplayShowCustomEnabled(true);
            if (pVar != null) {
                String v8 = pVar.v();
                if (v8 != null && !l6.n.T(v8)) {
                    threeDS2Button.setText(pVar.v());
                } else {
                    threeDS2Button.setText(U3.f.f10138g);
                }
                String f8 = pVar.f();
                if (f8 != null) {
                    supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(f8)));
                    f31897b.a(appCompatActivity, pVar);
                }
                String h8 = pVar.h();
                if (h8 != null && !l6.n.T(h8)) {
                    string = pVar.h();
                    AbstractC3292y.f(string);
                } else {
                    string = this.f31898a.getString(U3.f.f10139h);
                    AbstractC3292y.f(string);
                }
                supportActionBar.setTitle(C2817a.f31704a.b(this.f31898a, string, pVar));
            } else {
                supportActionBar.setTitle(U3.f.f10139h);
                threeDS2Button.setText(U3.f.f10138g);
            }
        }
        return threeDS2Button;
    }
}
