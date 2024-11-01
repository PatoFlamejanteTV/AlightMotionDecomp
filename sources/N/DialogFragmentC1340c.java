package N;

import Q.AbstractC1396p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogFragmentC1340c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f6355a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f6356b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f6357c;

    public static DialogFragmentC1340c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1340c dialogFragmentC1340c = new DialogFragmentC1340c();
        Dialog dialog2 = (Dialog) AbstractC1396p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1340c.f6355a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1340c.f6356b = onCancelListener;
        }
        return dialogFragmentC1340c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6356b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f6355a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f6357c == null) {
                this.f6357c = new AlertDialog.Builder((Context) AbstractC1396p.l(getActivity())).create();
            }
            return this.f6357c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
