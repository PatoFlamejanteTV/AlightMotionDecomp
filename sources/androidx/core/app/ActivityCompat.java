package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ActivityCompat extends ContextCompat {
    private static PermissionCompatDelegate sDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static void finishAfterTransition(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        static void postponeEnterTransition(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        static void setEnterSharedElementCallback(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        static void setExitSharedElementCallback(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        static void startPostponedEnterTransition(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi(22)
    /* loaded from: classes.dex */
    static class Api22Impl {
        private Api22Impl() {
        }

        @DoNotInline
        static Uri getReferrer(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @DoNotInline
        public static void onSharedElementsReady(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        static void requestPermissions(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }

        @DoNotInline
        static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RequiresApi(28)
    /* loaded from: classes.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static <T> T requireViewById(Activity activity, int i8) {
            return (T) activity.requireViewById(i8);
        }
    }

    @RequiresApi(30)
    /* loaded from: classes.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static Display getDisplay(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @DoNotInline
        static void setLocusContext(@NonNull Activity activity, @Nullable LocusIdCompat locusIdCompat, @Nullable Bundle bundle) {
            LocusId locusId;
            if (locusIdCompat == null) {
                locusId = null;
            } else {
                locusId = locusIdCompat.toLocusId();
            }
            activity.setLocusContext(locusId, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static boolean isLaunchedFromBubble(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(32)
    /* loaded from: classes.dex */
    public static class Api32Impl {
        private Api32Impl() {
        }

        @DoNotInline
        static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(@NonNull Activity activity, @IntRange(from = 0) int i8, int i9, @Nullable Intent intent);

        boolean requestPermissions(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final SharedElementCallback mCallback;

        SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.mCallback.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.mCallback.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.mCallback.onSharedElementsArrived(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() { // from class: androidx.core.app.b
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void onSharedElementsReady() {
                    ActivityCompat.Api23Impl.onSharedElementsReady(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected ActivityCompat() {
    }

    public static void finishAffinity(@NonNull Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(@NonNull Activity activity) {
        Api21Impl.finishAfterTransition(activity);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    @Nullable
    public static Uri getReferrer(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return Api22Impl.getReferrer(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(@NonNull Activity activity) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            return Api31Impl.isLaunchedFromBubble(activity);
        }
        if (i8 == 30) {
            if (Api30Impl.getDisplay(activity) != null && Api30Impl.getDisplay(activity).getDisplayId() != 0) {
                return true;
            }
            return false;
        }
        if (i8 == 29 && activity.getWindowManager().getDefaultDisplay() != null && activity.getWindowManager().getDefaultDisplay().getDisplayId() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recreate$0(Activity activity) {
        if (!activity.isFinishing() && !ActivityRecreator.recreate(activity)) {
            activity.recreate();
        }
    }

    public static void postponeEnterTransition(@NonNull Activity activity) {
        Api21Impl.postponeEnterTransition(activity);
    }

    public static void recreate(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityCompat.lambda$recreate$0(activity);
                }
            });
        }
    }

    @Nullable
    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        return DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(@NonNull final Activity activity, @NonNull String[] strArr, @IntRange(from = 0) final int i8) {
        final String[] strArr2;
        PermissionCompatDelegate permissionCompatDelegate = sDelegate;
        if (permissionCompatDelegate != null && permissionCompatDelegate.requestPermissions(activity, strArr, i8)) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (!TextUtils.isEmpty(strArr[i9])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i9], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i9));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr2[i10] = strArr[i11];
                    i10++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i8);
            }
            Api23Impl.requestPermissions(activity, strArr, i8);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.ActivityCompat.1
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[strArr2.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr2.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr[i12] = packageManager.checkPermission(strArr2[i12], packageName);
                    }
                    ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i8, strArr2, iArr);
                }
            });
        }
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Activity activity, @IdRes int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(activity, i8);
        }
        T t8 = (T) activity.findViewById(i8);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallback21Impl sharedElementCallback21Impl;
        if (sharedElementCallback != null) {
            sharedElementCallback21Impl = new SharedElementCallback21Impl(sharedElementCallback);
        } else {
            sharedElementCallback21Impl = null;
        }
        Api21Impl.setEnterSharedElementCallback(activity, sharedElementCallback21Impl);
    }

    public static void setExitSharedElementCallback(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallback21Impl sharedElementCallback21Impl;
        if (sharedElementCallback != null) {
            sharedElementCallback21Impl = new SharedElementCallback21Impl(sharedElementCallback);
        } else {
            sharedElementCallback21Impl = null;
        }
        Api21Impl.setExitSharedElementCallback(activity, sharedElementCallback21Impl);
    }

    public static void setLocusContext(@NonNull Activity activity, @Nullable LocusIdCompat locusIdCompat, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setLocusContext(activity, locusIdCompat, bundle);
        }
    }

    public static void setPermissionCompatDelegate(@Nullable PermissionCompatDelegate permissionCompatDelegate) {
        sDelegate = permissionCompatDelegate;
    }

    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity activity, @NonNull String str) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i8 >= 32) {
            return Api32Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        if (i8 == 31) {
            return Api31Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        if (i8 < 23) {
            return false;
        }
        return Api23Impl.shouldShowRequestPermissionRationale(activity, str);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i8, @Nullable Bundle bundle) {
        activity.startActivityForResult(intent, i8, bundle);
    }

    public static void startIntentSenderForResult(@NonNull Activity activity, @NonNull IntentSender intentSender, int i8, @Nullable Intent intent, int i9, int i10, int i11, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public static void startPostponedEnterTransition(@NonNull Activity activity) {
        Api21Impl.startPostponedEnterTransition(activity);
    }
}
