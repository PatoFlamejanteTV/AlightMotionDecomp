package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final w f24493a;

    /* renamed from: b, reason: collision with root package name */
    final WeakReference f24494b;

    /* renamed from: c, reason: collision with root package name */
    m2.b f24495c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(w wVar, ImageView imageView, m2.b bVar) {
        this.f24493a = wVar;
        this.f24494b = new WeakReference(imageView);
        this.f24495c = bVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f24493a.b();
        this.f24495c = null;
        ImageView imageView = (ImageView) this.f24494b.get();
        if (imageView == null) {
            return;
        }
        this.f24494b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f24494b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f24494b.clear();
            this.f24493a.o().m(width, height).j(imageView, this.f24495c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
