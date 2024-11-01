package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class VectorEnabledTintResources extends ResourcesWrapper {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled = false;
    private final WeakReference<Context> mContextRef;

    public VectorEnabledTintResources(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return sCompatVectorFromResourcesEnabled;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z8) {
        sCompatVectorFromResourcesEnabled = z8;
    }

    public static boolean shouldBeUsed() {
        isCompatVectorFromResourcesEnabled();
        return false;
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i8) throws Resources.NotFoundException {
        return super.getAnimation(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i8) throws Resources.NotFoundException {
        return super.getBoolean(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i8) throws Resources.NotFoundException {
        return super.getColor(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i8) throws Resources.NotFoundException {
        return super.getColorStateList(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i8) throws Resources.NotFoundException {
        return super.getDimension(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i8) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i8) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @RequiresApi(21)
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i8, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i8, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i8, int i9) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i8, i9);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i8, int i9, int i10) {
        return super.getFraction(i8, i9, i10);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i8) throws Resources.NotFoundException {
        return super.getIntArray(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i8) throws Resources.NotFoundException {
        return super.getInteger(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i8) throws Resources.NotFoundException {
        return super.getLayout(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i8) throws Resources.NotFoundException {
        return super.getMovie(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i8, int i9) throws Resources.NotFoundException {
        return super.getQuantityString(i8, i9);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i8, int i9) throws Resources.NotFoundException {
        return super.getQuantityText(i8, i9);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i8) throws Resources.NotFoundException {
        return super.getResourceEntryName(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i8) throws Resources.NotFoundException {
        return super.getResourceName(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i8) throws Resources.NotFoundException {
        return super.getResourcePackageName(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i8) throws Resources.NotFoundException {
        return super.getResourceTypeName(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i8) throws Resources.NotFoundException {
        return super.getString(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i8) throws Resources.NotFoundException {
        return super.getStringArray(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i8) throws Resources.NotFoundException {
        return super.getText(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i8) throws Resources.NotFoundException {
        return super.getTextArray(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i8, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        super.getValue(i8, typedValue, z8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i8, int i9, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        super.getValueForDensity(i8, i9, typedValue, z8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i8) throws Resources.NotFoundException {
        return super.getXml(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i8) throws Resources.NotFoundException {
        return super.obtainTypedArray(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i8) throws Resources.NotFoundException {
        return super.openRawResource(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i8) throws Resources.NotFoundException {
        return super.openRawResourceFd(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i8) throws Resources.NotFoundException {
        Context context = this.mContextRef.get();
        if (context != null) {
            return ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i8);
        }
        return getDrawableCanonical(i8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    @RequiresApi(21)
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i8, int i9, Resources.Theme theme) {
        return super.getDrawableForDensity(i8, i9, theme);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i8, int i9, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i8, i9, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i8, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i8, objArr);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i8, CharSequence charSequence) {
        return super.getText(i8, charSequence);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z8);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i8, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i8, typedValue);
    }
}
