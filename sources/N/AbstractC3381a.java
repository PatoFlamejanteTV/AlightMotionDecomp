package n;

import M1.b;
import M1.c;
import M1.f;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3381a extends BottomSheetDialogFragment {
    public final void h() {
        FragmentActivity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            activity.isFinishing();
            if ((!true) && isResumed()) {
                dismiss();
            }
        }
    }

    public abstract void i(ViewStub viewStub);

    public final void j(boolean z8) {
        View findViewById;
        Dialog dialog = getDialog();
        if (dialog == null) {
            findViewById = null;
        } else {
            findViewById = dialog.findViewById(R.id.design_bottom_sheet);
        }
        if (findViewById != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
            AbstractC3292y.h(from, "from(bottomSheetView as View)");
            from.setDraggable(z8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        AbstractC3292y.i(dialog, "dialog");
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, f.f6086b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(c.f6043a, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…_sheet, container, false)");
        ViewStub viewStub = (ViewStub) inflate.findViewById(b.f6027s);
        if (viewStub != null) {
            i(viewStub);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        Resources resources;
        DisplayMetrics displayMetrics;
        super.onResume();
        View view2 = getView();
        if (view2 != null) {
            Object parent = view2.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view != null) {
                BottomSheetBehavior from = BottomSheetBehavior.from(view);
                AbstractC3292y.h(from, "from(parentView)");
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    int i8 = displayMetrics.heightPixels;
                    from.setPeekHeight(i8);
                    ViewStub viewStub = (ViewStub) view.findViewById(b.f6027s);
                    if (viewStub != null) {
                        viewStub.inflate().setMinimumHeight((int) (i8 * 0.25d));
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
    }
}
