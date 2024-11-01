package c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b8.a;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1995c extends a8.a implements a.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f15152q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f15153r;

    /* renamed from: m, reason: collision with root package name */
    public TextView f15154m;

    /* renamed from: n, reason: collision with root package name */
    public Button f15155n;

    /* renamed from: o, reason: collision with root package name */
    public NestedScrollView f15156o;

    /* renamed from: p, reason: collision with root package name */
    public C1997e f15157p;

    /* renamed from: c.c$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        String simpleName = C1995c.class.getSimpleName();
        AbstractC3292y.h(simpleName, "GBCFragment::class.java.simpleName");
        f15153r = simpleName;
    }

    public static final void k(C1995c this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void l(C1995c this$0, View view) {
        C1999g c1999g;
        AbstractC3292y.i(this$0, "this$0");
        Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15164h);
        if (findFragmentByTag instanceof C1999g) {
            c1999g = (C1999g) findFragmentByTag;
        } else {
            c1999g = null;
        }
        if (c1999g != null) {
            c1999g.h();
        }
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // b8.a.b
    public void b(b8.d item) {
        AbstractC3292y.i(item, "item");
    }

    @Override // b8.a.b
    public void e(b8.d item) {
        AbstractC3292y.i(item, "item");
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
            this.f15157p = (C1997e) new ViewModelProvider(viewModelStore, new C1998f()).get(C1997e.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6054l, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…screen, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f15154m = (TextView) view.findViewById(M1.b.f5944L0);
        this.f15155n = (Button) view.findViewById(M1.b.f6006l);
        this.f15156o = (NestedScrollView) view.findViewById(M1.b.f5995h0);
        C1997e c1997e = null;
        getChildFragmentManager().beginTransaction().add(M1.b.f6041z, new C1999g(), C1999g.f15164h).addToBackStack(null).commit();
        TextView textView3 = this.f14148b;
        if (textView3 != null) {
            C1997e c1997e2 = this.f15157p;
            if (c1997e2 == null) {
                AbstractC3292y.y("viewModel");
                c1997e2 = null;
            }
            String str = c1997e2.f15161c.f5406b.f5399a;
            if (str.length() == 0) {
                str = getString(M1.e.f6084p);
                AbstractC3292y.h(str, "getString(R.string.we_value_your_privacy)");
            }
            textView3.setText(str);
        }
        TextView textView4 = this.f15154m;
        if (textView4 != null) {
            C1997e c1997e3 = this.f15157p;
            if (c1997e3 == null) {
                AbstractC3292y.y("viewModel");
                c1997e3 = null;
            }
            String str2 = c1997e3.f15161c.f5406b.f5401c;
            if (str2.length() == 0) {
                str2 = getString(M1.e.f6074f);
                AbstractC3292y.h(str2, "getString(R.string.gbc_description)");
            }
            textView4.setText(str2);
        }
        TextView textView5 = this.f15154m;
        if (textView5 != null) {
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView2 = this.f15154m) != null) {
            textView2.setLinkTextColor(ContextCompat.getColor(context, M1.a.f5916b));
        }
        Button button = this.f15155n;
        if (button != null) {
            C1997e c1997e4 = this.f15157p;
            if (c1997e4 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                c1997e = c1997e4;
            }
            String str3 = c1997e.f15161c.f5406b.f5402d;
            if (str3.length() == 0) {
                str3 = getString(M1.e.f6082n);
                AbstractC3292y.h(str3, "getString(R.string.save_and_exit)");
            }
            button.setText(str3);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: c.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1995c.k(C1995c.this, view2);
                }
            });
        }
        Button button2 = this.f15155n;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: c.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1995c.l(C1995c.this, view2);
                }
            });
        }
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num = cVar.f9792g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f9786a;
            if (num2 != null) {
                int intValue = num2.intValue();
                NestedScrollView nestedScrollView = this.f15156o;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f9794i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView6 = this.f15154m;
                if (textView6 != null) {
                    textView6.setTextColor(intValue2);
                }
            }
            Integer num4 = cVar.f9800o;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                Button button3 = this.f15155n;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue3);
                }
            }
            Integer num5 = cVar.f9798m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button4 = this.f15155n;
                if (button4 != null) {
                    button4.setTextColor(intValue4);
                }
            }
        }
        Typeface typeface = this.f14158l;
        if (typeface != null && (textView = this.f15154m) != null) {
            textView.setTypeface(typeface);
        }
    }
}
