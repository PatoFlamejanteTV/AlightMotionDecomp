package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i8) {
        return createNavigateOnClickListener$default(i8, null, 2, null);
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i8, Bundle bundle, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i8, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$0(int i8, Bundle bundle, View view) {
        AbstractC3292y.h(view, "view");
        findNavController(view).navigate(i8, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$1(NavDirections directions, View view) {
        AbstractC3292y.i(directions, "$directions");
        AbstractC3292y.h(view, "view");
        findNavController(view).navigate(directions);
    }

    public static final NavController findNavController(Activity activity, @IdRes int i8) {
        AbstractC3292y.i(activity, "activity");
        View requireViewById = ActivityCompat.requireViewById(activity, i8);
        AbstractC3292y.h(requireViewById, "requireViewById<View>(activity, viewId)");
        NavController findViewNavController = INSTANCE.findViewNavController(requireViewById);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i8);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) AbstractC3258j.s(AbstractC3258j.z(AbstractC3258j.h(view, Navigation$findViewNavController$1.INSTANCE), Navigation$findViewNavController$2.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static final void setViewNavController(View view, NavController navController) {
        AbstractC3292y.i(view, "view");
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes final int i8, final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$0(i8, bundle, view);
            }
        };
    }

    public static final View.OnClickListener createNavigateOnClickListener(final NavDirections directions) {
        AbstractC3292y.i(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$1(NavDirections.this, view);
            }
        };
    }

    public static final NavController findNavController(View view) {
        AbstractC3292y.i(view, "view");
        NavController findViewNavController = INSTANCE.findViewNavController(view);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
