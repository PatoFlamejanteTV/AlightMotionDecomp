package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes4.dex */
public class ActionBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private WebView f21713a;

    /* loaded from: classes4.dex */
    public interface a {
        View a();

        void a(View view, WebView webView);
    }

    public ActionBar(Context context) {
        super(context);
    }

    public void addAction(a aVar) {
        addAction(aVar, getChildCount());
    }

    public int getActionCount() {
        return getChildCount();
    }

    public WebView getWebView() {
        return this.f21713a;
    }

    public View newActionItem() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        View frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof a) {
            ((a) tag).a(view, this.f21713a);
        }
    }

    public boolean removeAction(a aVar) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof a) && tag.equals(aVar)) {
                    removeView(childAt);
                    return true;
                }
            }
        }
        return false;
    }

    public void removeActionAt(int i8) {
        if (i8 >= 0 && i8 < getChildCount()) {
            removeViewAt(i8);
        }
    }

    public void removeAllActions() {
        removeAllViews();
    }

    public void setWebView(WebView webView) {
        this.f21713a = webView;
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addAction(a aVar, int i8) {
        View view;
        View a9 = aVar.a();
        if (a9 != null) {
            view = newActionItem();
            ((ViewGroup) ((ViewGroup) view).getChildAt(0)).addView(a9);
            a9.setTag(aVar);
            a9.setOnClickListener(this);
        } else {
            view = null;
        }
        addView(view, i8);
    }
}
