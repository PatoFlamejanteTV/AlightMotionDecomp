package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final String LOG_TAG = "ReceiveContent";

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        @DoNotInline
        static boolean onDropForTextView(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @DoNotInline
        static boolean onDropForView(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    private AppCompatReceiveContentHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean maybeHandleDragEventViaPerformReceiveContent(@NonNull View view, @NonNull DragEvent dragEvent) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31 && i8 >= 24 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(view) != null) {
            Activity tryGetActivity = tryGetActivity(view);
            if (tryGetActivity == null) {
                Log.i(LOG_TAG, "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return OnDropApi24Impl.onDropForTextView(dragEvent, (TextView) view, tryGetActivity);
                }
                return OnDropApi24Impl.onDropForView(dragEvent, view, tryGetActivity);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean maybeHandleMenuActionViaPerformReceiveContent(@NonNull TextView textView, int i8) {
        ClipData primaryClip;
        int i9 = 0;
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes(textView) == null || (i8 != 16908322 && i8 != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ContentInfoCompat.Builder builder = new ContentInfoCompat.Builder(primaryClip, 1);
            if (i8 != 16908322) {
                i9 = 1;
            }
            ViewCompat.performReceiveContent(textView, builder.setFlags(i9).build());
        }
        return true;
    }

    @Nullable
    static Activity tryGetActivity(@NonNull View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
