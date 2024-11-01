package q;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import c.C2001i;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3599f extends a8.a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f36556x = new a();

    /* renamed from: y, reason: collision with root package name */
    public static final String f36557y;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f36558m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f36559n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f36560o;

    /* renamed from: p, reason: collision with root package name */
    public Button f36561p;

    /* renamed from: q, reason: collision with root package name */
    public Button f36562q;

    /* renamed from: r, reason: collision with root package name */
    public CardView f36563r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f36564s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f36565t;

    /* renamed from: u, reason: collision with root package name */
    public NestedScrollView f36566u;

    /* renamed from: v, reason: collision with root package name */
    public Z7.f f36567v;

    /* renamed from: w, reason: collision with root package name */
    public C3606m f36568w;

    /* renamed from: q.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        String simpleName = C3599f.class.getSimpleName();
        AbstractC3292y.h(simpleName, "MSPAPrivacyFragment::class.java.simpleName");
        f36557y = simpleName;
    }

    public static final void l(C3599f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void m(C3599f this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void n(C3599f this$0, String link, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(link, "$link");
        this$0.getClass();
        try {
            if (link.length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(link));
                this$0.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(f36557y, "No a valid URL has been passed");
        }
    }

    public static final void o(final C3599f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        C3606m c3606m = this$0.f36568w;
        if (c3606m == null) {
            AbstractC3292y.y("mspaViewModel");
            c3606m = null;
        }
        c3606m.a().observe(this$0, new Observer() { // from class: q.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3599f.m(C3599f.this, (String) obj);
            }
        });
    }

    public static final void p(C3599f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3292y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3605l(), C3605l.f36575B)) != null) {
            add.commit();
        }
    }

    public final void k(TextView textView, final String str, String str2, boolean z8) {
        if (textView != null) {
            textView.setText(str2);
            M5.a.a(textView, z8);
            textView.setOnClickListener(new View.OnClickListener() { // from class: q.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3599f.n(C3599f.this, str, view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        AbstractC3292y.i(dialog, "dialog");
        super.onCancel(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f36567v = (Z7.f) new ViewModelProvider(viewModelStore, new Z7.g()).get(Z7.f.class);
            ViewModelStore viewModelStore2 = getViewModelStore();
            AbstractC3292y.h(viewModelStore2, "viewModelStore");
            this.f36568w = (C3606m) new ViewModelProvider(viewModelStore2, new C3609p()).get(C3606m.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6048f, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…rivacy, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List list;
        TextView textView;
        String str;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f36558m = (LinearLayout) view.findViewById(M1.b.f6021q);
        this.f36559n = (TextView) view.findViewById(M1.b.f5972Z0);
        this.f36560o = (TextView) view.findViewById(M1.b.f6036w0);
        this.f36565t = (TextView) view.findViewById(M1.b.f6019p0);
        this.f36563r = (CardView) view.findViewById(M1.b.f5973a);
        this.f36564s = (TextView) view.findViewById(M1.b.f6022q0);
        this.f36566u = (NestedScrollView) view.findViewById(M1.b.f5995h0);
        this.f36561p = (Button) view.findViewById(M1.b.f6000j);
        this.f36562q = (Button) view.findViewById(M1.b.f5985e);
        C3606m c3606m = this.f36568w;
        C3606m c3606m2 = null;
        if (c3606m == null) {
            AbstractC3292y.y("mspaViewModel");
            c3606m = null;
        }
        H6.i.f3302a.c(c3606m.f36590a);
        TextView textView2 = this.f14148b;
        if (textView2 != null) {
            Z7.f fVar = this.f36567v;
            if (fVar == null) {
                AbstractC3292y.y("ccpaViewModel");
                fVar = null;
            }
            String str2 = fVar.f14031c.f9778a;
            if (str2.length() == 0) {
                str2 = getString(M1.e.f6071c);
                AbstractC3292y.h(str2, "getString(R.string.ccpa_privacy_title)");
            }
            textView2.setText(str2);
        }
        Z7.f fVar2 = this.f36567v;
        if (fVar2 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar2 = null;
        }
        if (fVar2.d().length() > 0) {
            TextView textView3 = this.f36564s;
            if (textView3 != null) {
                Z7.f fVar3 = this.f36567v;
                if (fVar3 == null) {
                    AbstractC3292y.y("ccpaViewModel");
                    fVar3 = null;
                }
                textView3.setText(P5.a.a(fVar3.d()));
            }
        } else {
            TextView textView4 = this.f36564s;
            if (textView4 != null) {
                textView4.setText(M1.e.f6070b);
            }
        }
        TextView textView5 = this.f36564s;
        if (textView5 != null) {
            Z7.f fVar4 = this.f36567v;
            if (fVar4 == null) {
                AbstractC3292y.y("ccpaViewModel");
                fVar4 = null;
            }
            fVar4.getClass();
            if (C2001i.f15173b) {
                str = fVar4.f14034f.f5406b.f5401c;
            } else {
                str = "";
            }
            textView5.append(str);
        }
        TextView textView6 = this.f36564s;
        if (textView6 != null) {
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f36564s) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, M1.a.f5916b));
        }
        LinearLayout linearLayout = this.f36558m;
        if (linearLayout != null) {
            Z7.f fVar5 = this.f36567v;
            if (fVar5 == null) {
                AbstractC3292y.y("ccpaViewModel");
                fVar5 = null;
            }
            M5.a.a(linearLayout, fVar5.e());
        }
        TextView textView7 = this.f36560o;
        Z7.f fVar6 = this.f36567v;
        if (fVar6 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar6 = null;
        }
        String f8 = fVar6.f();
        Z7.f fVar7 = this.f36567v;
        if (fVar7 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar7 = null;
        }
        String g8 = fVar7.g();
        Z7.f fVar8 = this.f36567v;
        if (fVar8 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar8 = null;
        }
        k(textView7, f8, g8, fVar8.h());
        TextView textView8 = this.f36565t;
        Z7.f fVar9 = this.f36567v;
        if (fVar9 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar9 = null;
        }
        String a9 = fVar9.a();
        Z7.f fVar10 = this.f36567v;
        if (fVar10 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar10 = null;
        }
        String b9 = fVar10.b();
        Z7.f fVar11 = this.f36567v;
        if (fVar11 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar11 = null;
        }
        k(textView8, a9, b9, fVar11.c());
        TextView textView9 = this.f36559n;
        Z7.f fVar12 = this.f36567v;
        if (fVar12 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar12 = null;
        }
        String i8 = fVar12.i();
        Z7.f fVar13 = this.f36567v;
        if (fVar13 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar13 = null;
        }
        String j8 = fVar13.j();
        Z7.f fVar14 = this.f36567v;
        if (fVar14 == null) {
            AbstractC3292y.y("ccpaViewModel");
            fVar14 = null;
        }
        k(textView9, i8, j8, fVar14.k());
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3599f.l(C3599f.this, view2);
                }
            });
            Z7.f fVar15 = this.f36567v;
            if (fVar15 == null) {
                AbstractC3292y.y("ccpaViewModel");
                fVar15 = null;
            }
            imageView.setContentDescription(fVar15.f14031c.f9783f);
        }
        Button button = this.f36562q;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3599f.o(C3599f.this, view2);
                }
            });
        }
        Button button2 = this.f36561p;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3599f.p(C3599f.this, view2);
                }
            });
        }
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num = cVar.f9792g;
            if (num != null) {
                int intValue = num.intValue();
                view.setBackgroundColor(intValue);
                CardView cardView = this.f36563r;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f9786a;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.f36566u;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue2);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f9794i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView10 = this.f36564s;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f9797l;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                TextView textView11 = this.f36564s;
                if (textView11 != null) {
                    textView11.setLinkTextColor(intValue4);
                }
                TextView textView12 = this.f36565t;
                if (textView12 != null) {
                    textView12.setTextColor(intValue4);
                }
                TextView textView13 = this.f36560o;
                if (textView13 != null) {
                    textView13.setTextColor(intValue4);
                }
                TextView textView14 = this.f36559n;
                if (textView14 != null) {
                    textView14.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f9800o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f36561p;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f36562q;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f9798m;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f36561p;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
                Button button6 = this.f36562q;
                if (button6 != null) {
                    button6.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f14158l;
        if (typeface != null) {
            TextView textView15 = this.f36564s;
            if (textView15 != null) {
                textView15.setTypeface(typeface);
            }
            TextView textView16 = this.f36565t;
            if (textView16 != null) {
                textView16.setTypeface(typeface);
            }
            TextView textView17 = this.f36560o;
            if (textView17 != null) {
                textView17.setTypeface(typeface);
            }
            TextView textView18 = this.f36559n;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            Button button7 = this.f36562q;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f36561p;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        C3606m c3606m3 = this.f36568w;
        if (c3606m3 == null) {
            AbstractC3292y.y("mspaViewModel");
        } else {
            c3606m2 = c3606m3;
        }
        c3606m2.getClass();
        if (!H6.i.f3306e && (list = c3606m2.f36590a.f3253d) != null) {
            H6.d.f3272a.b(list, true, new C3607n(c3606m2));
        }
        H6.i.f3306e = true;
        SharedStorage m8 = Y7.d.f13152a.m();
        X7.a preferenceKey = X7.a.MSPA_SHOWN;
        m8.getClass();
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = m8.f19084a.edit();
        AbstractC3292y.h(editor, "editor");
        editor.putBoolean("MSPAShown", true);
        editor.apply();
    }
}
