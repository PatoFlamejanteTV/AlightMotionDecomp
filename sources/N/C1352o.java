package N;

import Q.AbstractC1396p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: N.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1352o extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f6379a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f6380b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f6381c;

    public static C1352o h(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1352o c1352o = new C1352o();
        Dialog dialog2 = (Dialog) AbstractC1396p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1352o.f6379a = dialog2;
        if (onCancelListener != null) {
            c1352o.f6380b = onCancelListener;
        }
        return c1352o;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6380b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f6379a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f6381c == null) {
                this.f6381c = new AlertDialog.Builder((Context) AbstractC1396p.l(getContext())).create();
            }
            return this.f6381c;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
