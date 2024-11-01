package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public final class InputConnectionCompat {
    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final String LOG_TAG = "InputConnectionCompat";

    @RequiresApi(25)
    /* loaded from: classes3.dex */
    static class Api25Impl {
        private Api25Impl() {
        }

        @DoNotInline
        static boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i8, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i8, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public interface OnCommitContentListener {
        boolean onCommitContent(@NonNull InputContentInfoCompat inputContentInfoCompat, int i8, @Nullable Bundle bundle);
    }

    @Deprecated
    public InputConnectionCompat() {
    }

    public static boolean commitContent(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull InputContentInfoCompat inputContentInfoCompat, int i8, @Nullable Bundle bundle) {
        boolean z8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25Impl.commitContent(inputConnection, c.a(inputContentInfoCompat.unwrap()), i8, bundle);
        }
        int protocol = EditorInfoCompat.getProtocol(editorInfo);
        if (protocol != 2) {
            z8 = false;
            if (protocol != 3 && protocol != 4) {
                return false;
            }
        } else {
            z8 = true;
        }
        Bundle bundle2 = new Bundle();
        if (z8) {
            str = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
        } else {
            str = COMMIT_CONTENT_CONTENT_URI_KEY;
        }
        bundle2.putParcelable(str, inputContentInfoCompat.getContentUri());
        if (z8) {
            str2 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
        } else {
            str2 = COMMIT_CONTENT_DESCRIPTION_KEY;
        }
        bundle2.putParcelable(str2, inputContentInfoCompat.getDescription());
        if (z8) {
            str3 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
        } else {
            str3 = COMMIT_CONTENT_LINK_URI_KEY;
        }
        bundle2.putParcelable(str3, inputContentInfoCompat.getLinkUri());
        if (z8) {
            str4 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
        } else {
            str4 = COMMIT_CONTENT_FLAGS_KEY;
        }
        bundle2.putInt(str4, i8);
        if (z8) {
            str5 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
        } else {
            str5 = COMMIT_CONTENT_OPTS_KEY;
        }
        bundle2.putParcelable(str5, bundle);
        if (z8) {
            str6 = COMMIT_CONTENT_INTEROP_ACTION;
        } else {
            str6 = COMMIT_CONTENT_ACTION;
        }
        return inputConnection.performPrivateCommand(str6, bundle2);
    }

    @NonNull
    private static OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(@NonNull final View view) {
        Preconditions.checkNotNull(view);
        return new OnCommitContentListener() { // from class: androidx.core.view.inputmethod.d
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i8, Bundle bundle) {
                boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0;
                lambda$createOnCommitContentListenerUsingPerformReceiveContent$0 = InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(view, inputContentInfoCompat, i8, bundle);
                return lambda$createOnCommitContentListenerUsingPerformReceiveContent$0;
            }
        };
    }

    @NonNull
    @Deprecated
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull final OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        boolean z8 = false;
        if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, z8) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
                    if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i8, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i8, bundle);
                }
            };
        }
        return EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection, z8) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean handlePerformPrivateCommand(@Nullable String str, @Nullable Bundle bundle, @NonNull OnCommitContentListener onCommitContentListener) {
        boolean z8;
        String str2;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
            z8 = false;
        } else {
            if (!TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
                return false;
            }
            z8 = true;
        }
        if (z8) {
            str2 = COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY;
        } else {
            str2 = COMMIT_CONTENT_RESULT_RECEIVER_KEY;
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
            if (z8) {
                str3 = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
            } else {
                str3 = COMMIT_CONTENT_CONTENT_URI_KEY;
            }
        } catch (Throwable th) {
            th = th;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(str3);
            if (z8) {
                str4 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
            } else {
                str4 = COMMIT_CONTENT_DESCRIPTION_KEY;
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
            if (z8) {
                str5 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
            } else {
                str5 = COMMIT_CONTENT_LINK_URI_KEY;
            }
            Uri uri2 = (Uri) bundle.getParcelable(str5);
            if (z8) {
                str6 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
            } else {
                str6 = COMMIT_CONTENT_FLAGS_KEY;
            }
            int i8 = bundle.getInt(str6);
            if (z8) {
                str7 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
            } else {
                str7 = COMMIT_CONTENT_OPTS_KEY;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
            if (uri != null && clipDescription != null) {
                r02 = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i8, bundle2);
            }
            if (resultReceiver2 != 0) {
                resultReceiver2.send(r02, null);
            }
            return r02;
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(View view, InputContentInfoCompat inputContentInfoCompat, int i8, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i8 & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                Parcelable parcelable = (Parcelable) inputContentInfoCompat.unwrap();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(EXTRA_INPUT_CONTENT_INFO, parcelable);
            } catch (Exception e8) {
                Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e8);
                return false;
            }
        }
        if (ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) != null) {
            return false;
        }
        return true;
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, createOnCommitContentListenerUsingPerformReceiveContent(view));
    }
}
