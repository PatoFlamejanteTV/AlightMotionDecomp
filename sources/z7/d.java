package Z7;

import J6.h;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
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
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import c.C1999g;
import c.C2001i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3475q0;

/* loaded from: classes5.dex */
public final class d extends a8.a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f14013x = new a();

    /* renamed from: y, reason: collision with root package name */
    public static final String f14014y;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14015m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f14016n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f14017o;

    /* renamed from: p, reason: collision with root package name */
    public CheckBox f14018p;

    /* renamed from: q, reason: collision with root package name */
    public Button f14019q;

    /* renamed from: r, reason: collision with root package name */
    public CardView f14020r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14021s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14022t;

    /* renamed from: u, reason: collision with root package name */
    public NestedScrollView f14023u;

    /* renamed from: v, reason: collision with root package name */
    public FrameLayout f14024v;

    /* renamed from: w, reason: collision with root package name */
    public f f14025w;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = d.class.getSimpleName();
        AbstractC3292y.h(simpleName, "CCPAPrivacyFragment::class.java.simpleName");
        f14014y = simpleName;
    }

    public static final void k(d this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void l(d this$0, String link, View view) {
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
            Log.e(f14014y, "No a valid URL has been passed");
        }
    }

    public static final void n(d this$0, View view) {
        boolean isChecked;
        h hVar;
        String str;
        h hVar2;
        J6.a aVar;
        AbstractC3292y.i(this$0, "this$0");
        f fVar = this$0.f14025w;
        C1999g c1999g = null;
        if (fVar == null) {
            AbstractC3292y.y("viewModel");
            fVar = null;
        }
        CheckBox checkBox = this$0.f14018p;
        if (checkBox == null) {
            isChecked = false;
        } else {
            isChecked = checkBox.isChecked();
        }
        SharedStorage sharedStorage = fVar.f14029a;
        if (isChecked) {
            hVar = h.YES;
        } else {
            hVar = h.NO;
        }
        h hVar3 = hVar;
        J6.f fVar2 = fVar.f14032d;
        if (fVar2 == null || (aVar = fVar2.f4497b) == null) {
            str = null;
        } else {
            str = aVar.f4458d;
        }
        if (AbstractC3292y.d(str, "Y")) {
            hVar2 = h.YES;
        } else {
            hVar2 = h.NO;
        }
        SharedStorage.f(sharedStorage, 0, h.YES, hVar3, hVar2, 1, null);
        ChoiceCmpCallback choiceCmpCallback = fVar.f14030b;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCCPAConsentGiven(fVar.f14029a.j(X7.a.PRIVACY_STRING));
        }
        AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new e(fVar, isChecked, null), 2, null);
        if (C2001i.f15173b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15164h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            }
            if (c1999g != null) {
                c1999g.h();
            }
        }
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void m(TextView textView, final String str, String str2, boolean z8) {
        if (textView != null) {
            textView.setText(str2);
            M5.a.a(textView, z8);
            textView.setOnClickListener(new View.OnClickListener() { // from class: Z7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l(d.this, str, view);
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
            this.f14025w = (f) new ViewModelProvider(viewModelStore, new g()).get(f.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6044b, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…rivacy, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h hVar;
        h hVar2;
        J6.a aVar;
        TextView textView;
        String str;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f14015m = (LinearLayout) view.findViewById(M1.b.f6021q);
        this.f14016n = (TextView) view.findViewById(M1.b.f5972Z0);
        this.f14017o = (TextView) view.findViewById(M1.b.f6036w0);
        this.f14018p = (CheckBox) view.findViewById(M1.b.f6012n);
        this.f14019q = (Button) view.findViewById(M1.b.f5982d);
        this.f14020r = (CardView) view.findViewById(M1.b.f5973a);
        this.f14021s = (TextView) view.findViewById(M1.b.f6022q0);
        this.f14022t = (TextView) view.findViewById(M1.b.f6019p0);
        this.f14023u = (NestedScrollView) view.findViewById(M1.b.f5995h0);
        int i8 = M1.b.f6041z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i8);
        this.f14024v = frameLayout;
        String str2 = null;
        if (C2001i.f15173b) {
            getChildFragmentManager().beginTransaction().add(i8, new C1999g(), C1999g.f15164h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TextView textView2 = this.f14148b;
        if (textView2 != null) {
            f fVar = this.f14025w;
            if (fVar == null) {
                AbstractC3292y.y("viewModel");
                fVar = null;
            }
            String str3 = fVar.f14031c.f9778a;
            if (str3.length() == 0) {
                str3 = getString(M1.e.f6071c);
                AbstractC3292y.h(str3, "getString(R.string.ccpa_privacy_title)");
            }
            textView2.setText(str3);
        }
        f fVar2 = this.f14025w;
        if (fVar2 == null) {
            AbstractC3292y.y("viewModel");
            fVar2 = null;
        }
        if (fVar2.d().length() > 0) {
            TextView textView3 = this.f14021s;
            if (textView3 != null) {
                f fVar3 = this.f14025w;
                if (fVar3 == null) {
                    AbstractC3292y.y("viewModel");
                    fVar3 = null;
                }
                textView3.setText(P5.a.a(fVar3.d()));
            }
        } else {
            TextView textView4 = this.f14021s;
            if (textView4 != null) {
                textView4.setText(M1.e.f6070b);
            }
        }
        TextView textView5 = this.f14021s;
        if (textView5 != null) {
            f fVar4 = this.f14025w;
            if (fVar4 == null) {
                AbstractC3292y.y("viewModel");
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
        TextView textView6 = this.f14021s;
        if (textView6 != null) {
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f14021s) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, M1.a.f5916b));
        }
        LinearLayout linearLayout = this.f14015m;
        if (linearLayout != null) {
            f fVar5 = this.f14025w;
            if (fVar5 == null) {
                AbstractC3292y.y("viewModel");
                fVar5 = null;
            }
            M5.a.a(linearLayout, fVar5.e());
        }
        TextView textView7 = this.f14017o;
        f fVar6 = this.f14025w;
        if (fVar6 == null) {
            AbstractC3292y.y("viewModel");
            fVar6 = null;
        }
        String f8 = fVar6.f();
        f fVar7 = this.f14025w;
        if (fVar7 == null) {
            AbstractC3292y.y("viewModel");
            fVar7 = null;
        }
        String g8 = fVar7.g();
        f fVar8 = this.f14025w;
        if (fVar8 == null) {
            AbstractC3292y.y("viewModel");
            fVar8 = null;
        }
        m(textView7, f8, g8, fVar8.h());
        TextView textView8 = this.f14022t;
        f fVar9 = this.f14025w;
        if (fVar9 == null) {
            AbstractC3292y.y("viewModel");
            fVar9 = null;
        }
        String a9 = fVar9.a();
        f fVar10 = this.f14025w;
        if (fVar10 == null) {
            AbstractC3292y.y("viewModel");
            fVar10 = null;
        }
        String b9 = fVar10.b();
        f fVar11 = this.f14025w;
        if (fVar11 == null) {
            AbstractC3292y.y("viewModel");
            fVar11 = null;
        }
        m(textView8, a9, b9, fVar11.c());
        TextView textView9 = this.f14016n;
        f fVar12 = this.f14025w;
        if (fVar12 == null) {
            AbstractC3292y.y("viewModel");
            fVar12 = null;
        }
        String i9 = fVar12.i();
        f fVar13 = this.f14025w;
        if (fVar13 == null) {
            AbstractC3292y.y("viewModel");
            fVar13 = null;
        }
        String j8 = fVar13.j();
        f fVar14 = this.f14025w;
        if (fVar14 == null) {
            AbstractC3292y.y("viewModel");
            fVar14 = null;
        }
        m(textView9, i9, j8, fVar14.k());
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: Z7.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.k(d.this, view2);
                }
            });
            f fVar15 = this.f14025w;
            if (fVar15 == null) {
                AbstractC3292y.y("viewModel");
                fVar15 = null;
            }
            imageView.setContentDescription(fVar15.f14031c.f9783f);
        }
        CheckBox checkBox = this.f14018p;
        if (checkBox != null) {
            f fVar16 = this.f14025w;
            if (fVar16 == null) {
                AbstractC3292y.y("viewModel");
                fVar16 = null;
            }
            checkBox.setChecked(AbstractC3292y.d(fVar16.f14029a.a(2, 3), "Y"));
        }
        Button button = this.f14019q;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: Z7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.n(d.this, view2);
                }
            });
        }
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num = cVar.f9792g;
            if (num != null) {
                int intValue = num.intValue();
                view.setBackgroundColor(intValue);
                CardView cardView = this.f14020r;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f9786a;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.f14023u;
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
                TextView textView10 = this.f14021s;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
                CheckBox checkBox2 = this.f14018p;
                if (checkBox2 != null) {
                    checkBox2.setTextColor(intValue3);
                }
                CheckBox checkBox3 = this.f14018p;
                if (checkBox3 != null) {
                    checkBox3.setButtonTintList(ColorStateList.valueOf(intValue3));
                }
            }
            Integer num4 = cVar.f9797l;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                TextView textView11 = this.f14021s;
                if (textView11 != null) {
                    textView11.setLinkTextColor(intValue4);
                }
                TextView textView12 = this.f14022t;
                if (textView12 != null) {
                    textView12.setTextColor(intValue4);
                }
                TextView textView13 = this.f14017o;
                if (textView13 != null) {
                    textView13.setTextColor(intValue4);
                }
                TextView textView14 = this.f14016n;
                if (textView14 != null) {
                    textView14.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f9800o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button2 = this.f14019q;
                if (button2 != null) {
                    button2.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f9798m;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button3 = this.f14019q;
                if (button3 != null) {
                    button3.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f14158l;
        if (typeface != null) {
            TextView textView15 = this.f14021s;
            if (textView15 != null) {
                textView15.setTypeface(typeface);
            }
            TextView textView16 = this.f14022t;
            if (textView16 != null) {
                textView16.setTypeface(typeface);
            }
            TextView textView17 = this.f14017o;
            if (textView17 != null) {
                textView17.setTypeface(typeface);
            }
            TextView textView18 = this.f14016n;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            CheckBox checkBox4 = this.f14018p;
            if (checkBox4 != null) {
                checkBox4.setTypeface(typeface);
            }
            Button button4 = this.f14019q;
            if (button4 != null) {
                button4.setTypeface(typeface);
            }
        }
        f fVar17 = this.f14025w;
        if (fVar17 == null) {
            AbstractC3292y.y("viewModel");
            fVar17 = null;
        }
        SharedStorage sharedStorage = fVar17.f14029a;
        if (AbstractC3292y.d(sharedStorage.a(2, 3), "Y")) {
            hVar = h.YES;
        } else {
            hVar = h.NO;
        }
        h hVar3 = hVar;
        J6.f fVar18 = fVar17.f14032d;
        if (fVar18 != null && (aVar = fVar18.f4497b) != null) {
            str2 = aVar.f4458d;
        }
        if (AbstractC3292y.d(str2, "Y")) {
            hVar2 = h.YES;
        } else {
            hVar2 = h.NO;
        }
        SharedStorage.f(sharedStorage, 0, h.YES, hVar3, hVar2, 1, null);
    }
}
