package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f21269a = false;

    private static int a(View view, ViewGroup viewGroup) {
        int i8 = 0;
        while (i8 < viewGroup.getChildCount() && viewGroup.getChildAt(i8) != view) {
            i8++;
        }
        return i8;
    }

    private static boolean a(View view, View view2, int i8) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            return false;
        }
        int min = Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left);
        int min2 = Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top);
        return (i8 != 1 && (min * min2) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth()) || (i8 == 1 && min * min2 >= view.getMeasuredHeight() * view.getMeasuredWidth());
    }

    private static boolean a(View view, ViewGroup viewGroup, int i8) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            ad.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0 && a(view, childAt, i8)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    ad.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f21269a = true;
                }
                if (a(childAt)) {
                    ad.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f21269a = true;
                }
                if (f21269a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, i8);
                }
            }
        }
        return f21269a;
    }

    public static boolean a(View view, int i8) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            ad.b("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            ad.b("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            ad.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        boolean z8 = ((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * (i8 == 1 ? 0.0f : 0.5f);
        boolean z9 = globalVisibleRect && z8;
        ad.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z8);
        StringBuilder sb = new StringBuilder();
        sb.append("View Judge : totalViewVisible is ");
        sb.append(z9);
        ad.b("ViewUtils", sb.toString());
        if (!z9) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int a9 = a(view2, viewGroup) + 1; a9 < viewGroup.getChildCount(); a9++) {
                View childAt = viewGroup.getChildAt(a9);
                if (childAt.getVisibility() == 0 && a(view, childAt, i8)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            ad.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean a10 = a(view, viewGroup2, i8);
                            f21269a = false;
                            if (a10) {
                                return true;
                            }
                        }
                    }
                    if (a(childAt)) {
                        ad.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        ad.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    private static boolean a(View view) {
        return !(view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getBackground() != null && view.getBackground().getAlpha() > 127 && view.getAlpha() > 0.5f;
    }
}
