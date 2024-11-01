package I5;

import D5.p;
import D5.q;
import D5.r;
import D5.s;
import Q7.n;
import R5.AbstractC1435t;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b.AbstractC1948c;
import c.C2001i;
import com.inmobi.cmp.core.model.Vector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n.AbstractC3381a;
import n6.AbstractC3462k;
import n6.C3445b0;

/* loaded from: classes5.dex */
public final class f extends AbstractC3381a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f3766l = new a();

    /* renamed from: m, reason: collision with root package name */
    public static String f3767m;

    /* renamed from: a, reason: collision with root package name */
    public ConstraintLayout f3768a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f3769b;

    /* renamed from: c, reason: collision with root package name */
    public Button f3770c;

    /* renamed from: d, reason: collision with root package name */
    public Button f3771d;

    /* renamed from: e, reason: collision with root package name */
    public Button f3772e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3773f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3774g;

    /* renamed from: h, reason: collision with root package name */
    public l f3775h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f3776i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f3777j;

    /* renamed from: k, reason: collision with root package name */
    public S7.c f3778k;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3292y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
        f3767m = simpleName;
    }

    public static final void l(final f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        l lVar = this$0.f3775h;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        s sVar = lVar.f3791a;
        sVar.f1439z.forEach(new r(sVar));
        sVar.f1409C.forEach(new p(sVar));
        Vector vector = sVar.f1408B;
        vector.unset(vector.getKeys());
        sVar.f1407A.unsetAllOwnedItems();
        sVar.f1430q.unsetAllOwnedItems();
        sVar.f1431r.unsetAllOwnedItems();
        sVar.f1432s.setAllOwnedItems();
        sVar.f1409C.forEach(new q(sVar));
        lVar.a();
        lVar.f3800j.b();
        Q7.m.f9074a.b(n.REJECT_ALL, Q7.f.GDPR).observe(this$0, new Observer() { // from class: I5.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.m(f.this, (String) obj);
            }
        });
    }

    public static final void m(f this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void o(f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3292y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new x5.i(), x5.i.f41101F)) != null) {
            add.commit();
        }
    }

    public static final void p(f this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        l lVar = this$0.f3775h;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.f3791a.x();
        lVar.a();
        lVar.f3800j.a();
        Q7.m.f9074a.b(n.ACCEPT_ALL, Q7.f.GDPR).observe(this$0, new Observer() { // from class: I5.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.p(f.this, (String) obj);
            }
        });
    }

    @Override // n.AbstractC3381a
    public void i(ViewStub viewStub) {
        AbstractC3292y.i(viewStub, "viewStub");
        viewStub.setLayoutResource(M1.c.f6056n);
        View inflatedView = viewStub.inflate();
        AbstractC3292y.h(inflatedView, "inflatedView");
        this.f3768a = (ConstraintLayout) inflatedView.findViewById(M1.b.f5947N);
        this.f3769b = (ImageView) inflatedView.findViewById(M1.b.f5927D);
        this.f3770c = (Button) inflatedView.findViewById(M1.b.f5994h);
        this.f3771d = (Button) inflatedView.findViewById(M1.b.f5988f);
        this.f3772e = (Button) inflatedView.findViewById(M1.b.f5976b);
        this.f3773f = (TextView) inflatedView.findViewById(M1.b.f5962U0);
        this.f3774g = (TextView) inflatedView.findViewById(M1.b.f6023q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableString k(java.lang.String r7, android.text.SpannableString r8, java.lang.String r9, android.text.style.ClickableSpan r10, boolean r11) {
        /*
            r6 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "subString"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r3)
            r3 = 0
            if (r7 != 0) goto Lc
            goto L25
        Lc:
            l6.j r4 = new l6.j
            l6.l r5 = l6.l.f34786c
            r4.<init>(r9, r5)
            k6.g r7 = l6.j.d(r4, r7, r2, r1, r3)
            java.util.Iterator r4 = r7.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L22
            goto L23
        L22:
            r7 = r3
        L23:
            if (r7 != 0) goto L27
        L25:
            r7 = r3
            goto L58
        L27:
            if (r11 == 0) goto L30
            java.lang.Object r7 = k6.AbstractC3258j.x(r7)
        L2d:
            l6.h r7 = (l6.h) r7
            goto L35
        L30:
            java.lang.Object r7 = k6.AbstractC3258j.r(r7)
            goto L2d
        L35:
            i6.i r7 = r7.b()
            int r11 = r7.e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r7 = r7.e()
            int r9 = r9.length()
            int r9 = r9 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[r1]
            r9[r2] = r11
            r9[r0] = r7
            java.util.List r7 = R5.AbstractC1435t.p(r9)
        L58:
            if (r7 != 0) goto L5e
            java.util.List r7 = R5.AbstractC1435t.m()
        L5e:
            boolean r9 = r7.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto Lb5
            java.lang.Object r9 = R5.AbstractC1435t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r11 = R5.AbstractC1435t.y0(r7)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = 33
            r8.setSpan(r10, r9, r11, r0)
            android.content.Context r9 = r6.getContext()
            if (r9 != 0) goto L85
            goto Lb5
        L85:
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            S7.c r11 = r6.f3778k
            if (r11 != 0) goto L8c
            goto L8e
        L8c:
            java.lang.Integer r3 = r11.f9797l
        L8e:
            if (r3 != 0) goto L97
            int r11 = M1.a.f5916b
            int r9 = androidx.core.content.ContextCompat.getColor(r9, r11)
            goto L9b
        L97:
            int r9 = r3.intValue()
        L9b:
            r10.<init>(r9)
            java.lang.Object r9 = R5.AbstractC1435t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = R5.AbstractC1435t.y0(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8.setSpan(r10, r9, r7, r0)
        Lb5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.f.k(java.lang.String, android.text.SpannableString, java.lang.String, android.text.style.ClickableSpan, boolean):android.text.SpannableString");
    }

    public final void n() {
        int i8;
        Button button = this.f3772e;
        l lVar = null;
        if (button != null) {
            l lVar2 = this.f3775h;
            if (lVar2 == null) {
                AbstractC3292y.y("viewModel");
                lVar2 = null;
            }
            button.setText(lVar2.f3798h.f9861d);
            button.setOnClickListener(new View.OnClickListener() { // from class: I5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.q(f.this, view);
                }
            });
        }
        Button button2 = this.f3771d;
        if (button2 != null) {
            l lVar3 = this.f3775h;
            if (lVar3 == null) {
                AbstractC3292y.y("viewModel");
                lVar3 = null;
            }
            button2.setText(lVar3.f3798h.f9862e);
            l lVar4 = this.f3775h;
            if (lVar4 == null) {
                AbstractC3292y.y("viewModel");
                lVar4 = null;
            }
            if (lVar4.f3797g) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            button2.setVisibility(i8);
            button2.setOnClickListener(new View.OnClickListener() { // from class: I5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.l(f.this, view);
                }
            });
        }
        Button button3 = this.f3770c;
        if (button3 != null) {
            l lVar5 = this.f3775h;
            if (lVar5 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                lVar = lVar5;
            }
            button3.setText(R7.b.a(lVar.f3798h.f9860c));
            button3.setOnClickListener(new View.OnClickListener() { // from class: I5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.o(f.this, view);
                }
            });
        }
    }

    @Override // n.AbstractC3381a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore, "it.viewModelStore");
            this.f3775h = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // n.AbstractC3381a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        TextView textView;
        Map map;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        int i9 = 0;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        j(false);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        S7.b bVar = Y7.d.f13156e;
        if (bVar != null) {
            this.f3776i = bVar.f9784a;
            this.f3777j = bVar.f9785b;
        }
        this.f3778k = Y7.d.f13157f;
        TextView textView2 = this.f3774g;
        if (textView2 != null) {
            l lVar = this.f3775h;
            if (lVar == null) {
                AbstractC3292y.y("viewModel");
                lVar = null;
            }
            textView2.setText(lVar.f3798h.f9858a);
        }
        l lVar2 = this.f3775h;
        if (lVar2 == null) {
            AbstractC3292y.y("viewModel");
            lVar2 = null;
        }
        G6.e eVar = lVar2.f3791a.f1414a;
        if (eVar == null || (map = eVar.f3119i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((G6.l) entry.getValue()).f3137k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = lVar2.f3792b.f4498c.f4493a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1435t.b1(((J6.d) obj).f4491f);
            List list2 = lVar2.f3792b.f4497b.f4462h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1948c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        int size = lVar2.f3793c.f1371a.size() + arrayList.size() + i8;
        if (lVar2.f3794d != null) {
            i9 = 1;
        }
        String valueOf = String.valueOf(size + i9);
        l lVar3 = this.f3775h;
        if (lVar3 == null) {
            AbstractC3292y.y("viewModel");
            lVar3 = null;
        }
        String str = lVar3.f3798h.f9859b;
        if (C2001i.f15173b) {
            str = AbstractC3292y.q(str, lVar3.f3799i.f5406b.f5401c);
        }
        String x8 = l6.n.x(str, "${partners}", valueOf, true);
        SpannableString spannableString = new SpannableString(x8);
        l lVar4 = this.f3775h;
        if (lVar4 == null) {
            AbstractC3292y.y("viewModel");
            lVar4 = null;
        }
        k(x8, spannableString, lVar4.f3798h.f9863f, new i(this), false);
        l lVar5 = this.f3775h;
        if (lVar5 == null) {
            AbstractC3292y.y("viewModel");
            lVar5 = null;
        }
        k(x8, spannableString, lVar5.f3798h.f9865h, new j(this), true);
        TextView textView3 = this.f3773f;
        if (textView3 != null) {
            textView3.setText(spannableString);
        }
        TextView textView4 = this.f3773f;
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        n();
        S7.c cVar = this.f3778k;
        if (cVar != null) {
            Integer num = cVar.f9792g;
            if (num != null) {
                int intValue = num.intValue();
                ConstraintLayout constraintLayout = this.f3768a;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f9793h;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView5 = this.f3774g;
                if (textView5 != null) {
                    textView5.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f9794i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView6 = this.f3773f;
                if (textView6 != null) {
                    textView6.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f9798m;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                Button button = this.f3772e;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f3771d;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f9800o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f3772e;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f3771d;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f9797l;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f3770c;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f3776i;
        if (typeface != null) {
            TextView textView7 = this.f3774g;
            if (textView7 != null) {
                textView7.setTypeface(typeface);
            }
            Button button6 = this.f3772e;
            if (button6 != null) {
                button6.setTypeface(typeface);
            }
            Button button7 = this.f3771d;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f3770c;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f3777j;
        if (typeface2 != null && (textView = this.f3773f) != null) {
            textView.setTypeface(typeface2);
        }
        l lVar6 = this.f3775h;
        if (lVar6 == null) {
            AbstractC3292y.y("viewModel");
            lVar6 = null;
        }
        h result = new h(this);
        lVar6.getClass();
        AbstractC3292y.i(result, "result");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(lVar6), C3445b0.b(), null, new k(result, lVar6, null), 2, null);
    }
}
