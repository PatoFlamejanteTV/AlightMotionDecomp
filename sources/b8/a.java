package b8;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f15084a;

    /* renamed from: b, reason: collision with root package name */
    public b f15085b;

    /* renamed from: c, reason: collision with root package name */
    public String f15086c;

    /* renamed from: d, reason: collision with root package name */
    public String f15087d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f15088e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f15089f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f15090g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f15091h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f15092i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f15093j;

    /* renamed from: b8.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0368a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f15094a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f15095b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f15096c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f15097d;

        /* renamed from: e, reason: collision with root package name */
        public final View f15098e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0368a(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            this.f15094a = num;
            this.f15095b = num2;
            this.f15096c = typeface;
            View findViewById = rootView.findViewById(M1.b.f5964V0);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.tv_non_switch_label)");
            this.f15097d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(M1.b.f5925C);
            AbstractC3292y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f15098e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void b(b8.d dVar);

        void e(b8.d dVar);
    }

    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f15099a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f15100b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f15101c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f15102d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            this.f15099a = num;
            this.f15100b = num2;
            this.f15101c = typeface;
            View findViewById = rootView.findViewById(M1.b.f6014n1);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.tv_switch_description)");
            this.f15102d = (TextView) findViewById;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f15103a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f15104b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f15105c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f15106d;

        /* renamed from: e, reason: collision with root package name */
        public final View f15107e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            this.f15103a = num;
            this.f15104b = num2;
            this.f15105c = typeface;
            View findViewById = rootView.findViewById(M1.b.f6017o1);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.tv_switch_label)");
            this.f15106d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(M1.b.f5925C);
            AbstractC3292y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f15107e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final b f15108a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f15109b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f15110c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f15111d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f15112e;

        /* renamed from: f, reason: collision with root package name */
        public final Typeface f15113f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f15114g;

        /* renamed from: h, reason: collision with root package name */
        public final SwitchCompat f15115h;

        /* renamed from: i, reason: collision with root package name */
        public final View f15116i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View rootView, b listener, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            AbstractC3292y.i(listener, "listener");
            this.f15108a = listener;
            this.f15109b = num;
            this.f15110c = num2;
            this.f15111d = num3;
            this.f15112e = num4;
            this.f15113f = typeface;
            View findViewById = rootView.findViewById(M1.b.f6020p1);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.tv_switch_name)");
            this.f15114g = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(M1.b.f5998i0);
            AbstractC3292y.h(findViewById2, "rootView.findViewById(R.id.switch_item)");
            this.f15115h = (SwitchCompat) findViewById2;
            View findViewById3 = rootView.findViewById(M1.b.f5937I);
            AbstractC3292y.h(findViewById3, "rootView.findViewById(R.id.line_item)");
            this.f15116i = findViewById3;
        }

        public static final void a(e this$0, b8.d switchItem, View view) {
            AbstractC3292y.i(this$0, "this$0");
            AbstractC3292y.i(switchItem, "$switchItem");
            this$0.f15108a.e(switchItem);
        }

        public static final void b(b8.d switchItem, e this$0, String tag, CompoundButton compoundButton, boolean z8) {
            AbstractC3292y.i(switchItem, "$switchItem");
            AbstractC3292y.i(this$0, "this$0");
            AbstractC3292y.i(tag, "$tag");
            switchItem.f15123b = Boolean.valueOf(z8);
            this$0.f15108a.b(switchItem);
            boolean z9 = switchItem.f15126e;
            SwitchCompat switchCompat = this$0.f15115h;
            if (switchCompat.isChecked() || !z9) {
                tag = "";
            }
            switchCompat.setText(tag);
        }

        public final void c(final b8.d switchItem, final String tag) {
            boolean booleanValue;
            String str;
            AbstractC3292y.i(switchItem, "switchItem");
            AbstractC3292y.i(tag, "tag");
            TextView textView = this.f15114g;
            String name = switchItem.f15122a.f3124b;
            Integer num = switchItem.f15128g;
            String noun = switchItem.f15127f;
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(noun, "noun");
            if (num != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" (");
                sb.append(num);
                sb.append(' ');
                String lowerCase = noun.toLowerCase(Locale.ROOT);
                AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                sb.append(')');
                name = sb.toString();
            }
            textView.setText(name);
            Integer num2 = this.f15109b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: b8.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.e.a(a.e.this, switchItem, view);
                }
            });
            Typeface typeface = this.f15113f;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            SwitchCompat switchCompat = this.f15115h;
            if (switchItem.f15123b == null) {
                switchCompat.setVisibility(8);
            } else {
                switchCompat.setVisibility(0);
                Boolean bool = switchItem.f15123b;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                switchCompat.setChecked(booleanValue);
            }
            switchCompat.setContentDescription(switchItem.f15122a.f3124b);
            boolean z8 = switchItem.f15126e;
            SwitchCompat switchCompat2 = this.f15115h;
            if (!switchCompat2.isChecked() && z8) {
                str = tag;
            } else {
                str = "";
            }
            switchCompat2.setText(str);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b8.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                    a.e.b(d.this, this, tag, compoundButton, z9);
                }
            });
            Integer num3 = this.f15110c;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = this.f15111d;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{intValue, intValue2}));
                    switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{ColorUtils.setAlphaComponent(intValue, 128), ColorUtils.setAlphaComponent(intValue2, 128)}));
                }
            }
            Integer num5 = this.f15109b;
            if (num5 != null) {
                switchCompat.setTextColor(num5.intValue());
            }
            Typeface typeface2 = this.f15113f;
            if (typeface2 != null) {
                switchCompat.setTypeface(typeface2);
            }
            Integer num6 = this.f15112e;
            if (num6 != null) {
                this.f15116i.setBackgroundColor(num6.intValue());
            }
        }
    }

    public /* synthetic */ a(List list, b bVar, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2, int i8) {
        this(list, bVar, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2, (i8 & 64) != 0 ? null : num3, (i8 & 128) != 0 ? null : num4, (i8 & 256) != 0 ? null : typeface, (i8 & 512) != 0 ? null : typeface2);
    }

    public final void a() {
        this.f15084a.add(0, new b8.d(new G6.f(0, null, 3), null, f.DESCRIPTION, null, false, null, null, 122));
    }

    public final void b(List switchItems, boolean z8) {
        AbstractC3292y.i(switchItems, "switchItems");
        this.f15084a = switchItems;
        if (!z8) {
            a();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15084a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((b8.d) this.f15084a.get(i8)).f15124c.f15149a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).c((b8.d) this.f15084a.get(i8), this.f15087d);
            return;
        }
        if (holder instanceof c) {
            c cVar = (c) holder;
            String descriptionText = this.f15086c;
            cVar.getClass();
            AbstractC3292y.i(descriptionText, "descriptionText");
            TextView textView = cVar.f15102d;
            textView.setText(descriptionText);
            Integer num = cVar.f15099a;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = cVar.f15101c;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            Integer num2 = cVar.f15100b;
            if (num2 != null) {
                int intValue = num2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(2.0f);
                gradientDrawable.setStroke(4, intValue);
                textView.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        if (holder instanceof d) {
            d dVar = (d) holder;
            String labelText = ((b8.d) this.f15084a.get(i8)).f15127f;
            dVar.getClass();
            AbstractC3292y.i(labelText, "labelText");
            TextView textView2 = dVar.f15106d;
            textView2.setText(labelText);
            Integer num3 = dVar.f15103a;
            if (num3 != null) {
                textView2.setTextColor(num3.intValue());
            }
            Typeface typeface2 = dVar.f15105c;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
            }
            Integer num4 = dVar.f15104b;
            if (num4 != null) {
                dVar.f15107e.setBackgroundColor(num4.intValue());
                return;
            }
            return;
        }
        if (holder instanceof C0368a) {
            C0368a c0368a = (C0368a) holder;
            String labelText2 = ((b8.d) this.f15084a.get(i8)).f15127f;
            c0368a.getClass();
            AbstractC3292y.i(labelText2, "labelText");
            TextView textView3 = c0368a.f15097d;
            textView3.setText(labelText2);
            Integer num5 = c0368a.f15094a;
            if (num5 != null) {
                textView3.setTextColor(num5.intValue());
            }
            Typeface typeface3 = c0368a.f15096c;
            if (typeface3 != null) {
                textView3.setTypeface(typeface3);
            }
            Integer num6 = c0368a.f15095b;
            if (num6 != null) {
                c0368a.f15098e.setBackgroundColor(num6.intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        if (i8 == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6061s, parent, false);
            AbstractC3292y.h(view, "view");
            return new c(view, this.f15088e, this.f15091h, this.f15093j);
        }
        if (i8 == 2) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6062t, parent, false);
            AbstractC3292y.h(view2, "view");
            return new d(view2, this.f15088e, this.f15091h, this.f15092i);
        }
        if (i8 == 3) {
            View view3 = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6058p, parent, false);
            AbstractC3292y.h(view3, "view");
            return new C0368a(view3, this.f15088e, this.f15091h, this.f15093j);
        }
        View view4 = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6060r, parent, false);
        AbstractC3292y.h(view4, "view");
        return new e(view4, this.f15085b, this.f15088e, this.f15089f, this.f15090g, this.f15091h, this.f15093j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        AbstractC3292y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).f15115h.setOnCheckedChangeListener(null);
        }
        super.onViewRecycled(holder);
    }

    public a(List switchItems, b listener, String descriptionItemText, String switchTagText, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2) {
        AbstractC3292y.i(switchItems, "switchItems");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(descriptionItemText, "descriptionItemText");
        AbstractC3292y.i(switchTagText, "switchTagText");
        this.f15084a = switchItems;
        this.f15085b = listener;
        this.f15086c = descriptionItemText;
        this.f15087d = switchTagText;
        this.f15088e = num;
        this.f15089f = num2;
        this.f15090g = num3;
        this.f15091h = num4;
        this.f15092i = typeface;
        this.f15093j = typeface2;
        if (descriptionItemText.length() > 0) {
            a();
        }
    }
}
