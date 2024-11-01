package com.uptodown.activities;

import Q5.InterfaceC1416k;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Gallery;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class Gallery extends AbstractActivityC2691a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f29533R = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f29535P;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29534O = Q5.l.b(new Function0() { // from class: F4.O
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.B d32;
            d32 = Gallery.d3(Gallery.this);
            return d32;
        }
    });

    /* renamed from: Q, reason: collision with root package name */
    private final d f29536Q = new d();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class b extends PagerAdapter {

        /* loaded from: classes4.dex */
        public static final class a implements com.squareup.picasso.A {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y4.C f29538a;

            a(Y4.C c8) {
                this.f29538a = c8;
            }

            @Override // com.squareup.picasso.A
            public void a(Exception e8, Drawable drawable) {
                AbstractC3292y.i(e8, "e");
                this.f29538a.f12107c.setVisibility(8);
            }

            @Override // com.squareup.picasso.A
            public void b(Drawable drawable) {
            }

            @Override // com.squareup.picasso.A
            public void c(Bitmap bitmap, s.e from) {
                AbstractC3292y.i(bitmap, "bitmap");
                AbstractC3292y.i(from, "from");
                this.f29538a.f12106b.setImage(ImageSource.bitmap(bitmap));
                this.f29538a.f12107c.setVisibility(8);
            }
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Gallery gallery, View view) {
            if (UptodownApp.f29249C.a0()) {
                if (gallery.e3().f12084c.getVisibility() == 0) {
                    gallery.e3().f12084c.startAnimation(AnimationUtils.loadAnimation(gallery, R.anim.slide_to_top_toolbar));
                    gallery.e3().f12084c.setVisibility(8);
                } else {
                    gallery.e3().f12084c.startAnimation(AnimationUtils.loadAnimation(gallery, R.anim.slide_in_top_toolbar));
                    gallery.e3().f12084c.setVisibility(0);
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int i8, Object item) {
            AbstractC3292y.i(container, "container");
            AbstractC3292y.i(item, "item");
            container.removeView((RelativeLayout) item);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (Gallery.this.f29535P != null) {
                ArrayList arrayList = Gallery.this.f29535P;
                AbstractC3292y.f(arrayList);
                return arrayList.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int i8) {
            AbstractC3292y.i(container, "container");
            Y4.C c8 = Y4.C.c(LayoutInflater.from(container.getContext()), container, false);
            AbstractC3292y.h(c8, "inflate(...)");
            c8.f12107c.setVisibility(0);
            a aVar = new a(c8);
            c8.f12106b.setTag(aVar);
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            ArrayList arrayList = Gallery.this.f29535P;
            AbstractC3292y.f(arrayList);
            h8.l(((c5.N) arrayList.get(i8)).i()).l(R.drawable.shape_bg_placeholder).k(aVar);
            container.addView(c8.getRoot());
            SubsamplingScaleImageView subsamplingScaleImageView = c8.f12106b;
            final Gallery gallery = Gallery.this;
            subsamplingScaleImageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Gallery.b.b(Gallery.this, view);
                }
            });
            RelativeLayout root = c8.getRoot();
            AbstractC3292y.h(root, "getRoot(...)");
            return root;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object object) {
            AbstractC3292y.i(view, "view");
            AbstractC3292y.i(object, "object");
            return view == object;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewPager.OnPageChangeListener {
        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            Gallery.this.h3(i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends OnBackPressedCallback {
        d() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Gallery.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.B d3(Gallery gallery) {
        return Y4.B.c(gallery.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.B e3() {
        return (Y4.B) this.f29534O.getValue();
    }

    private final void f3(int i8) {
        e3().f12086e.setAdapter(new b());
        if (i8 > 0) {
            e3().f12086e.setCurrentItem(i8);
        }
        e3().f12086e.addOnPageChangeListener(new c());
        h3(i8);
        e3().f12085d.setTypeface(J4.j.f4395g.u());
        e3().f12083b.setOnClickListener(new View.OnClickListener() { // from class: F4.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Gallery.g3(Gallery.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(Gallery gallery, View view) {
        gallery.f29536Q.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3(int i8) {
        Integer num;
        TextView textView = e3().f12085d;
        Integer valueOf = Integer.valueOf(i8 + 1);
        ArrayList arrayList = this.f29535P;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        textView.setText(getString(R.string.gallery_item_count, valueOf, num));
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i8;
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        setContentView(e3().getRoot());
        Window window = getWindow();
        AbstractC3292y.h(window, "getWindow(...)");
        O2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f29536Q);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("bundle")) != null) {
            if (bundleExtra.containsKey("images")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images", c5.N.class);
                } else {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images");
                }
                this.f29535P = parcelableArrayList;
            }
            if (bundleExtra.containsKey("index")) {
                i8 = bundleExtra.getInt("index");
                f3(i8);
            }
        }
        i8 = 0;
        f3(i8);
    }
}
